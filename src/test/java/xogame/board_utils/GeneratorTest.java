package xogame.board_utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import xogame.models.Board;
import xogame.utils.Result;

public class GeneratorTest {
    @Test
    public void filling_first_row_of_the_board_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 1, 1, 0, 0 }),
                Generator.generate_an_empty_board_and_fill_the_given_row_with_symbol(2, 0, 1).value);
    }

    @Test
    public void filling_second_row_of_the_board_with_twos_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 0, 2, 2 }),
                Generator.generate_an_empty_board_and_fill_the_given_row_with_symbol(2, 1, 2).value);
    }

    @Test
    public void filling_third_row_of_the_board_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 0, 0, 0, 0, 0, 1, 1, 1 }),
                Generator.generate_an_empty_board_and_fill_the_given_row_with_symbol(3, 2, 1).value);
    }

    @Test
    public void filling_sixth_row_of_the_board_with_ones_should_fail_to_match() {
        Result<Board> res = Generator.generate_an_empty_board_and_fill_the_given_row_with_symbol(3, 5, 1);

        assertEquals(new Board(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 }), res.value);
        assertEquals("Invalid row number.", res.errorMessage);
        assertFalse(res.isSuccess);
    }

    @Test
    public void filling_first_column_of_the_board_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 1, 0, 1, 0 }), Generator.generate_an_empty_board_and_fill_the_given_column_with_symbol(2, 0, 1).value);
    }

    @Test
    public void filling_second_column_of_the_board_with_twos_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 1, 0, 1 }), Generator.generate_an_empty_board_and_fill_the_given_column_with_symbol(2, 1, 1).value);
    }

    @Test
    public void filling_third_column_of_the_board_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 0, 1, 0, 0, 1, 0, 0, 1 }),
                Generator.generate_an_empty_board_and_fill_the_given_column_with_symbol(3, 2, 1).value);
    }

    @Test
    public void filling_sixth_column_of_the_board_with_ones_should_fail_to_match() {
        Result<Board> res = Generator.generate_an_empty_board_and_fill_the_given_column_with_symbol(3, 5, 1);

        assertEquals(new Board(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 }), res.value);
        assertEquals("Invalid column number.", res.errorMessage);
        assertFalse(res.isSuccess);
    }

    @Test
    public void filling_primary_diagonal_of_the_board_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 1, 0, 0, 1 }),
                Generator.generate_an_empty_board_and_fill_the_primary_diagonal_with_symbol(2, 1).value);
    }

    @Test
    public void filling_secondary_diagonal_of_the_board_with_ones_should_succeed_to_match() {
        assertEquals(new Board(new int[] { 0, 0, 2, 0, 2, 0, 2, 0, 0 }),
                Generator.generate_an_empty_board_and_fill_the_secondary_diagonal_with_symbol(3, 2).value);
    }
}
