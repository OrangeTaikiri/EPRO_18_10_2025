package org.lecture;

import java.util.Scanner;

public class Game {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        Move player1 = Move.SCISSORS;
        Move player2 = Move.PAPER;

        System.out.println( evaluateMove(player1, player2));



    }

    // Returns the winner of the game
    private static String evaluateMove(Move player1, Move player2) {

        // Tie
        if (player1.equals(player2)) {
            return "Tie";
        }

        // Player 1 wins
        if (player1RockBeatScissors(player1, player2)  ||
            player1PaperBeatsRock(player1, player2)    ||
            player1ScissorBeatsPaper(player1, player2)
        ) {
            return "Player 1 wins";
        }

        // Player 2 wins if no condition above is met
        return "Player 2 wins";
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
