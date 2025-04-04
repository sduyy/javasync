package uetoasis.tuan5.kethua2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * This is constructor.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * This is to get program.
     */
    public String getProgram() {
        return program;
    }

    /**
     * This is to set program.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * This is to get year.
     */
    public int getYear() {
        return year;
    }

    /**
     * This is to set year.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * This is to get fee.
     */
    public double getFee() {
        return fee;
    }

    /**
     * This is to set fee.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * This is to string.
     */
    @Override
    public String toString() {
        return "Student[Person[name=" + getName() + ",address=" + getAddress() 
               + "],program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
