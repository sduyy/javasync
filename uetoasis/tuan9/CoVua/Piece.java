package uetoasis.tuan9.CoVua;

public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * This is constructor.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    /**
     * This is constructor.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * This is to get.
     */
    public abstract String getSymbol();

    /**
     * This is to check.
     */
    public abstract boolean canMove(Board board, int x, int y);

    /**
     * This is to get.
     */
    public int getCoordinatesX() {
        return this.coordinatesX;
    }

    /**
     * This is to set.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * This is to get.
     */
    public int getCoordinatesY() {
        return this.coordinatesY;
    }

    /**
     * This is to set.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * This is to get.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * This is to set.
     */
    public void setColor(String color) {
        this.color = color;
    }

    public boolean checkPosition(Piece piece) {

    }
}
