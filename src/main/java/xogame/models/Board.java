package xogame.models;

import java.util.Arrays;
import java.util.List;

public class Board {
    private final int[] board;

    public Board(int[] board) {
        this.board = board;
    }

    public Board() {
        this.board = new int[9];
    }

    public int[] getBoard() {
        return Arrays.copyOf(board, board.length);
    }

    public List<List<Integer>> getColumns() {
        return null;
    }
}
