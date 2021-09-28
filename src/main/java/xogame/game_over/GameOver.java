package xogame.game_over;

import java.util.List;

import xogame.models.Board;

public class GameOver {
    public static Boolean isGameOver(Board board) {
        return null;
    }

    public static Boolean isAnyRowComplete(Board board) {
        for (List<Integer> list : board.getRows()) {
            if (list.get(0) != 0) {
                if (list.get(1).equals(list.get(0)) && list.get(2).equals(list.get(0)))
                    return true;
            }
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
