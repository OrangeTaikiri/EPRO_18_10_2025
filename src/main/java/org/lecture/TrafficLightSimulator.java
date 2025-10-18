package org.lecture;

public class TrafficLightSimulator {

    static void main() {

        TrafficLight light = TrafficLight.GREEN;
        evalTrafficLight(light);

        light = TrafficLight.YELLOW;
        evalTrafficLight(light);

        light = TrafficLight.RED;
        evalTrafficLight(light);

    }

    private static void evalTrafficLight(TrafficLight light) {
        System.out.printf("%s light. Go for %d seconds %n", light.capitalize(), light.getSeconds());
    }

}
