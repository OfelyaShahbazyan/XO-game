package xogame.game_over;

import java.util.List;
import java.util.function.Predicate;

import xogame.models.Board;

public class GameOver {
    public static final Predicate<List<Integer>> listPredicate = list -> list.stream().allMatch(e -> e == 1) || list.stream().allMatch(e -> e == 2);

    public static Boolean isAnyRowComplete(Board board) {
        return doesAnyInnerListMatchTheCondition(board.getRows(), listPredicate);
    }

    public static Boolean isAnyColumnComplete(Board board) {
        return doesAnyInnerListMatchTheCondition(board.getColumns(), listPredicate);
    }

    public static Boolean isAnyDiagonalComplete(Board board) {
        return doesAnyInnerListMatchTheCondition(board.getDiagonals(), listPredicate);
    }

    public static Boolean doesAnyInnerListMatchTheCondition(List<List<Integer>> listOfLists, Predicate<List<Integer>> condition) {
        return listOfLists.stream().filter(e -> !e.isEmpty()).anyMatch(condition);
    }
}
