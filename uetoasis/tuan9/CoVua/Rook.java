import java.util.ArrayList;

public class Rook extends Piece {
    /**
     * This is constructor.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * This is constructor.
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * This is to get.
     */
    public String getSymbol() {
        return "R";
    }

    /**
     * This is to check.
     */
    public boolean canMove(Board board, int x, int y) {
        boolean check = true;
        if ((x == this.getCoordinatesX() && y != this.getCoordinatesY()) 
         || (x != this.getCoordinatesX() && y == this.getCoordinatesY())) {
            ArrayList<Piece> pieces = board.getPieces();
            for (Piece p : pieces) {
                if (x == p.getCoordinatesX() 
                 && y == p.getCoordinatesY() 
                 && this.getColor().equals(p.getColor())) {
                    check = false;
                    break;
                }
            }
        } else {
            return false;
        }
        return check;
    }
}
