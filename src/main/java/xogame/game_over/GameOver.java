package xogame.game_over;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import xogame.models.Board;

public class GameOver {
    public final List<Integer> emptyList = Collections.<Integer>emptyList();

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

    public static Boolean doesAnyInnerListMatchTheCondition(List<List<Integer>> listOfLists, Predicate<List<Integer>> condition) {
        List<List<Integer>> listOfListsWithoutEmptyLists = listOfLists.stream().filter(e -> !e.isEmpty()).collect(Collectors.toList());
        
            return listOfListsWithoutEmptyLists.stream().anyMatch(condition);
    }
}
