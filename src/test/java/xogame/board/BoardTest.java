package xogame.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class BoardTest {
    @Test
    public void freshBoardShouldContainOnlyZeros() {
        Board board = new Board();
        
        Arrays.stream(board.board).forEach(e -> {
            assertEquals(0, e, "Invalid initial board state.");
        });
    }

    @Test
    public void freshBoardShouldContainNineElements() {
        Board board = new Board();
        
        assertEquals(9, board.board.length, "Invalid board size.");
    }
}
