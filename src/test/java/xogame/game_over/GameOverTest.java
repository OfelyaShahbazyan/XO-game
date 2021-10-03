package xogame.game_over;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class GameOverTest {

    @Test
    public void get_rows_of_the_board() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });
        assertEquals(3, board.getRows().size());
    }
    
    @Test
    public void get_columns_of_the_board() {
        Board board = new Board(new int[] { 2, 2, 0, 1, 1, 1, 0, 0, 0 });
        assertEquals(3, board.getColumns().size());
    } 
    
    @Test
    public void get_diagonals_of_the_board() {
        Board board = new Board(new int[] { 2, 2, 0, 1, 1, 1, 0, 0, 0 });
        assertEquals(2, board.getDiagonals().size());
    } 

    @Test
    public void check_content_of_the_board_by_rows() {
        Board board = new Board(new int[] { 2, 1, 0, 0, 2, 1, 1, 0, 2 });
        assertEquals(Arrays.stream(new int[] { 2, 1, 0 }).boxed().collect(Collectors.toList()), board.getRows().get(0));
        assertEquals(Arrays.stream(new int[] { 0, 2, 1 }).boxed().collect(Collectors.toList()), board.getRows().get(1));
        assertEquals(Arrays.stream(new int[] { 1, 0, 2 }).boxed().collect(Collectors.toList()), board.getRows().get(2));
    }

    @Test
    public void check_content_of_the_board_by_columns() {
        Board board = new Board(new int[] { 2, 1, 0, 0, 2, 1, 1, 0, 2 });
        assertEquals(Arrays.stream(new int[] { 2, 0, 1 }).boxed().collect(Collectors.toList()), board.getColumns().get(0));
        assertEquals(Arrays.stream(new int[] { 1, 2, 0 }).boxed().collect(Collectors.toList()), board.getColumns().get(1));
        assertEquals(Arrays.stream(new int[] { 0, 1, 2 }).boxed().collect(Collectors.toList()), board.getColumns().get(2));
    }

    @Test
    public void check_content_of_the_board_by_diagonals() {
        Board board = new Board(new int[] { 2, 1, 2, 0, 1, 2, 1, 0, 0 });
        assertEquals(Arrays.stream(new int[] { 2, 1, 0 }).boxed().collect(Collectors.toList()), board.getDiagonals().get(0));
        assertEquals(Arrays.stream(new int[] { 2, 1, 1 }).boxed().collect(Collectors.toList()), board.getDiagonals().get(1));
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
        
    @Test
    public void the_first_column_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 1, 2, 0, 1, 2, 0, 1, 0, 0 });
        assertTrue(GameOver.isAnyColumnComplete(board));
    }

    @Test
    public void the_first_column_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 2, 1, 0, 2, 1, 0, 2, 0, 0 });
        assertTrue(GameOver.isAnyColumnComplete(board));
    }

    @Test
    public void the_first_column_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 0, 1, 2, 0, 1, 0 });
        assertFalse(GameOver.isAnyColumnComplete(board));
    }

    @Test
    public void the_second_column_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 1, 0, 2, 1, 0, 0, 1, 0 });
        assertTrue(GameOver.isAnyColumnComplete(board));
    }

    @Test
    public void the_second_column_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 2, 0, 1, 2, 1, 0, 2, 0 });
        assertTrue(GameOver.isAnyColumnComplete(board));
    }

    @Test
    public void the_second_column_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 0, 0, 2, 1, 0, 1 });
        assertFalse(GameOver.isAnyColumnComplete(board));
    }

    @Test
    public void the_third_column_is_complete_if_it_contains_all_ones() {
        Board board = new Board(new int[] { 2, 1, 1, 2, 1, 1, 0, 0, 1 });
        assertTrue(GameOver.isAnyColumnComplete(board));
    }

    @Test
    public void the_third_column_is_complete_if_it_contains_all_twos() {
        Board board = new Board(new int[] { 1, 0, 2, 1, 0, 2, 0, 1, 2 });
        assertTrue(GameOver.isAnyColumnComplete(board));
    }

    @Test
    public void the_third_column_is_not_complete_if_it_contains_all_zeros() {
        Board board = new Board(new int[] { 0, 0, 0, 0, 0, 0, 1, 0, 0 });
        assertFalse(GameOver.isAnyColumnComplete(board));
    }
}
