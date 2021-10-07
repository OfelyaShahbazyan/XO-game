package xogame.is_complete;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class IsAnyColumnCompleteTest {
    @Test
    public void the_first_column_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 1, 2, 0, 1, 2, 0, 1, 0, 0 });

        assertTrue(IsComplete.isAnyColumnComplete(board));
    }

    @Test
    public void the_first_column_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 2, 1, 0, 2, 1, 0, 2, 0, 0 });

        assertTrue(IsComplete.isAnyColumnComplete(board));
    }

    @Test
    public void the_first_column_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 0, 1, 2, 0, 1, 0 });

        assertFalse(IsComplete.isAnyColumnComplete(board));
    }

    @Test
    public void the_second_column_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 1, 0, 2, 1, 0, 0, 1, 0 });

        assertTrue(IsComplete.isAnyColumnComplete(board));
    }

    @Test
    public void the_second_column_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 2, 0, 1, 2, 1, 0, 2, 0 });

        assertTrue(IsComplete.isAnyColumnComplete(board));
    }

    @Test
    public void the_second_column_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 0, 0, 2, 1, 0, 1 });

        assertFalse(IsComplete.isAnyColumnComplete(board));
    }

    @Test
    public void the_third_column_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 1, 1, 2, 1, 1, 0, 0, 1 });

        assertTrue(IsComplete.isAnyColumnComplete(board));
    }

    @Test
    public void the_third_column_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 0, 2, 1, 0, 2, 0, 1, 2 });

        assertTrue(IsComplete.isAnyColumnComplete(board));
    }

    @Test
    public void the_third_column_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 0, 0, 0, 1, 0, 0 });
        
        assertFalse(IsComplete.isAnyColumnComplete(board));
    }
}
