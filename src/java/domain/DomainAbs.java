/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author chutto001
 */
public abstract class DomainAbs {
    protected int id = 0;
    
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
}
