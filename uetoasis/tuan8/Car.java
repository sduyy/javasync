package uetoasis.tuan8;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * This is constructor.
     */
    public Car(String brand, String model, String registrationNumber, 
                Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * This is to get info.
     */
    public String getInfo() {
        return "Car:" + "\n\t"
                + "Brand: " + this.brand + "\n\t"
                + "Model: " + this.model + "\n\t"
                + "Registration Number: " + this.registrationNumber + "\n\t"
                + "Number of Doors: " + this.numberOfDoors + "\n\t"
                + "Belongs to " + owner.getName() + " - " + owner.getAddress();
    }

    /**
     * This is to get.
     */
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    /**
     * This is to set.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
