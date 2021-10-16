package xogame.models;

import xogame.utils.Result;

public class Move {
  public static Result<Board> move(Coordinate coordinate, int symbol, Board board) {
    int idx = coordinate.x + 3 * coordinate.y;

    if (board.getBoard()[idx] == 0) {
      int[] newBoard = board.getBoard();
      newBoard[coordinate.x + 3 * coordinate.y] = symbol;
      
      return new Result<Board>(new Board(newBoard));
    } else {
      return new Result<Board>(board, "Cell has been taken.");
    }
  }
}
