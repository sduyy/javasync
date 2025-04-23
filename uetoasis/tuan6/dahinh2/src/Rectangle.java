import java.awt.*;
import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * getArea.
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * getPerimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    /**
     * Khoitaokothamso.
     */
    public Rectangle() {

    }

    /**
     * Khoi tao 2.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Khoi tao 3.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Khoitao4.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * getW.
     */
    public double getWidth() {
        return width;
    }

    /**
     * setWidth.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * getLength.
     */
    public double getLength() {
        return length;
    }

    /**
     * setLength.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * gettopleft.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * setTopleft.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Rectangle[topLeft=(" + topLeft.getPointX()
                + "," + topLeft.getPointY() + "),"
                + "width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * hash.
     */
    @Override
    public int hashCode(){
        return Objects.hash(topLeft,width,length);
    }

    /**
     * equals.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle r = (Rectangle) o;
        return this.topLeft.equals(r.topLeft) && this.width == r.width && this.length == r.length;
    }
}
