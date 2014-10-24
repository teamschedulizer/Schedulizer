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
public interface IAvailabilitySvc extends IService {
    public final String NAME = "IAvailabilitySvc";
    
    public Availability get(Account account);
    public boolean submit(Availability availability);
}
