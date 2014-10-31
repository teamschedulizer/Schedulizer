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
public class AvailabilitySvcSIOImpl implements IAvailabilitySvc {
    private final String AVAILABILITY_FILE = "Availability.sio";
    private Map<Integer, Availability> availability = new HashMap<Integer, Availability>();
    
    public AvailabilitySvcSIOImpl()
    {
        init();
    }
    
    private void init()
    {
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(AVAILABILITY_FILE));
            availability = (Map<Integer, Availability>)ois.readObject();
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
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(AVAILABILITY_FILE));
            oos.writeObject(availability);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            throw new ServiceException(e.getMessage());
        }
    }
    
    @Override
    public Availability get(Account account)
    {
        return availability.get(account.getId());
    }
    
    @Override
    public boolean submit(Account account, Availability availability)
    {
        try
        {
            this.availability.put(account.getId(), availability);
            updateFile();
            return true;
        }
        catch (ServiceException e)
        {
            return false;
        }
    }
}
