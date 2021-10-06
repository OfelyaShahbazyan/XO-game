package xogame.game_over;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import xogame.models.Board;

public class GameOver {
    public static final Predicate<List<Integer>> listPredicate = list -> list.stream().allMatch(e -> e == 1) || list.stream().allMatch(e -> e == 2);

    public static Boolean isAnyRowComplete(Board board) {
        return doesAnyInnerListMatchTheCondition(board.getRows(), listPredicate);
    }

    public static Boolean isAnyDiagonalComplete(Board board) {
        return doesAnyInnerListMatchTheCondition(board.getDiagonals(), listPredicate);
    }

    public static Boolean doesAnyInnerListMatchTheCondition(List<List<Integer>> listOfLists, Predicate<List<Integer>> condition) {
        List<List<Integer>> listOfListsWithoutEmptyLists = listOfLists.stream().filter(e -> !e.isEmpty()).collect(Collectors.toList());
        
            return listOfListsWithoutEmptyLists.stream().anyMatch(condition);
    }
}
