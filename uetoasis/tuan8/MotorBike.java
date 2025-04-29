package uetoasis.tuan8;

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
        return "Motor Bike:" + "\n\t"
                + "Brand: " + this.brand + "\n\t"
                + "Model: " + this.model + "\n\t"
                + "Registration Number: " + this.registrationNumber + "\n\t"
                + "Has Side Car: " + this.hasSidecar + "\n\t"
                + "Belongs to " + owner.getName() + " - " + owner.getAddress();
    }

    /**
     * This is to get.
     */
    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    /**
     * This is to set.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
