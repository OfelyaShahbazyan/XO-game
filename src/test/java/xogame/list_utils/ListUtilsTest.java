package xogame.list_utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

public class ListUtilsTest {
    public final List<Integer> allOnesList = Arrays.asList(1, 1);
    public final List<Integer> allSevensList = Arrays.asList(7, 7);
    public final List<Integer> emptyList = Collections.<Integer>emptyList();

    public final Predicate<List<Integer>> ALL_ONES_PREDICATE = listOfAllOnes -> listOfAllOnes.stream().allMatch(e -> e == 1);
    public final Predicate<List<Integer>> TRUE_PREDICATE = i -> true;
    public final Predicate<List<Integer>> FALSE_PREDICATE = i -> false;

    @Test
    public void list_containing_an_empty_list_should_always_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList), TRUE_PREDICATE));
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList), FALSE_PREDICATE));
    }

    @Test
    public void list_containing_two_empty_lists_should_always_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList), TRUE_PREDICATE));
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList), FALSE_PREDICATE));
    }

    @Test
    public void list_containing_an_all_ones_list_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_all_sevens_list_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_two_all_ones_lists_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, allOnesList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_two_all_sevens_lists_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, allSevensList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_empty_and_an_all_ones_lists_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allOnesList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_empty_and_an_all_sevens_lists_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allSevensList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_empty_and_two_all_ones_lists_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allOnesList, allOnesList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_empty_and_two_all_sevens_lists_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allSevensList, allSevensList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_all_ones_and_an_empty_lists_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, emptyList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_all_sevens_and_an_empty_lists_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, emptyList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_all_ones_and_two_empty_lists_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, emptyList, emptyList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_all_sevens_and_two_empty_lists_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, emptyList, emptyList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_two_empty_and_an_all_ones_lists_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList, allOnesList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_two_empty_and_an_all_sevens_lists_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList, allSevensList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_two_all_ones_and_an_empty_lists_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, allOnesList, emptyList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_two_all_sevens_and_an_empty_lists_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, allSevensList, emptyList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_all_ones_and_an_empty_and_an_all_ones_lists_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, emptyList, allOnesList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_all_sevens_and_an_empty_and_an_all_sevens_lists_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, emptyList, allSevensList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_empty_and_an_all_ones_and_an_empty_lists_should_succeed_to_match() {
        assertTrue(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allOnesList, emptyList), ALL_ONES_PREDICATE));
    }

    @Test
    public void list_containing_an_empty_and_an_all_sevens_and_an_empty_lists_should_fail_to_match() {
        assertFalse(ListUtils.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allSevensList, emptyList), ALL_ONES_PREDICATE));
    }
}
