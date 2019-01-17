package java.operators;

import java.modules.Board;
import java.modules.GameStatus;

public class ResultChecker {
    
    public static ResultChecker getInstance() {
        return new ResultChecker();
    }
    
    /**
     * Check the game status after applying the current move
     * @param board
     * @return CONTINUE if game is not ended; TIE if is tie; HAS_WINNER means game ended and current user is winner
     */
    public GameStatus getGameStatus(Board board) {
        return GameStatus.CONTINUE;
    }
    
    private boolean isTie(Board board) {
        return false;
    }
    
    private boolean isCurrentPlayerWin(Board board) {
        return false;
    }
}
