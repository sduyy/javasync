import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /**
     * getArea.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * getPerimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Khoitao ko tham so.
     */
    public Circle(){

    }

    /**
     * khoi tao co tham so.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * khoi tao .
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Khoitao3.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /**
     * getRadius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setRadius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getCenter.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * setCenter.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Circle[" + "center=(" + center.getPointX()
                + "," + center.getPointY() +"),"
                + "radius=" + radius + ",color=" + color
                + ",filled=" + filled + "]";
    }

    /**
     * hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }

    /**
     * equals.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Circle)) {
            return false;
        }
        Circle c = (Circle) o;
        return Double.compare(radius, c.radius) == 0 
                && center.equals(c.center);
    }
}
