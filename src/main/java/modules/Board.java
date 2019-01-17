package java.modules;

import java.util.Collections;
import java.util.Map;

public abstract class Board {
    private Map<Player, Move> moves = Collections.emptyMap();
    
    public Map<Player, Move> getMoves() {
        return moves;
    }
    public void addMove(Player currentPlayer, Move move) { moves.put(currentPlayer, move); }
    public abstract boolean isMoveValid(Move move);
    
    public abstract void display();
}

