package xogame.is_complete;

import java.util.List;
import java.util.function.Predicate;

import xogame.list_utils.ListUtils;
import xogame.models.Board;

public class IsComplete {
    public static final Predicate<List<Integer>> listPredicate = list -> list.stream().allMatch(e -> e == 1) || list.stream().allMatch(e -> e == 2);

    public static Boolean isAnyRowComplete(Board board) {
        return ListUtils.doesAnyInnerListMatchTheCondition(board.getRows(), listPredicate);
    }

    public static Boolean isAnyColumnComplete(Board board) {
        return ListUtils.doesAnyInnerListMatchTheCondition(board.getColumns(), listPredicate);
    }

    public static Boolean isAnyDiagonalComplete(Board board) {
        return ListUtils.doesAnyInnerListMatchTheCondition(board.getDiagonals(), listPredicate);
    }
}