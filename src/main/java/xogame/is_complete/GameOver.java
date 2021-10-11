package xogame.is_complete;

import java.util.List;
import java.util.function.Predicate;

import xogame.board_utils.BoardUtils;
import xogame.list_utils.ListUtils;
import xogame.models.Board;

public class GameOver {
    public static final Predicate<List<Integer>> listPredicate = list -> list.stream().allMatch(e -> e == 1) || list.stream().allMatch(e -> e == 2);

    public static Boolean isTheGameOver(Board board){
        return isAnyRowComplete(board) || isAnyColumnComplete(board) ||
                isAnyDiagonalComplete(board) || !BoardUtils.doesBoardContainAtLeastOneEmptyCell(board);
    }    
    
    public static Boolean isAnyRowComplete(Board board) {
        return ListUtils.doesAnyInnerListMatchTheCondition(board.getRows(), listPredicate);
    }

    public static Boolean isAnyColumnComplete(Board board) {
        return ListUtils.doesAnyInnerListMatchTheCondition(board.getColumns(), listPredicate);
    }

    public static Boolean isAnyDiagonalComplete(Board board) {
        return ListUtils.doesAnyInnerListMatchTheCondition(board.getDiagonals(), listPredicate);
    }
}
