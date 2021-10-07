package xogame.is_complete;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

public class DoesAnyInnerListMatchTheConditionTest {
    public final List<Integer> allOnesList = Arrays.asList(1, 1);
    public final List<Integer> allSevensList = Arrays.asList(7, 7);
    public final List<Integer> emptyList = Collections.<Integer>emptyList();

    public final Predicate<List<Integer>> allOnesPredicate = listOfAllOnes -> listOfAllOnes.stream().allMatch(e -> e == 1);

    @Test
    public void list_containing_an_empty_list_should_always_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList), i -> true));
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList), i -> false));
    }

    @Test
    public void list_containing_two_empty_lists_should_always_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList), i -> true));
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList), i -> false));
    }

    @Test
    public void list_containing_an_all_ones_list_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_all_sevens_list_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList), allOnesPredicate));
    }

    @Test
    public void list_containing_two_all_ones_lists_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, allOnesList), allOnesPredicate));
    }

    @Test
    public void list_containing_two_all_sevens_lists_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, allSevensList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_empty_and_an_all_ones_lists_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allOnesList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_empty_and_an_all_sevens_lists_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allSevensList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_empty_and_two_all_ones_lists_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allOnesList, allOnesList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_empty_and_two_all_sevens_lists_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allSevensList, allSevensList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_all_ones_and_an_empty_lists_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, emptyList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_all_sevens_and_an_empty_lists_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, emptyList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_all_ones_and_two_empty_lists_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, emptyList, emptyList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_all_sevens_and_two_empty_lists_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, emptyList, emptyList), allOnesPredicate));
    }

    @Test
    public void list_containing_two_empty_and_an_all_ones_lists_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList, allOnesList), allOnesPredicate));
    }

    @Test
    public void list_containing_two_empty_and_an_all_sevens_lists_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList, allSevensList), allOnesPredicate));
    }

    @Test
    public void list_containing_two_all_ones_and_an_empty_lists_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, allOnesList, emptyList), allOnesPredicate));
    }

    @Test
    public void list_containing_two_all_sevens_and_an_empty_lists_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, allSevensList, emptyList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_all_ones_and_an_empty_and_an_all_ones_lists_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allOnesList, emptyList, allOnesList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_all_sevens_and_an_empty_and_an_all_sevens_lists_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(allSevensList, emptyList, allSevensList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_empty_and_an_all_ones_and_an_empty_lists_should_succeed_to_match() {
        assertTrue(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allOnesList, emptyList), allOnesPredicate));
    }

    @Test
    public void list_containing_an_empty_and_an_all_sevens_and_an_empty_lists_should_fail_to_match() {
        assertFalse(IsComplete.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, allSevensList, emptyList), allOnesPredicate));
    }
}
