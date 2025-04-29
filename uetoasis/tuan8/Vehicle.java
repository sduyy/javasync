package uetoasis.tuan8;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * This is constructor.
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * This is to get info.
     */
    public abstract String getInfo();

    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    /**
     * This is to get.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * This is to set.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * This is to get.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * This is to set.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * This is to get.
     */
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /**
     * This is to set.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * This is to get.
     */
    public Person getOwner() {
        return this.owner;
    }

    /**
     * This is to set.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
