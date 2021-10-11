package xogame.board.columns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import xogame.models.Board;

public class GetColumnsTest {
    @Test
    public void get_columns_of_the_board() {
        Board board = new Board(new int[] { 2, 2, 0, 1, 1, 1, 0, 0, 0 });

        assertEquals(3, board.getColumns().size());
    }

    @Test
    public void check_content_of_the_board_by_columns() {
        Board board = new Board(new int[] { 2, 1, 0, 0, 2, 1, 1, 0, 2 });

        assertEquals(Arrays.stream(new int[] { 2, 0, 1 }).boxed().collect(Collectors.toList()), board.getColumns().get(0));
        assertEquals(Arrays.stream(new int[] { 1, 2, 0 }).boxed().collect(Collectors.toList()), board.getColumns().get(1));
        assertEquals(Arrays.stream(new int[] { 0, 1, 2 }).boxed().collect(Collectors.toList()), board.getColumns().get(2));
    }    
}