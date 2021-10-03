package xogame.game_over;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class GameOverTest {
    public final Predicate<Integer> condition = item -> item == 1 || item == 2;
    public final List<Integer> emptyList = Collections.<Integer>emptyList();
    
    @Test
    public void get_diagonals_of_the_board() {
        Board board = new Board(new int[] { 2, 2, 0, 1, 1, 1, 0, 0, 0 });
        assertEquals(2, board.getDiagonals().size());
    } 

    @Test
    public void check_content_of_the_board_by_diagonals() {
        Board board = new Board(new int[] { 2, 1, 2, 0, 1, 2, 1, 0, 0 });
        assertEquals(Arrays.stream(new int[] { 2, 1, 0 }).boxed().collect(Collectors.toList()), board.getDiagonals().get(0));
        assertEquals(Arrays.stream(new int[] { 2, 1, 1 }).boxed().collect(Collectors.toList()), board.getDiagonals().get(1));
    }

    @Test
    public void check_binary_Operation() {
        assertFalse(GameOver.isBitwiseOrAssignmentOperator(false, false));
        assertTrue(GameOver.isBitwiseOrAssignmentOperator(false, true));
        assertTrue(GameOver.isBitwiseOrAssignmentOperator(true, true));
    }

    @Test
    public void list_contains_one_empty_list_and_it_is_not_satisfy_to_the_condition() {
        assertFalse(GameOver.isListSatisfyToTheCondition(Arrays.asList(emptyList), condition));
    }  

    @Test
    public void list_contains_two_empty_lists_and_it_is_not_satisfy_to_the_condition() {
        assertFalse(GameOver.isListSatisfyToTheCondition(Arrays.asList(emptyList, emptyList), condition));
    }

    @Test
    public void list_contains_one_not_empty_list_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(Arrays.asList(1, 1, 1)), condition));
    }

    @Test
    public void list_contains_two_not_empty_lists_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(Arrays.asList(1, 1, 1), Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_one_empty_and_one_not_empty_lists_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_one_empty_and_two_not_empty_lists_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 2, 2), Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_one_not_empty_and_one_empty_lists_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), emptyList), condition));
    }

    @Test
    public void list_contains_one_not_empty_and_two_empty_lists_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), emptyList, emptyList), condition));
    }

    @Test
    public void list_contains_two_empty_and_one_not_empty_lists_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(emptyList, emptyList, Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_two_not_empty_and_one_empty_lists_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), Arrays.asList(2, 2, 2), emptyList), condition));
    }

    @Test
    public void list_contains_one_not_empty_and_one_empty_and_one_not_empty_lists_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), emptyList, Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_one_empty_and_one_not_empty_and_one_empty_lists_and_it_is_satisfy_to_the_condition() {
        assertTrue(GameOver.isListSatisfyToTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 2, 2), emptyList), condition));
    }
}
