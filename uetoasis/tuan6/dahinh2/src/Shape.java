public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * khoi tao ko tham so.
     */
    public Shape() {

    }

    /**
     * khoi tao co tham so.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * getColor.
     */
    public String getColor() {
        return color;
    }

    /**
     * setColor.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * isFilled.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * setfilled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * getArea.
     */
    public abstract double getArea();

    /**
     * getPerimeter.
     */
    public abstract double getPerimeter();

    /**
     * toString.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }

}
