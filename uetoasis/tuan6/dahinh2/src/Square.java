import java.util.Objects;

public class Square  extends Rectangle {
    /**
     * khoitao1.
     */
    public Square() {
        super();
    }

    /**
     * Khoitao 2.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Khoi tao3.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Khoitao.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * setWidth.
     */
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * setL.
     */
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * getSize.
     */
    public double getSide() {
        return super.getWidth();
    }

    /**
     * setSize.
     */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Square[topLeft=(" + topLeft.getPointX()
                + "," + topLeft.getPointY() +"),"
                + "side=" + getSide() + ",color=" + color
                + ",filled=" + filled + "]";
    }

    /**
     * hashCode.
     */
    public int hashCode() {
        return Objects.hash(topLeft,getSide());
    }

    /**
     * euqals.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square s = (Square) o;
        return topLeft.equals(s.topLeft) && getSide() == s.getSide();
    }
}
