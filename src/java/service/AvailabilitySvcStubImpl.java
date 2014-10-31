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
public class AvailabilitySvcStubImpl implements IAvailabilitySvc {
    
    @Override
    public Availability get(Account account)
    {
        return new Availability();
    }
    
    @Override
    public boolean submit(Account account, Availability availability)
    {
        return true;
    }
}
