package xogame.game_over;

import java.util.function.Predicate;

import xogame.models.Board;

public class GameOver {

    public static Boolean isAnyRowComplete(Board board) {
        Predicate<Integer> streamsPredicate = item -> item == 1 || item == 2;

        boolean accumulator = false;

        for (int i = 0; i < board.getRows().size(); i++) {
            accumulator |= board.getRows().get(i).stream().allMatch(streamsPredicate);
        }

        return accumulator;
    }

    public static Boolean isAnyColumnComplete(Board board) {
        Predicate<Integer> streamsPredicate = item -> item == 1 || item == 2;

        boolean accumulator = false;

        for (int i = 0; i < board.getColumns().size(); i++) {
            accumulator |= board.getColumns().get(i).stream().allMatch(streamsPredicate);
        }

        return accumulator;
    }
}
