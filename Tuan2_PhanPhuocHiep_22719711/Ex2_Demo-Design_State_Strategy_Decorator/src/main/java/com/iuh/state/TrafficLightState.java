package com.iuh.state;

public interface TrafficLightState {
    void handle (TrafficLight context);

    String getColor();
}
