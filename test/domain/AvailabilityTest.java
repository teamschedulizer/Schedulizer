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
public class AvailabilityTest {
    
    @Test
    public void testAvailability()
    {
        Availability avail = new Availability();
        assertEquals("false", false, avail.validate());
        Availability a2 = new Availability();
        assertEquals("true", true, avail.equals(a2));
        avail.setMon(true);
        assertEquals("true", true, avail.validate());
        assertEquals("false", false, avail.equals(a2));
        a2.setMon(true);
        assertEquals("true", true, avail.equals(a2));
    }
}
