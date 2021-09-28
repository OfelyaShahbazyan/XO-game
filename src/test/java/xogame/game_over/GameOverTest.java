package xogame.game_over;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class GameOverTest {

    @Test
    public void the_first_row_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 1, 1, 1, 2, 2, 0, 0, 0, 0 });
        assertTrue(GameOver.isARowComplete(0, board));
    }

    @Test
    public void the_first_row_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 2, 2, 2, 2, 2, 0, 0, 0, 0 });
        assertTrue(GameOver.isARowComplete(0, board));
    }

    @Test
    public void the_first_row_is_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 1, 0, 2, 2, 0, 0, 0, 0 });
        assertFalse(GameOver.isARowComplete(0, board));
    }

    @Test
    public void the_second_row_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 2, 0, 1, 1, 1, 0, 0, 0 });
        assertTrue(GameOver.isARowComplete(1, board));
    }

    @Test
    public void the_second_row_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 1, 0, 2, 2, 2, 0, 0, 0 });
        assertTrue(GameOver.isARowComplete(1, board));
    }

    @Test
    public void the_second_row_is_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });
        assertFalse(GameOver.isARowComplete(1, board));
    }

    @Test
    public void the_third_row_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 1, 1, 1 });
        assertTrue(GameOver.isARowComplete(2, board));
    }

    @Test
    public void the_third_row_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 1, 0, 0, 0, 0, 2, 2, 2 });
        assertTrue(GameOver.isARowComplete(2, board));
    }

    @Test
    public void the_third_row_is_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });
        assertFalse(GameOver.isARowComplete(2, board));
    }

    @Test
    public void get_rows_from_list_of_lists() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });
        assertEquals(3, board.getRows().size());
    }
}
