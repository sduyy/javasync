public class Circle implements GeometricObject {
    public static final double pi = 3.14;
    private Point center;
    private double radius;

    /**
     * This is constructor.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * This is to get.
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * This is to set.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * This is to get.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * This is to set.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * This is to area.
     */
    public double getArea() {
        return pi * Math.pow(this.radius, 2);
    }

    /**
     * This is to perimeter.
     */
    public double getPerimeter() {
        return 2 * pi * this.radius;
    }

    /**
     * This is to get info.
     */
    public String getInfo() {
        return "Circle[(" + center.getPointX() + ","
                          + center.getPointY() + "),"
                          + this.radius + "]";
    }
}
