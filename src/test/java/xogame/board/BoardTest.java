package xogame.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import xogame.models.Board;

public class BoardTest {
    @Test
    public void fresh_board_should_contain_only_zeros() {
        Board board = new Board();
        
        Arrays.stream(board.getBoard()).forEach(e -> {
            assertEquals(0, e, "Invalid initial board state.");
        });
    }

    @Test
    public void fresh_board_should_contain_nine_elements() {
        Board board = new Board();
        
        assertEquals(9, board.getBoard().length, "Invalid board size.");
    }
}
