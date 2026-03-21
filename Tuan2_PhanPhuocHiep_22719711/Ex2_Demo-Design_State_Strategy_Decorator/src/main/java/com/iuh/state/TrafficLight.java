package com.iuh.state;

public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void request() {
        System.out.println("Đèn hiện tại: " + currentState.getColor());
    }

}
