package xogame.game_over;

import java.util.List;
import java.util.function.Predicate;

import xogame.models.Board;

public class GameOver {
    public static final Predicate<Integer> streamsPredicate = item -> item == 1 || item == 2;

    public static Boolean isAnyDiagonalComplete(Board board) {
        Boolean accumulator = false;

        return accumulator |= isListSatisfyToTheCondition(board.getDiagonals(), streamsPredicate);
    }

    public static Boolean isListSatisfyToTheCondition(List<List<Integer>> list, Predicate<Integer> condition) {
        Boolean result = false;

        for (int i = 0; i < list.size(); i++) {

            if (!list.get(i).isEmpty()) {
                result |= list.get(i).stream().allMatch(condition);
            }
        }

        return result;
    }
}
