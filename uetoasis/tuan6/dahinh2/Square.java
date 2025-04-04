package uetoasis.tuan6.dahinh2;

public class Square extends Rectangle {

    /**
     * This is constructor.
     */
    public Square() {

    }

    /**
     * This is constructor.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * This is constructor.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * This is constructor.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.topLeft = topLeft;
    }

    /**
     * This is to get side.
     */
    public double getSide() {
        return width;
    }

    /**
     * This is to set side.
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * This is to set width.
     */
    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    /**
     * This is to set length.
     */
    @Override
    public void setLength(double side) {
        this.length = side;
    }

    /**
     * This is to string.
     */
    public String toString() {
        return "Square[side=" + width + ",color=" + color + ",filled=" + filled + "]";
    }
}
