package xogame.board_utils;

import java.util.Arrays;
import java.util.stream.IntStream;

import xogame.models.Board;
import xogame.utils.Result;

public class BoardGenerator {

    public static Result<Board> generate_an_empty_board_and_fill_the_given_row_with_symbol(int board_size, int rowNumber, int symbol) {
        int[] array = new int[board_size * board_size];

        if (rowNumber < board_size) {
            Arrays.fill(array, board_size * rowNumber, (rowNumber + 1) * board_size, symbol);

            return new Result<Board>(new Board(array));
        } else {
            return new Result<Board>(new Board(array), "Invalid row number.");
        }
    }

    public static Result<Board> generate_an_empty_board_and_fill_the_given_column_with_symbol(int board_size,
            int columnNumber, int symbol) {
        int[] array = new int[board_size * board_size];

        if (columnNumber < board_size) {
            array[columnNumber] = symbol;

            for (int i = 1; i < board_size; i++) {
                array[columnNumber + i * board_size] = symbol;
            }

            return new Result<Board>(new Board(array));
        } else {
            return new Result<Board>(new Board(array), "Invalid column number.");
        }
    }

    public static Result<Board> generate_an_empty_board_and_fill_the_primary_diagonal_with_symbol(int board_size,
            int symbol) {
        int[] array = new int[board_size * board_size];
        array[0] = symbol;

        for (int i = 1; i < board_size; i++) {
            array[i * (board_size + 1)] = symbol;
        }

        return new Result<Board>(new Board(array));
    }

    public static Result<Board> generate_an_empty_board_and_fill_the_secondary_diagonal_with_symbol(int board_size,
            int symbol) {
        int[] array = new int[board_size * board_size];
        array[board_size - 1] = symbol;

        for (int i = 1; i < board_size; i++) {
            array[(i + 1) * (board_size - 1)] = symbol;
        }

        return new Result<Board>(new Board(array));
    }

    public static Board generate_an_empty_board_and_fill_it_with_from_one_to_board_size(int board_size){
      return null;
    }

    public static Board generate_an_empty_board_and_fill_it_with_from_zero_to_board_size_minus_one(int board_size){
        return null;
    }
}
