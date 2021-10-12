package xogame.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

        diagonals.add(Arrays.asList(board[0], board[4], board[8]));
        diagonals.add(Arrays.asList(board[2], board[4], board[6]));

        return diagonals;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)

            return true;

        if (!(o instanceof Board)) {

            return false;
        }

        Board board = (Board) o;

        return Arrays.equals(board.getBoard(), this.board);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(board);
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder().append("[");

        for (int i = 0; i < board.length; i++) {

            if (i == board.length - 1) {
                strBuilder.append(i);
            }
            strBuilder.append(i).append(", ");
        }

        strBuilder.append("]");

        return strBuilder.toString();
    }
}
