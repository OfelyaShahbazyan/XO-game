package xogame.game_over;

import java.util.function.Predicate;

import xogame.models.Board;

public class GameOver {
    public static Boolean isGameOver(Board board) {
        return null;
    }

    public static Boolean isAnyRowComplete(Board board) {
        for (int i = 0; i < board.getRows().size(); i++) {
            Predicate<Integer> streamsPredicate = item -> item == 1 || item == 2;
            if (board.getRows().get(i).stream().allMatch(streamsPredicate)) {
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
