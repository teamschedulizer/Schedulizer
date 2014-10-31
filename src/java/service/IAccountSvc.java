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
    
    public Account create(Account acc) throws ServiceException;
    public Account retrieve(int id) throws ServiceException;
    public void update(Account acc) throws ServiceException;
    public Account delete(int id) throws ServiceException;
}
