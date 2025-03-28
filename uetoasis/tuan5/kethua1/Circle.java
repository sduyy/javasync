package kethua1;

public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /**
     * This is constructor.
     */
    public Circle() {

    }

    /**
     * This is constructor.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * This is constructor.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * This is to get radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * This is to set radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * This is to get color.
     */
    public String getColor() {
        return color;
    }

    /**
     * This is to set color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This is to get area.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * This is to string.
     */
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
