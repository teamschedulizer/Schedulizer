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
public class AuthenticationSvcStubImpl implements IAuthenticationSvc {
    
    @Override
    public boolean authenticate(Login login)
    {
        return true;
    }
    
    @Override
    public boolean store(Login login)
    {
        return false;
    }
}
