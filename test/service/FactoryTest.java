/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import domain.*;

/**
 *
 * @author chutto001
 */
public class FactoryTest {
    
    @Test
    public void testGetService() throws ServiceException
    {
        Factory factory = new Factory();
        IAccountSvc accountSvc = (IAccountSvc)factory.getService(IAccountSvc.NAME);
        assertNotNull(accountSvc);
    }
}
