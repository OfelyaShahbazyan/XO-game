package xogame.is_complete;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class GameOverTest {
    @Test
    public void the_game_should_be_over_if_first_row_all_ones() {
        Board board = new Board(new int[] { 1, 1, 1, 2, 2, 0, 0, 0, 0 });

        assertTrue(GameOver.isTheGameOver(board));
    }

    @Test
    public void the_game_should_be_over_if_second_row_all_ones() {
        Board board = new Board(new int[] { 2, 2, 0, 1, 1, 1, 0, 0, 0 });

        assertTrue(GameOver.isTheGameOver(board));
    }

    @Test
    public void the_game_should_be_over_if_third_row_all_ones() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 1, 1, 1 });

        assertTrue(GameOver.isTheGameOver(board));
    }

    @Test
    public void the_game_should_be_over_if_first_column_all_ones() {
        Board board = new Board(new int[] { 1, 2, 0, 1, 0, 0, 1, 0, 1 });

        assertTrue(GameOver.isTheGameOver(board));
    }

    @Test
    public void the_game_should_be_over_if_second_column_all_ones() {
        Board board = new Board(new int[] { 0, 1, 0, 2, 1, 0, 2, 1, 1 });

        assertTrue(GameOver.isTheGameOver(board));
    }

    @Test
    public void the_game_should_be_over_if_third_column_all_ones() {
        Board board = new Board(new int[] { 0, 2, 1, 2, 1, 1, 2, 0, 1 });

        assertTrue(GameOver.isTheGameOver(board));
    }

    @Test
    public void the_game_should_be_over_if_primary_diagonal_all_ones() {
        Board board = new Board(new int[] { 1, 2, 0, 0, 1, 0, 2, 0, 1 });

        assertTrue(GameOver.isTheGameOver(board));
    }

    @Test
    public void the_game_should_be_over_if_secondary_diagonal_all_ones() {
        Board board = new Board(new int[] { 0, 2, 1, 0, 1, 2, 1, 0, 2 });

        assertTrue(GameOver.isTheGameOver(board));
    }

    @Test
    public void the_game_should_be_over_if_the_board_is_full() {
        Board board = new Board(new int[] { 2, 2, 1, 1, 1, 2, 2, 1, 2 });

        assertTrue(GameOver.isTheGameOver(board));
    }

    @Test
    public void the_game_should_not_be_over_if_the_board_is_not_full() {
        Board board = new Board(new int[] { 2, 2, 1, 1, 1, 2, 0, 1, 2 });

        assertFalse(GameOver.isTheGameOver(board));
    }
}
