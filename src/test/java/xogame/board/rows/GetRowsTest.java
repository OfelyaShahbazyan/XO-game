package xogame.board.rows;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class GetRowsTest {
    @Test
    public void get_rows_of_the_board() {
        Board board = new Board(new int[] { 2, 2, 0, 0, 0, 0, 0, 0, 0 });

        assertEquals(3, board.getRows().size());
    }

    @Test
    public void check_content_of_the_board_by_rows() {
        Board board = new Board(new int[] { 2, 1, 0, 0, 2, 1, 1, 0, 2 });

        assertEquals(Arrays.asList(2, 1, 0), board.getRows().get(0));
        assertEquals(Arrays.asList(0, 2, 1), board.getRows().get(1));
        assertEquals(Arrays.asList(1, 0, 2), board.getRows().get(2));
    }
}
