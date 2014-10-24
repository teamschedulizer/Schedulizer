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
public interface IAccountSvc extends IService {
    public final String NAME = "IAccountSvc";
    
    public void create(Account acc);
}
