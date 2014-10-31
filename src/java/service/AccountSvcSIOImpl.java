/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.*;
import java.io.*;
import java.util.*;

/**
 * Stores object 
 * @author chutto001
 */
public class AccountSvcSIOImpl implements IAccountSvc {
    private List<Account> accounts = new LinkedList<Account>();
    private final String ACCOUNTS_FILE = "Accounts.sio";
    
    public AccountSvcSIOImpl()
    {
        init();
    }
    
    private void init()
    {
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ACCOUNTS_FILE));
            accounts = (List<Account>)ois.readObject();
            ois.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    private boolean has(Account acc)
    {
        if (!accounts.isEmpty())
        {
            Iterator<Account> iter = accounts.iterator();
            do
            {
                Account a = iter.next();
                if (a != null && a.getId() == acc.getId())
                {
                    return true;
                }
            } while (iter.hasNext());
        }
        return false;
    }
    
    private void updateFile() throws ServiceException
    {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ACCOUNTS_FILE));
            oos.writeObject(accounts);
            oos.flush();
            oos.close();
        }
        catch (Exception e)
        {
            throw new ServiceException(e.getMessage());
        }
    }
    
    @Override
    public Account create(Account acc) throws ServiceException
    {
        try
        {
            if (!has(acc))
            {
                accounts.add(acc);
                updateFile();
            }
            
        }
        catch (Exception e)
        {
            throw new ServiceException(e.getMessage());
        }
        return acc;
    }
    
    @Override
    public Account retrieve(int id) throws ServiceException
    {
        Iterator<Account> iter = accounts.iterator();
        while (iter.hasNext())
        {
            Account account = iter.next();
            if (account.getId() == id)
            {
                return account;
            }
        }
        return null;
    }
    
    @Override
    public void update(Account acc) throws ServiceException
    {
        try
        {
            for (int i = 1; i < accounts.size(); i++)
            {
                Account a = accounts.get(i);
                if (a.getId() == acc.getId())
                {
                    accounts.set(i, acc);
                    updateFile();
                }
            }
            throw new ServiceException("Account doesn't exist");
        }
        catch (Exception e)
        {
            throw new ServiceException(e.getMessage());
        }
    }
    
    @Override
    public Account delete(int id) throws ServiceException
    {
        Account account = accounts.get(id);
        if (account != null)
        {
            accounts.remove(id);
            return account;
        }
        else
        {
            throw new ServiceException("Account doesn't exist");
        }
    }
}
