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

    public List<List<Integer>> getColumns() {
        List<List<Integer>> columns = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            columns.add(Arrays.asList(board[0 + i], board[3 + i], board[6 + i]));
        }

        return columns;
    }

    public List<List<Integer>> getDiagonals() {
        List<List<Integer>> diagonals = new ArrayList<>();

        List<Integer> primaryDiagonal = new ArrayList<>();
        List<Integer> secondaryDiagonal = new ArrayList<>();

        for (int i = 0; i < board.length; i = i + getRows().size() + 1) {
        primaryDiagonal.add(board[i]);
        }

        for (int i = getRows().size() - 1; i < board.length - 1; i = i + getRows().size() - 1) {
        secondaryDiagonal.add(board[i]);
        }

        diagonals.add(primaryDiagonal);
        diagonals.add(secondaryDiagonal);

        return diagonals;
    }
}
