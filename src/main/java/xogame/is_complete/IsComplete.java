package xogame.is_complete;

import java.util.List;
import java.util.function.Predicate;

import xogame.models.Board;

public class IsComplete {
    public static final Predicate<List<Integer>> LIST_PREDICATE = list -> list.stream().allMatch(e -> e == 1) || list.stream().allMatch(e -> e == 2);

    public static Boolean isAnyRowComplete(Board board) {
        return doesAnyInnerListMatchTheCondition(board.getRows(), LIST_PREDICATE);
    }

    public static Boolean isAnyColumnComplete(Board board) {
        return doesAnyInnerListMatchTheCondition(board.getColumns(), LIST_PREDICATE);
    }

    public static Boolean isAnyDiagonalComplete(Board board) {
        return doesAnyInnerListMatchTheCondition(board.getDiagonals(), LIST_PREDICATE);
    }

    public static Boolean doesAnyInnerListMatchTheCondition(List<List<Integer>> listOfLists, Predicate<List<Integer>> condition) {
        return listOfLists.stream().filter(e -> !e.isEmpty()).anyMatch(condition);
    }
}
