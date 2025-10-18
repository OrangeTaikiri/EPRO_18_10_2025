package org.lecture;

public class TrafficLightSimulator {

    static void main() {

        TrafficLight light = TrafficLight.GREEN;
        System.out.printf("%s light. Go for %d seconds", light.name(), light.getSeconds());

    }

}
