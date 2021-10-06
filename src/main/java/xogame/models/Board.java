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

    public List<List<Integer>> getRows() {
        List<List<Integer>> rows = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            rows.add(Arrays.asList(board[i * 3], board[i * 3 + 1], board[i * 3 + 2]));
        }
        
        return rows;
    }

    public List<List<Integer>> getDiagonals() {
        List<List<Integer>> diagonals = new ArrayList<>();
        int i = 0;
        diagonals.add(Arrays.asList(board[i * 3 + 0], board[(i + 1) * 3 + 1], board[(i + 2) * 3 + 2]));
        diagonals.add(Arrays.asList(board[i * 3 + 2], board[(i + 1) * 3 + 1], board[(i + 2) * 3 + 0]));

        return diagonals;
    }    
}
