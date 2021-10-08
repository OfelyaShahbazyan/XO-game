package xogame.board_utils;

import java.util.Arrays;

import xogame.models.Board;

public class BoardUtils {
    public static Boolean doesBoardContainAtLeastOneEmptyCell(Board board){
        return Arrays.stream(board.getBoard()).anyMatch(x -> x == 0);
    }    
}
