/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author chutto001
 */
public class Availability {
    private boolean mon;
    private boolean tue;
    private boolean wed;
    private boolean thu;
    private boolean fri;
    private boolean sat;
    private boolean sun;
    
    public Availability()
    {
        mon = false;
        tue = false;
        wed = false;
        thu = false;
        fri = false;
        sat = false;
        sun = false;
    }

    /**
     * @return the mon
     */
    public boolean isMon() {
        return mon;
    }

    /**
     * @param mon the mon to set
     */
    public void setMon(boolean mon) {
        this.mon = mon;
    }

    /**
     * @return the tue
     */
    public boolean isTue() {
        return tue;
    }

    /**
     * @param tue the tue to set
     */
    public void setTue(boolean tue) {
        this.tue = tue;
    }

    /**
     * @return the wed
     */
    public boolean isWed() {
        return wed;
    }

    /**
     * @param wed the wed to set
     */
    public void setWed(boolean wed) {
        this.wed = wed;
    }

    /**
     * @return the thu
     */
    public boolean isThu() {
        return thu;
    }

    /**
     * @param thu the thu to set
     */
    public void setThu(boolean thu) {
        this.thu = thu;
    }

    /**
     * @return the fri
     */
    public boolean isFri() {
        return fri;
    }

    /**
     * @param fri the fri to set
     */
    public void setFri(boolean fri) {
        this.fri = fri;
    }

    /**
     * @return the sat
     */
    public boolean isSat() {
        return sat;
    }

    /**
     * @param sat the sat to set
     */
    public void setSat(boolean sat) {
        this.sat = sat;
    }

    /**
     * @return the sun
     */
    public boolean isSun() {
        return sun;
    }

    /**
     * @param sun the sun to set
     */
    public void setSun(boolean sun) {
        this.sun = sun;
    }
    
    public boolean validate()
    {
        return (mon || tue || wed || thu || fri || sat || sun);
    }
    
    public boolean equals(Object obj)
    {
        if (obj instanceof Availability)
        {
            if (((Availability)obj).isMon() != mon)
                return false;
            if (((Availability)obj).isTue() != tue)
                return false;
            if (((Availability)obj).isWed() != wed)
                return false;
            if (((Availability)obj).isThu() != thu)
                return false;
            if (((Availability)obj).isFri() != fri)
                return false;
            if (((Availability)obj).isSat() != sat)
                return false;
            if (((Availability)obj).isSun() != sun)
                return false;
            return true;
        }
        else
            return false;
    }
}
