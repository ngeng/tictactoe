package java;

import java.modules.DefaultBoard;
import java.modules.DefaultPlayer;
import java.operators.GameProcessor;

public class App {
    public static void main(String[] args) {
        // init game
        GameProcessor game = GameProcessor.getDefaultGame(
                new DefaultBoard(),
                new DefaultPlayer(),
                new DefaultPlayer()
        );
        game.startGame();
    }
}
