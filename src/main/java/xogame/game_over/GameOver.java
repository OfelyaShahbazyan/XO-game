package xogame.game_over;

import java.util.function.Predicate;

import xogame.models.Board;

public class GameOver {
    public static Boolean isGameOver(Board board) {
        return null;
    }

    public static Boolean isAnyRowComplete(Board board) {
        return null;
    }

    public static Boolean isAnyColumnComplete(Board board) {
        for (int i = 0; i < board.getColumns().size(); i++) {
            Predicate<Integer> streamsPredicate = item -> item == 1 || item == 2;
            if (board.getColumns().get(i).stream().allMatch(streamsPredicate)) {
                return true;
            }
        }
        return false;
    }

    public static Boolean isADiagonalComplete(Board board) {
        return null;
    }

    public static Boolean isTheBoardFull(Board board) {
        return null;
    }
}
