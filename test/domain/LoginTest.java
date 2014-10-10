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
public class LoginTest {
    
    @Test
    public void testLogin()
    {
        Login login = new Login();
        assertEquals("false", false, login.validate());
        login.setUsername("test");
        login.setPassword("test");
        assertEquals("true", true, login.validate());
        Login l2 = new Login();
        assertEquals("false", false, login.equals(l2));
        l2.setUsername("test");
        l2.setPassword("test");
        assertEquals("true", true, login.equals(l2));
    }
}
