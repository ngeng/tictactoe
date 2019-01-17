package java.modules;

import java.util.Scanner;

public class DefaultPlayer extends Player {
    @Override
    public Move makeMove() {
        // Keep asking for user input until get a valid one, then convert to Move format
        Scanner input = new Scanner(System.in);
        int userInput;
        do {
            // ask for user input
            System.out.print("Please make your move: ");
            // get input
            userInput = input.nextInt();
        } while (!isInputValid(userInput));
    
        return new Move(userInput);
    }
    
    private boolean isInputValid(int input) {
        return true;
    }
}
