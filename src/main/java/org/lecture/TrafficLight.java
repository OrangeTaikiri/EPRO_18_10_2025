package org.lecture;

/**
 * Represents a traffic light with three states: RED, YELLOW, and GREEN.
 * Each state has an associated duration in seconds, representing how long
 * the light remains in that state.
 */
public enum TrafficLight {
    RED(30),
    YELLOW(3),
    GREEN(25);

    private final int seconds;

    // Constructor
    TrafficLight(int seconds) {
        this.seconds = seconds;
    }

    // Returns the number of seconds for the light to be on
    public int getSeconds() {
        return seconds;
    }

    /**
     * Capitalizes the name of the traffic light state by converting the first letter
     * to uppercase and the remaining letters to lowercase.
     *
     * @return a string representation of the traffic light state with proper capitalization
     */
    public String capitalize() {
       return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();

    }
}
