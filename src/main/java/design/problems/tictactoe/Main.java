package design.problems.tictactoe;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User a = new User("Sahil");
        User b = new User("Sanjit");

        Game game = new Game(3, Arrays.asList(a, b));
        User winner = game.start();
        if (winner == null) {
            System.out.println("Draw");
        } else {
            System.out.printf("%s is the winner\n", winner.getName());
        }
    }
}
