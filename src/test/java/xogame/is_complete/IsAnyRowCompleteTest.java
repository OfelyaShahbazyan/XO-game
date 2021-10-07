package xogame.is_complete;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class IsAnyRowCompleteTest {
    @Test
    public void the_first_row_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 1, 1, 1, 2, 2, 0, 0, 0, 0 });

        assertTrue(IsComplete.isAnyRowComplete(board));
    }

    @Test
    public void the_first_row_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 2, 2, 2, 1, 1, 0, 0, 0, 0 });

        assertTrue(IsComplete.isAnyRowComplete(board));
    }

    @Test
    public void the_first_row_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 2, 2, 0, 0, 0, 0 });

        assertFalse(IsComplete.isAnyRowComplete(board));
    }

    @Test
    public void the_second_row_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 2, 0, 1, 1, 1, 0, 0, 0 });

        assertTrue(IsComplete.isAnyRowComplete(board));
    }

    @Test
    public void the_second_row_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 1, 0, 2, 2, 2, 0, 0, 0 });

        assertTrue(IsComplete.isAnyRowComplete(board));
    }

    @Test
    public void the_second_row_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });

        assertFalse(IsComplete.isAnyRowComplete(board));
    }

    @Test
    public void the_third_row_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 1, 1, 1 });

        assertTrue(IsComplete.isAnyRowComplete(board));
    }

    @Test
    public void the_third_row_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 1, 0, 0, 0, 0, 2, 2, 2 });

        assertTrue(IsComplete.isAnyRowComplete(board));
    }

    @Test
    public void the_third_row_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });

        assertFalse(IsComplete.isAnyRowComplete(board));
    }     
}
