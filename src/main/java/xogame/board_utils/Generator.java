package xogame.board_utils;

import java.util.ArrayList;
import java.util.List;

import xogame.models.Board;

public class Generator {
    public static List<Board> fill_in_row_of_a_board_with_symbol(int symbol, int board_size) {
        List<Board> listOfBoard = new ArrayList<Board>();
        Board board = new Board();

        for (int i = 0; i < board_size; i++) {
            int[] generatedBoard = board.getBoard();
            generatedBoard[i * 3] = symbol;
            generatedBoard[i * 3 + 1] = symbol;
            generatedBoard[i * 3 + 2] = symbol;

            listOfBoard.add(new Board(generatedBoard));
        }

        return listOfBoard;
    }
}
