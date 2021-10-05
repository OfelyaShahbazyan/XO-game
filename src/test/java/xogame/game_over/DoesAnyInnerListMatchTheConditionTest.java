package xogame.game_over;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

public class DoesAnyInnerListMatchTheConditionTest {
    public final List<Integer> emptyList = Collections.<Integer>emptyList();
    public final Predicate<List<Integer>> listPredicate = list -> list.isEmpty() ? false : list.stream().allMatch(e -> e == 1) || list.stream().allMatch(e -> e == 2);

    @Test
    public void list_containing_an_empty_list_should_always_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList), listPredicate));
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList), listPredicate));
    }

    @Test
    public void list_containing_two_empty_lists_should_always_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList), listPredicate));
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList), listPredicate));
    }

    @Test
    public void list_containing_a_non_empty_list_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(1, 1, 1)), listPredicate));
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(2, 2, 2)), listPredicate));
    }

    @Test
    public void list_containing_a_non_empty_list_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(7, 1, 1)), listPredicate));
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(2, 3, 7)), listPredicate));
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(1, 2, 1)), listPredicate));
    }

    @Test
    public void list_containing_two_non_empty_lists_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(1, 1, 1), Arrays.asList(2, 2, 2)), listPredicate));
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), Arrays.asList(0, 0, 0)), listPredicate));
    }

    @Test
    public void list_containing_two_non_empty_lists_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(1, 7, 1), Arrays.asList(2, 7, 7)), listPredicate));
    }

    @Test
    public void list_containing_an_empty_and_a_non_empty_lists_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 2, 2)), listPredicate));
    }

    @Test
    public void list_containing_an_empty_and_a_non_empty_lists_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 3, 2)), listPredicate));
    }

    @Test
    public void list_containing_an_empty_and_two_non_empty_lists_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 2, 2), Arrays.asList(2, 2, 2)), listPredicate));
    }

    @Test
    public void list_containing_an_empty_and_two_non_empty_lists_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, Arrays.asList(4, 3, 2), Arrays.asList(5, 7, 2)), listPredicate));
    }

    @Test
    public void list_containing_a_non_empty_and_an_empty_lists_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), emptyList), listPredicate));
    }

    @Test
    public void list_containing_a_non_empty_and_an_empty_lists_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(9, 8, 2), emptyList), listPredicate));
    }

    @Test
    public void list_containing_a_non_empty_and_two_empty_lists_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), emptyList, emptyList), listPredicate));
    }

    @Test
    public void list_containing_a_non_empty_and_two_empty_lists_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(0, 6, 2), emptyList, emptyList), listPredicate));
    }

    @Test
    public void list_containing_two_empty_and_a_non_empty_lists_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList, Arrays.asList(2, 2, 2)), listPredicate));
    }

    @Test
    public void list_containing_two_empty_and_a_non_empty_lists_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, emptyList, Arrays.asList(2, 8, 2)), listPredicate));
    }

    @Test
    public void list_containing_two_non_empty_and_an_empty_lists_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), Arrays.asList(2, 2, 2), emptyList), listPredicate));
    }

    @Test
    public void list_containing_two_non_empty_and_an_empty_lists_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(0, 2, 3), Arrays.asList(2, 5, 2), emptyList), listPredicate));
    }

    @Test
    public void list_containing_a_non_empty_and_an_empty_and_a_non_empty_lists_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), emptyList, Arrays.asList(2, 2, 2)), listPredicate));
    }

    @Test
    public void list_containing_a_non_empty_and_an_empty_and_a_non_empty_lists_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(Arrays.asList(7, 2, 2), emptyList, Arrays.asList(2, 8, 2)), listPredicate));
    }

    @Test
    public void list_containing_an_empty_and_a_non_empty_and_an_empty_lists_should_success_to_match() {
        assertTrue(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 2, 2), emptyList), listPredicate));
    }

    @Test
    public void list_containing_an_empty_and_a_non_empty_and_an_empty_lists_should_fail_to_match() {
        assertFalse(GameOver.doesAnyInnerListMatchTheCondition(Arrays.asList(emptyList, Arrays.asList(0, 2, 2), emptyList), listPredicate));
    }
}
