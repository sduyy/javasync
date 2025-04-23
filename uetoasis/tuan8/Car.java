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
        return "Car:" + "\n"
                + "  Brand: " + this.brand + "\n"
                + "  Model: " + this.model + "\n"
                + "  Registration Number: " + this.registrationNumber + "\n"
                + "  Number of Doors: " + this.numberOfDoors + "\n"
                + "  Belongs to " + owner.getName() + " - " + owner.getAddress();
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
