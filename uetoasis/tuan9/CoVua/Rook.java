package uetoasis.tuan9.CoVua;

public class Rook extends Piece{
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    public String getSymbol() {
        return "R";
    }

    public boolean canMove(Board board, int x, int y) {
        
    }
}
