package org.lecture;

import java.util.concurrent.ThreadLocalRandom;

public class Game {

    static void main() {

        Move player1 = Move.SCISSORS;
        Move player2 = Move.PAPER;

        // Player 1 vs. Player 2
        System.out.println( evaluateMove(player1, player2, "Player 2"));

        // a random number will pick one of three hands
        Move computer = switch (ThreadLocalRandom.current().nextInt(1, 4)) {
            case 1 -> Move.ROCK;
            case 2 -> Move.PAPER;
            case 3 -> Move.SCISSORS;
            default ->
                    throw new IllegalStateException("Unexpected value: " + ThreadLocalRandom.current().nextInt(1, 4));
        };

        // Player 1 vs. Computer
        System.out.println(evaluateMove(player1, computer, "Computer"));

    }

    // Returns the winner of the game
    private static String evaluateMove(Move player1, Move player2, String competitor) {

        // Tie
        if (player1.equals(player2)) {
            return "Tie";
        }

        // Player 1 wins
        if (player1RockBeatScissors(player1, player2)  ||
            player1PaperBeatsRock(player1, player2)    ||
            player1ScissorBeatsPaper(player1, player2)
        ) {
            return "Player 1 wins" + " | " + player1.name() + " vs. " + player2.name();
        }

        // Player 2 or Computer wins if no condition above is met
        return competitor + " wins | " + player2.name() + " vs. " + player1.name();
    }

    private static boolean player1ScissorBeatsPaper(Move player1, Move player2) {
        return player1.equals(Move.SCISSORS) && player2.equals(Move.PAPER);
    }

    private static boolean player1PaperBeatsRock(Move player1, Move player2) {
        return player1.equals(Move.PAPER) && player2.equals(Move.ROCK);
    }

    private static boolean player1RockBeatScissors(Move player1, Move player2) {
        return player1.equals(Move.ROCK) && player2.equals(Move.SCISSORS);
    }

}
