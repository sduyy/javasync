package uetoasis.tuan9.CoVua;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces;

    /**
     * This is constructor.
     */
    public Board() {
        pieces = new ArrayList<>();
    }

    /**
     * This is to validate.
     */
    public boolean validate(int x, int y) {
        if (1 <= x && x <= 8 && 1 <= y && y <= 8) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This is to add piece.
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            boolean check = true;
            for (Piece p : pieces) {
                if (p.getCoordinatesX() == piece.getCoordinatesX() && p.getCoordinatesY() == piece.getCoordinatesY()) {
                    check = false;
                }
            }
            if (check) {
                pieces.add(piece);
            }
        }
    }

    /**
     * This is to get.
     */
    public Piece getAt(int x, int y) {
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                return p;
            }
        }
        return null;
    }

    /**
     * This is to remove.
     */
    public void removeAt(int x, int y) {
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                pieces.remove(p);
            }
        }
    }

    /**
     * This is to get.
     */
    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    /**
     * This is to set.
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
