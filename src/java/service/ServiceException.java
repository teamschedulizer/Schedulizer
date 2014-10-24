/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author chutto001
 */
public class ServiceException extends Exception {
    public ServiceException()
    {
        super();
    }
    public ServiceException(String msg)
    {
        super(msg);
    }
}
