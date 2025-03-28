package kethua1;

public class Cylinder extends Circle {
    private double height;

    /**
     * This is constructor.
     */
    public Cylinder() {

    }

    /**
     * This is constructor.
     */
    public Cylinder(double height) {

    }

    /**
     * This is constructor.
     */
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    /**
     * This is constructor.
     */
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * This is to get height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * This is to set height.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * This is to get volume.
     */
    public double getVolume() {
        return getArea() * getHeight();
    }

    /**
     * This is to string.
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + "height=" + height + "]";
    }

    /**
     * This is to get area.
     */
    @Override
    public double getArea() {
        return getArea() + getArea() + getRadius() * height;
    }
}
