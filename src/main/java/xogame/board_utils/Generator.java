package xogame.board_utils;

import java.util.Arrays;

import xogame.models.Board;
import xogame.utils.Result;

public class Generator {
    public static Result<Board> fill_nth_row_of_the_board_with_symbol(int board_size, int rowNumber, int symbol) {
        int[] array = new int[board_size * board_size];

        if (rowNumber < board_size) {
            Arrays.fill(array, board_size * rowNumber, (rowNumber + 1) * board_size, symbol);

            return new Result<Board>(new Board(array));
        } else {
            return new Result<Board>(new Board(array), "There is no row like this.");
        }
    }

    public static Result<Board> fill_nth_column_of_the_board_with_symbol(int board_size, int columnNumber, int symbol) {
        return null;
    }

    public static int[] generateIndiciesOfTheElementsOfTheColumn(int boardSize, int columnNumber) {
        int[] arrayOfIndicies = new int[boardSize];
        arrayOfIndicies[0] = columnNumber;

        for (int i = 1; i < boardSize; i++) {
            arrayOfIndicies[i] = arrayOfIndicies[i - 1] + boardSize;
        }

        return arrayOfIndicies;
    }
}
