package xogame.game_over;

import xogame.models.Board;

public class GameOver {
    public static Boolean isGameOver(Board board) {
        return null;
    }

    public static Boolean isARowComplete(int rowNumber, Board board) {
        if (board.getBoard()[rowNumber * 3 + 0] == board.getBoard()[rowNumber * 3 + 1]
                && board.getBoard()[rowNumber * 3 + 0] == board.getBoard()[rowNumber * 3 + 2]
                && board.getBoard()[rowNumber * 3 + 0] != 0) {
            return true;
        }
        return false;
    }

    public static Boolean isAColumnComplete(int rowNumber, Board board) {
        return null;
    }

    public static Boolean isADiagonalComplete(Board board) {
        return null;
    }

    public static Boolean isTheBoardFull(Board board) {
        return null;
    }
}
