package xogame.board_utils;

import java.util.Arrays;

import xogame.models.Board;

public class BoardUtils {
    public static Boolean isTheBoardFull(Board board){
        return Arrays.stream(board.getBoard()).noneMatch(x -> x == 0);
    }    
}
