package Enums;

public enum TrafficLight {
    RED("Stop"),GREEN("Go"),YELLOW("Be Ready");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}
