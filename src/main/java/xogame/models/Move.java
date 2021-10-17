package xogame.models;

import xogame.utils.Result;

public class Move {
  public static Result<Board> move(Coordinate coordinate, int symbol, Board board) {
    int idx = coordinate.x + 3 * coordinate.y;
    Result<Board> result = new Result<Board>(board, "Cell has been taken.");

    if (board.getBoard()[idx] == 0) {
      int[] newBoard = board.getBoard();
      newBoard[coordinate.x + 3 * coordinate.y] = symbol;
      result = new Result<Board>(new Board(newBoard));
    }

    return result;
  }
}
