package xogame.is_complete.any_diagonal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xogame.is_complete.GameOver;
import xogame.models.Board;

public class IsAnyDiagonalCompleteTest {
    @Test
    public void the_primary_diagonal_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 1, 2, 0, 2, 1, 2, 0, 0, 1 });

        assertTrue(GameOver.isAnyDiagonalComplete(board));
    }

    @Test
    public void the_primary_diagonal_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 2, 1, 0, 1, 2, 0, 2, 0, 2 });

        assertTrue(GameOver.isAnyDiagonalComplete(board));
    }

    @Test
    public void the_primary_diagonal_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 0, 0, 2, 0, 1, 0 });

        assertFalse(GameOver.isAnyDiagonalComplete(board));
    }

    @Test
    public void the_secondary_diagonal_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 1, 1, 2, 1, 0, 1, 1, 0 });

        assertTrue(GameOver.isAnyDiagonalComplete(board));
    }

    @Test
    public void the_secondary_diagonal_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 2, 2, 1, 2, 1, 2, 2, 0 });

        assertTrue(GameOver.isAnyDiagonalComplete(board));
    }

    @Test
    public void the_secondary_diagonal_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 0, 0, 2, 0, 0, 1 });

        assertFalse(GameOver.isAnyDiagonalComplete(board));
    }
}
