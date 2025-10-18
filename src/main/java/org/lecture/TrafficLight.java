package org.lecture;

/** TrafficLight enum
 * with a constructor and a
 * method to get the number of
 * seconds for the light to be on
 * */
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

    public String capitalize() {
        // RED
       String firstLetter = this.name().substring(0, 1).toUpperCase();
       String remainingLetters = this.name().substring(1).toLowerCase();

       return firstLetter + remainingLetters;

    }
}
