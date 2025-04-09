package uetoasis.tuan6.dahinh2;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * This is constructor.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * This is to get point.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * This is to set point.
     */   
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * This is to get point.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * This is to set point.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * 
     */
    public String toString() {
        return "Point[pointx=" + pointX + ",pointy=" + pointY + "]";
    }
}
