package java.operators;

import java.modules.Board;
import java.modules.DefaultBoard;
import java.modules.DefaultPlayer;
import java.modules.GameStatus;
import java.modules.Move;
import java.modules.Player;

public class GameProcessor {
    private Board board;
    private Player currentPlayer;
    private Player nextPlayer;
    
    private GameProcessor(DefaultBoard board, DefaultPlayer currentPlayer, DefaultPlayer nextPlayer) {
        this.board = board;
        this.currentPlayer = currentPlayer;
        this.nextPlayer = nextPlayer;
    }
    
    public static GameProcessor getDefaultGame(DefaultBoard board, DefaultPlayer currentPlayer, DefaultPlayer nextPlayer) {
        return new GameProcessor(board, currentPlayer, nextPlayer);
    }
    
    public void startGame() {
        System.out.println("Ready? Go!");
        while (true) {
            GameStatus gameStatus = processGameRound();
            if (gameStatus == GameStatus.CONTINUE) {
                swapUser();
            } else {
                endGame(gameStatus);
                break;
            }
        }
    }
    
    /**
     * Process one round from asking current player to make a move to return game result after current move
     * @return game result after applied current move
     */
    public GameStatus processGameRound() {
        Move move;
        do {
            move = currentPlayer.makeMove();
        } while (!board.isMoveValid(move));
        board.addMove(currentPlayer, move);
        board.display();
        return ResultChecker.getInstance().getGameStatus(board);
    }
    
    public void swapUser() {
        Player temp = nextPlayer;
        nextPlayer = currentPlayer;
        currentPlayer = temp;
    }
    
    private void endGame(GameStatus gameStatus) {
        System.out.println(gameStatus == GameStatus.HAS_WINNER ? "You win!" : "Is Tie");
    }
}

