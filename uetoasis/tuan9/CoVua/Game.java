import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    /**
     * This is constructor.
     */
    public Game(Board board) {
        this.board = board;
        moveHistory = new ArrayList<>();
    }

    /**
     * This is to move.
     */
    public void movePiece(Piece piece, int x, int y) {

    }

    /**
     * This is to get.
     */
    public Board getBoard() {
        return this.board;
    }

    /**
     * This is to set.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * This is to get.
     */
    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }
}
