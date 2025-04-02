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
        this.width = side;
        this.length = side;
    }

    /**
     * This is constructor.
     */
    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
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
