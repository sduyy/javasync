package uetoasis.tuan5.kethua2;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * This is constructor.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * This is to get school.
     */
    public String getSchool() {
        return school;
    }

    /**
     * This is to set school.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * This is to get pay.
     */
    public double getPay() {
        return pay;
    }

    /**
     * This is to set pay.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * This is to string.
     */
    @Override
    public String toString() {
        return "Staff[Person[name=" + getName() + ",address=" 
               + getAddress() + "],school=" + school + ",pay=" + pay + "]";
    }
}
