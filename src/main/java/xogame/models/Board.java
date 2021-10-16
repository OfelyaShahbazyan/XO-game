package xogame.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        int[] primaryDiagonal = new int[3];
        int[] secondaryDiagonal = new int[3];

        for (int i = 0; i < 3; i++) {
            primaryDiagonal[i] = board[4 * i];
            secondaryDiagonal[i] = board[2 * (i + 1)];
        }

        diagonals.add(IntStream.of(primaryDiagonal).boxed().collect(Collectors.toList()));
        diagonals.add(IntStream.of(secondaryDiagonal).boxed().collect(Collectors.toList()));

        return diagonals;
    }
}
