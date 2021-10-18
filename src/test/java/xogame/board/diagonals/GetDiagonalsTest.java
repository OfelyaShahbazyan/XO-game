package xogame.board.diagonals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class GetDiagonalsTest {
    @Test
    public void get_diagonals_of_the_board() {
        Board board = new Board(new int[] { 2, 2, 0, 1, 1, 1, 0, 0, 0 });

        assertEquals(2, board.getDiagonals().size());
    }

    @Test
    public void check_content_of_the_board_by_diagonals() {
        Board board = new Board(new int[] { 2, 1, 2, 0, 1, 2, 1, 0, 0 });
        
        assertEquals(Arrays.asList(2, 1, 0), board.getDiagonals().get(0));
        assertEquals(Arrays.asList(2, 1, 1), board.getDiagonals().get(1));
    }    
}
