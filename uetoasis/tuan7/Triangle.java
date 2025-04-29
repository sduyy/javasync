package uetoasis.tuan7;

public class Triangle implements GeometricObject{
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * This is constructor.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException{
        if (p1 == p2 || p2 == p3 || p3 == p1) {
            throw new RuntimeException("bruh");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * This is to get.
     */
    public Point getP1() {
        return p1;
    }

    /**
     * This is to get.
     */
    public Point getP2() {
        return p2;
    }

    /**
     * This is to get.
     */
    public Point getP3() {
        return p3;
    }

    /**
     * This is to area.
     */
    public double getArea() {
        double first = p1.getPointX() * (p2.getPointY() - p3.getPointY());
        double second = p2.getPointX() * (p3.getPointY() - p1.getPointY());
        double third = p3.getPointX() * (p1.getPointY() - p2.getPointY());
        return (Math.abs(first + second + third)) / 2;
    }

    /**
     * This is to perimeter.
     */
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * This is to get info.
     */
    public String getInfo() {
        return "Triangle[(" + p1.getPointX() + "," + p1.getPointY() + "),("
                            + p2.getPointX() + "," + p2.getPointY() + "),("
                            + p3.getPointX() + "," + p3.getPointY() + ")]";
    }
}
