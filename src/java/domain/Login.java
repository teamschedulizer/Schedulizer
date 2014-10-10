/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author chutto001
 */
public class Login {
    private String username;
    private String password;
    
    public Login()
    {
        username = "";
        password = "";
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validate()
    {
        if (username == null || username.equals(""))
            return false;
        if (password == null || password.equals(""))
            return false;
        return true;
    }
    
    public boolean equals(Object obj)
    {
        if (obj instanceof Login)
        {
            if (!((Login)obj).getUsername().equals(username))
                return false;
            if (!((Login)obj).getPassword().equals(password))
                return false;
            return true;
        }
        else
            return false;
    }
}
