/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author chutto001
 */
public class Factory { // creates instances of services
    public IService getService(String name) throws ServiceException
    {
        try
        {
            Class c = Class.forName(getImplName(name));
            return (IService)c.newInstance();
        }
        catch (Exception e)
        {
            throw new ServiceException("Factory Exception: " + e.getMessage());
        }
    }
    
    private String getImplName(String name) throws Exception
    {
        java.util.Properties props = new java.util.Properties();
        java.io.FileInputStream fis = new java.io.FileInputStream("service.properties");
        props.load(fis);
        fis.close();
        return props.getProperty(name);
    }
}
