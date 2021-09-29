package xogame.models;

import java.util.ArrayList;
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
        List<List<Integer>> columns = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            columns.add(Arrays.asList(board[0 + i], board[3 + i], board[6 + i]));
        }
        return columns;
    }

    public List<List<Integer>> getDiagonals() {
        return null;
    }
}
