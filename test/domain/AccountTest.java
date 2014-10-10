/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chutto001
 */
public class AccountTest {
    
    @Test
    public void testAccount()
    {
        Account account = new Account();
        Login login = new Login();
        assertEquals("false", false, account.validate());
        account.setId(1);
        assertEquals("1", 1, account.getId());
        login.setUsername("test");
        login.setPassword("test");
        account.setLogin(login);
        account.setFirstName("test");
        account.setLastName("test");
        assertEquals("true", true, account.validate());
        Account a2 = new Account();
        assertEquals("false", false, account.equals(a2));
        a2.setId(1);
        a2.setLogin(login);
        assertEquals("false", false, account.equals(a2));
        a2.setFirstName("test");
        a2.setLastName("test");
        assertEquals("true", true, account.equals(a2));
    }
}
