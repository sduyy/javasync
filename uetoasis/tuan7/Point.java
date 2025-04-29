package uetoasis.tuan7;

import java.lang.Math;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * This is constructor.
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    /**
     * This is to get.
     */
    public double getPointX() {
        return this.pointX;
    }

    /**
     * This is to set.
     */
    public void setPointX(double x) {
        this.pointX = x;
    }

    /**
     * This is to get.
     */
    public double getPointY() {
        return this.pointY;
    }

    /**
     * This is to set.
     */
    public void setPointY(double y) {
        this.pointY = y;
    }

    /**
     * This is distance.
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.pointX - other.pointX, 2) + Math.pow(this.pointY - other.pointY, 2));
    }
}
