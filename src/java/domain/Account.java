/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author chutto001
 */
public class Account extends DomainAbs implements java.io.Serializable {
    private Login login;
    private String firstName;
    private String lastName;
    private Availability availability;
    
    public Account()
    {
        login = new Login();
        firstName = "";
        lastName = "";
        availability = new Availability();
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
        this.login.setId(id);
    }
    
    /**
     * @return the availability
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(Availability availability) {
        this.availability = availability;
        this.availability.setId(id);
    }

    public boolean validate()
    {
        if (id == 0)
            return false;
        if (!login.validate())
            return false;
        if (firstName == null || firstName.equals(""))
            return false;
        if (lastName == null || lastName.equals(""))
            return false;
        return true;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Account)
        {
            Account acc = (Account)obj;
            if (acc.getId() != getId())
                return false;
            else if (!acc.getLogin().equals(login))
                return false;
            else if (!acc.getFirstName().equals(firstName))
                return false;
            else if (!acc.getLastName().equals(lastName))
                return false;
            return true;
        }
        else
            return false;
    }
}
