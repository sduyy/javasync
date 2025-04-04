package uetoasis.tuan6.dahinh2;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * This is constructor.
     */
    public Rectangle() {

    }

    /**
     * This is constructor.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * This is constructor.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * This is constructor.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * This is to get point.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * This is to set point.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * This is to get width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * This is to set width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * This is to get length.
     */
    public double getLength() {
        return length;
    }

    /**
     * This is to set length.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * This is to get area.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * This is to get perimeter.
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * This is to string.
     */
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }
}
