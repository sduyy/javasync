public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * This is constructor.
     */
    public MotorBike(String brand, String model, String registrationNumber, 
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * This is to get info.
     */
    public String getInfo() {
        return "Motorbike:" + "\n"
                + "  Brand: " + this.brand + "\n"
                + "  Model: " + this.model + "\n"
                + "  Registration Number: " + this.registrationNumber + "\n"
                + "  Has Side Car: " + this.hasSidecar + "\n"
                + "  Belongs to " + owner.getName() + " - " + owner.getAddress();
    }

    /**
     * This is to get.
     */
    public boolean isHasSideCar() {
        return this.hasSidecar;
    }

    /**
     * This is to set.
     */
    public void setHasSideCar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
