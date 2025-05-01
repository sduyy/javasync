package uetoasis.tuan6.dahinh2;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

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
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.filled = filled;
    }

    /**
     * This is constructor.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /**
     * This is to get center.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * This is to set center.
     */
    public void setCenter(Point center) {
        this.center = center;
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
     * This is to get area.
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * This is to get perimeter.
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * This is to string.
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
