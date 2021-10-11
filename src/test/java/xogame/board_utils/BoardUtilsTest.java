package xogame.board_utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import xogame.board_utils.BoardUtilsTest;
import xogame.models.Board;

public class BoardUtilsTest {
    @Test
    public void empty_board_should_fail_to_match(){
        Board board = new Board();

        assertFalse(BoardUtils.isTheBoardFull(board));
    }

    @Test
    public void full_board_should_succeed_to_match(){
        Board board = new Board(new int[] {1, 2, 1, 1, 2, 2, 2, 1, 1});

        assertTrue(BoardUtils.isTheBoardFull(board));
    }

    @Test
    public void board_containing_at_least_one_empty_cell_should_fail_to_match(){
        Board board = new Board(new int[] {1, 2, 1, 1, 2, 2, 2, 1, 0});

        assertFalse(BoardUtils.isTheBoardFull(board));
    }    
}
