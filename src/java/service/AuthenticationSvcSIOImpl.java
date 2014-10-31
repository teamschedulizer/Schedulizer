/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author chutto001
 */
public class AuthenticationSvcSIOImpl implements IAuthenticationSvc {
    private Map<String, String> logins = new HashMap<String, String>();
    private final String LOGINS_FILE = "Logins.sio";
    
    public AuthenticationSvcSIOImpl()
    {
        init();
    }
    
    private void init()
    {
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(LOGINS_FILE));
            logins = (Map<String, String>)ois.readObject();
            ois.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    private void updateFile() throws ServiceException
    {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(LOGINS_FILE));
            oos.writeObject(logins);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            throw new ServiceException(e.getMessage());
        }
    }
    
    @Override
    public boolean authenticate(Login login)
    {
        if (logins.containsKey(login.getUsername()))
        {
            if (logins.get(login.getUsername()).equals(login.getPassword()))
                return true;
            else
                return false;
        }
        else
            return false;
    }
    
    @Override
    public boolean store(Login login)
    {
        try
        {
            logins.put(login.getUsername(), login.getPassword());
            updateFile();
            return true;
        }
        catch (ServiceException e)
        {
            return false;
        }
    }
}
