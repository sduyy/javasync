package uetoasis.tuan6.dahinh1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * This is constructor.
     */
    public Shape() {

    }

    /**
     * This is constructor.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
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
     * This is to check if filled.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * This is to set filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * This is to get area.
     */
    public abstract double getArea();

    /**
     * This is to get perimeter.
     */
    public abstract double getPerimeter();

    /**
     * This is to string.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
