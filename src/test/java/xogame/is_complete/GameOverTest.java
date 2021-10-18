package xogame.is_complete;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xogame.board_utils.BoardGenerator;
import xogame.models.Board;

public class GameOverTest {
    @Test
    public void the_game_should_be_over_if_first_row_all_ones() {
        assertTrue(GameOver.isTheGameOver(BoardGenerator.generate_an_empty_board_and_fill_the_given_row_with_symbol(3, 0, 1).value));
    }

    @Test
    public void the_game_should_be_over_if_second_row_all_ones() {
        assertTrue(GameOver.isTheGameOver(BoardGenerator.generate_an_empty_board_and_fill_the_given_row_with_symbol(3, 1, 1).value));
    }

    @Test
    public void the_game_should_be_over_if_third_row_all_ones() {
        assertTrue(GameOver.isTheGameOver(BoardGenerator.generate_an_empty_board_and_fill_the_given_row_with_symbol(3, 2, 1).value));
    }

    @Test
    public void the_game_should_be_over_if_first_column_all_ones() {
        assertTrue(GameOver.isTheGameOver(BoardGenerator.generate_an_empty_board_and_fill_the_given_column_with_symbol(3, 0, 1).value));
    }

    @Test
    public void the_game_should_be_over_if_second_column_all_ones() {
        assertTrue(GameOver.isTheGameOver(BoardGenerator.generate_an_empty_board_and_fill_the_given_column_with_symbol(3, 1, 1).value));
    }

    @Test
    public void the_game_should_be_over_if_third_column_all_ones() {
        assertTrue(GameOver.isTheGameOver(BoardGenerator.generate_an_empty_board_and_fill_the_given_column_with_symbol(3, 2, 1).value));
    }

    @Test
    public void the_game_should_be_over_if_primary_diagonal_all_ones() {
        assertTrue(GameOver.isTheGameOver(BoardGenerator.generate_an_empty_board_and_fill_the_primary_diagonal_with_symbol(3, 1).value));
    }

    @Test
    public void the_game_should_be_over_if_secondary_diagonal_all_ones() {
        assertTrue(GameOver.isTheGameOver(BoardGenerator.generate_an_empty_board_and_fill_the_secondary_diagonal_with_symbol(3, 1).value));
    }

    @Test
    public void the_game_should_be_over_if_the_board_is_full() {
        assertTrue(GameOver.isTheGameOver(new Board(new int[]{ 1, 2, 1, 2, 1, 2, 2, 1, 2})));
    }

    @Test
    public void the_game_should_not_be_over_if_the_board_is_not_full() {
        assertFalse(GameOver.isTheGameOver(new Board(new int[]{ 1, 2, 1, 0, 1, 2, 2, 1, 2})));
    }
}
