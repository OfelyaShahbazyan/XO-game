package xogame.game_over;

import xogame.models.Board;

public class GameOver {
    public static Boolean isGameOver(Board board) {
        return null;
    }

    public static Boolean isARowComplete(int rowNumber, Board board) {

        if (board.getBoard()[0] == board.getBoard()[1] && board.getBoard()[0] == board.getBoard()[2]
            && board.getBoard()[0] != 0) {
                return true;
        }
        if (board.getBoard()[3] == board.getBoard()[4] && board.getBoard()[3] == board.getBoard()[5]
            && board.getBoard()[3] != 0) {
                return true;
        }
        if (board.getBoard()[6] == board.getBoard()[7] && board.getBoard()[6] == board.getBoard()[8]
            && board.getBoard()[6] != 0) {
                return true;
        } else {
            return false;
        }
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
