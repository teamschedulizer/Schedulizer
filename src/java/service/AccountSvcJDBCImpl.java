/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.*;
import java.sql.*;

/**
 *
 * @author chutto001
 */
public class AccountSvcJDBCImpl implements IAccountSvc {
    private final String CONN_STRING = "jdbc:mysql://localhost/schedulizer?user=root&password=admin";
    
    private Connection getConnection() throws Exception
    {
        return DriverManager.getConnection(CONN_STRING);
    }
    
    @Override
    public Account create(Account acc) throws ServiceException
    {
        Connection conn = null;
        try
        {
            conn = getConnection();
            String sql = "INSERT INTO Accounts (id, login, firstName, lastName, availability) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, acc.getId());
            stmt.setObject(2, acc.getLogin().);
            stmt.setString(3, acc.getFirstName());
            stmt.setString(4, acc.getLastName());
            stmt.setObject(5, acc.getAvailability());
            stmt.execute();
            if (conn != null)
                conn.close();
            return acc;
        }
        catch (Exception e)
        {
            throw new ServiceException(e.getMessage());
        }
    }
    
    @Override
    public Account retrieve(int id)
    {
        try
        {
            Account acc = new Account();
            Connection conn = getConnection();
            String sql = "SELECT * FROM Accounts WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet result = stmt.executeQuery();
            while (result.next())
            {
                acc.setId(result.getInt("id"));
                acc.set
            }
            if (conn != null)
                conn.close();
        }
    }
    
    public void update(Account acc) throws ServiceException
    {
        
    }
    
    public Account delete(int id) throws ServiceException
    {
        
    }
}
