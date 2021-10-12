package xogame.board_utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GeneratorTest {
    @Test
    public void count_of_boards_containing_rows_all_ones_should_be_three() {
        assertEquals(3, Generator.fill_in_row_of_a_board_with_symbol(1, 3).size());
    }

    @Test
    public void count_of_boards_containing_rows_all_twos_should_be_three() {
        assertEquals(3, Generator.fill_in_row_of_a_board_with_symbol(2, 3).size());
    }

    @Test
    public void board_containing_first_row_all_ones_should_succeed_to_match() {
        assertArrayEquals(new int[] { 1, 1, 1, 0, 0, 0, 0, 0, 0 },
                Generator.fill_in_row_of_a_board_with_symbol(1, 3).get(0).getBoard());
    }

    @Test
    public void board_containing_second_row_all_ones_should_succeed_to_match() {
        assertArrayEquals(new int[] { 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                Generator.fill_in_row_of_a_board_with_symbol(1, 3).get(1).getBoard());
    }

    @Test
    public void board_containing_third_row_all_ones_should_succeed_to_match() {
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 1, 1, 1 },
                Generator.fill_in_row_of_a_board_with_symbol(1, 3).get(2).getBoard());
    }

    @Test
    public void board_containing_first_row_all_twos_should_succeed_to_match() {
        assertArrayEquals(new int[] { 2, 2, 2, 0, 0, 0, 0, 0, 0 },
                Generator.fill_in_row_of_a_board_with_symbol(2, 3).get(3).getBoard());
    }

    @Test
    public void board_containing_second_row_all_twos_should_succeed_to_match() {
        assertArrayEquals(new int[] { 0, 0, 0, 2, 2, 2, 0, 0, 0 },
                Generator.fill_in_row_of_a_board_with_symbol(2, 3).get(4).getBoard());
    }

    @Test
    public void board_containing_third_row_all_twos_should_succeed_to_match() {
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 2, 2, 2 },
                Generator.fill_in_row_of_a_board_with_symbol(2, 3).get(5).getBoard());
    }
}
