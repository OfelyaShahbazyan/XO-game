package xogame.list_utils;

import java.util.List;
import java.util.function.Predicate;

public class ListUtils {
    public static Boolean doesAnyInnerListMatchTheCondition(List<List<Integer>> listOfLists, Predicate<List<Integer>> condition) {
        Boolean identity = false;

        return listOfLists.stream().reduce(identity,
                (partialResult, lists) -> listOfLists.stream().filter(e -> !e.isEmpty()).anyMatch(condition),
                (result, partialResult) -> result |= partialResult);
    }
}
