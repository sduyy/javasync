public class Move {
    private int startX;
    private int endX;
    private int startY;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * This is constructor.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * This is constructor.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    public String toString() {
        return "bruh";
    }

    /**
     * This is to get.
     */
    public int getStartX() {
        return this.startX;
    }

    /**
     * This is to set.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * This is to get.
     */
    public int getEndX() {
        return this.endX;
    }

    /**
     * This is to set.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * This is to get.
     */
    public int getStartY() {
        return this.startY;
    }

    /**
     * This is to set.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * This is to get.
     */
    public int getEndY() {
        return this.endY;
    }

    /**
     * This is to set.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * This is to get.
     */
    public Piece getMovedPiece() {
        return this.movedPiece;
    }

    /**
     * This is to set.
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * This is to get.
     */
    public Piece getKilledPiece() {
        return this.killedPiece;
    }

    /**
     * This is to set.
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}
