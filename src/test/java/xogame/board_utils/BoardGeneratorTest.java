package xogame.board_utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import xogame.models.Board;
import xogame.utils.Result;

public class BoardGeneratorTest {
    @Test
    public void generating_an_empty_board_of_size_two_and_filling_first_row_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 1, 1, 0, 0 }),
                BoardGenerator.generate_an_empty_board_and_fill_the_given_row_with_symbol(2, 0, 1).value);
    }

    @Test
    public void generating_an_empty_board_of_size_two_and_filling_second_row_with_twos_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 0, 2, 2 }),
                BoardGenerator.generate_an_empty_board_and_fill_the_given_row_with_symbol(2, 1, 2).value);
    }

    @Test
    public void generating_an_empty_board_of_size_three_and_filling_third_row_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 0, 0, 0, 0, 0, 1, 1, 1 }),
                BoardGenerator.generate_an_empty_board_and_fill_the_given_row_with_symbol(3, 2, 1).value);
    }

    @Test
    public void generating_an_empty_board_of_size_two_and_filling_second_row_with_ones_should_succeed_to_match() {
        Result<Board> res = BoardGenerator.generate_an_empty_board_and_fill_the_given_row_with_symbol(2, 2, 1);

        assertEquals(new Board(new int[] { 0, 0, 0, 0 }), res.value);
        assertEquals("Invalid row number.", res.errorMessage);
        assertFalse(res.isSuccess);
    }

    @Test
    public void generating_an_empty_board_of_size_two_and_filling_first_column_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 1, 0, 1, 0 }),
                BoardGenerator.generate_an_empty_board_and_fill_the_given_column_with_symbol(2, 0, 1).value);
    }

    @Test
    public void generating_an_empty_board_of_size_two_and_filling_second_column_with_twos_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 1, 0, 1 }),
                BoardGenerator.generate_an_empty_board_and_fill_the_given_column_with_symbol(2, 1, 1).value);
    }

    @Test
    public void generating_an_empty_board_of_size_three_and_filling_third_column_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 0, 1, 0, 0, 1, 0, 0, 1 }),
                BoardGenerator.generate_an_empty_board_and_fill_the_given_column_with_symbol(3, 2, 1).value);
    }

    @Test
    public void generating_an_empty_board_of_size_three_and_filling_sixth_column_with_ones_should_succeed_to_match() {
        Result<Board> res = BoardGenerator.generate_an_empty_board_and_fill_the_given_column_with_symbol(3, 3, 1);

        assertEquals(new Board(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 }), res.value);
        assertEquals("Invalid column number.", res.errorMessage);
        assertFalse(res.isSuccess);
    }

    @Test
    public void generating_an_empty_board_of_size_two_and_filling_primary_diagonal_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 1, 0, 0, 1 }),
                BoardGenerator.generate_an_empty_board_and_fill_the_primary_diagonal_with_symbol(2, 1).value);
    }

    @Test
    public void generating_an_empty_board_of_size_three_and_filling_secondary_diagonal_with_twos_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 0, 2, 0, 2, 0, 2, 0, 0 }),
                BoardGenerator.generate_an_empty_board_and_fill_the_secondary_diagonal_with_symbol(3, 2).value);
    }
}
