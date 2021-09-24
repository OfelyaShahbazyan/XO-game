package xogame.moves;

import xogame.models.Board;
import xogame.models.Coordinate;
import xogame.models.Move;
import xogame.utils.Result;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MoveTests {
  @Test
  public void playerCannotPlaceASymbolOnAnOccupiedCell() {
    Coordinate c = new Coordinate(1, 1); 
    int[] busyBoard = new int[] {0,0,0,0,1,0,0,0,0};
    Board board = new Board(busyBoard);
    
    Result<Board> res = Move.move(c, 1, board);
    
    assertEquals(board, res.value);
    assertEquals("Cell has been taken.", res.errorMessage);
    assertFalse(res.isSuccess);
  }


  @Test
  public void playerCanPlaceASymbolOnAFreeCell() {
    Coordinate c = new Coordinate(1, 1); 
    Board board = new Board();
    int[] busyBoard = new int[] {0,0,0,0,1,0,0,0,0};
    
    Result<Board> res = Move.move(c, 1, board);

    assertArrayEquals(busyBoard, res.value.getBoard());
    assertTrue(res.errorMessage.isEmpty());
    assertTrue(res.isSuccess);    
  }
}