package org.lecture;

public enum TrafficLight {
    RED(30),
    YELLOW(3),
    GREEN(25);

    final int seconds;

    // Constructor
    TrafficLight(int seconds) {
        this.seconds = seconds;
    }

    // Returns the number of seconds for the light to be on
    public int getSeconds() {
        return seconds;
    }
}
