import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Khoitao1.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * getX.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * setX.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * getY.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * setY.
     */
    public void setPointY(double Y) {
        this.pointY = Y;
    }

    /**
     * distance.
     */
    public double distance(Point newPoint) {
        double dx = pointX - newPoint.pointX;
        double dy = pointY - newPoint.pointY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * so sanh.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point p = (Point) o;
            return pointX == p.pointX && pointY == p.pointY;
        }
        return false;
    }

    /**
     * hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }

}
