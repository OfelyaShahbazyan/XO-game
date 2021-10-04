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
    public void get_rows_of_the_board() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });
        assertEquals(3, board.getRows().size());
    }

    @Test
    public void check_content_of_the_board_by_rows() {
        Board board = new Board(new int[] { 2, 1, 0, 0, 2, 1, 1, 0, 2 });
        assertEquals(Arrays.stream(new int[] { 2, 1, 0 }).boxed().collect(Collectors.toList()), board.getRows().get(0));
        assertEquals(Arrays.stream(new int[] { 0, 2, 1 }).boxed().collect(Collectors.toList()), board.getRows().get(1));
        assertEquals(Arrays.stream(new int[] { 1, 0, 2 }).boxed().collect(Collectors.toList()), board.getRows().get(2));
    }

    @Test
    public void list_contains_an_empty_list_and_it_does_not_satisfy_to_the_condition() {
        assertFalse(GameOver.doesListSatisfyToTheCondition(Arrays.asList(emptyList), condition));
    }  

    @Test
    public void list_contains_two_empty_lists_and_it_does_not_satisfy_to_the_condition() {
        assertFalse(GameOver.doesListSatisfyToTheCondition(Arrays.asList(emptyList, emptyList), condition));
    }

    @Test
    public void list_contains_a_non_empty_list_and_it_does_not_satisfy_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(Arrays.asList(1, 1, 1)), condition));
    }

    @Test
    public void list_contains_two_non_empty_lists_and_it_satisfies_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(Arrays.asList(1, 1, 1), Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_an_empty_and_a_non_empty_lists_and_it_satisfies_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_an_empty_and_two_non_empty_lists_and_it_satisfies_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 2, 2), Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_a_non_empty_and_an_empty_lists_and_it_satisfies_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), emptyList), condition));
    }

    @Test
    public void list_contains_a_non_empty_and_two_empty_lists_and_it_satisfies_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), emptyList, emptyList), condition));
    }

    @Test
    public void list_contains_two_empty_and_a_non_empty_lists_and_it_satisfies_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(emptyList, emptyList, Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_two_non_empty_and_an_empty_lists_and_it_satisfies_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), Arrays.asList(2, 2, 2), emptyList), condition));
    }

    @Test
    public void list_contains_two_non_empty_and_an_empty_and_a_non_empty_lists_and_it_satisfies_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(Arrays.asList(2, 2, 2), emptyList, Arrays.asList(2, 2, 2)), condition));
    }

    @Test
    public void list_contains_an_empty_and_a_non_empty_and_an_empty_lists_and_it_satisfies_to_the_condition() {
        assertTrue(GameOver.doesListSatisfyToTheCondition(Arrays.asList(emptyList, Arrays.asList(2, 2, 2), emptyList), condition));
    }

    @Test
    public void the_first_row_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 1, 1, 1, 2, 2, 0, 0, 0, 0 });
        assertTrue(GameOver.isAnyRowComplete(board));
    }

    @Test
    public void the_first_row_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 2, 2, 2, 1, 1, 0, 0, 0, 0 });
        assertTrue(GameOver.isAnyRowComplete(board));
    }

    @Test
    public void the_first_row_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 2, 2, 0, 0, 0, 0 });
        assertFalse(GameOver.isAnyRowComplete(board));
    }

    @Test
    public void the_second_row_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 2, 0, 1, 1, 1, 0, 0, 0 });
        assertTrue(GameOver.isAnyRowComplete(board));
    }

    @Test
    public void the_second_row_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 1, 0, 2, 2, 2, 0, 0, 0 });
        assertTrue(GameOver.isAnyRowComplete(board));
    }

    @Test
    public void the_second_row_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });
        assertFalse(GameOver.isAnyRowComplete(board));
    }

    @Test
    public void the_third_row_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 1, 1, 1 });
        assertTrue(GameOver.isAnyRowComplete(board));
    }

    @Test
    public void the_third_row_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 1, 0, 0, 0, 0, 2, 2, 2 });
        assertTrue(GameOver.isAnyRowComplete(board));
    }

    @Test
    public void the_third_row_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });
        assertFalse(GameOver.isAnyRowComplete(board));
    }     
}
