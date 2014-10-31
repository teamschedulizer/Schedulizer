/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.*;

/**
 *
 * @author chutto001
 */
public class AccountSvcStubImpl implements IAccountSvc { // does nothing
    
    @Override
    public Account create(Account acc)
    {
        return acc;
    }
    
    @Override
    public Account retrieve(int id)
    {
        return new Account();
    }
    
    @Override
    public void update(Account acc)
    {
        
    }
    
    @Override
    public Account delete(int id)
    {
        return new Account();
    }
}
