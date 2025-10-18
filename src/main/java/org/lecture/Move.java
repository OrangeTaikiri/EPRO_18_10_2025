package org.lecture;

/**
 * Represents the possible moves
 *
 * ROCK - Beats SCISSORS but is beaten by PAPER.
 * PAPER - Beats ROCK but is beaten by SCISSORS.
 * SCISSORS - Beats PAPER but is beaten by ROCK.
 *
 * This enum provides the foundation for determining the outcome of the game
 * based on the interactions between these moves.
 */
public enum Move {
    ROCK,
    PAPER,
    SCISSORS;
}
