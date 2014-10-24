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
public interface IAuthenticationSvc extends IService {
    public final String NAME = "IAuthenticationSvc";
    
    public boolean authenticate(Login login);
}
