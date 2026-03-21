package com.iuh.state;

public class GreenState implements TrafficLightState {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("-> Được phép đi! Chuyển sang đèn vàng");
        context.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return "XANH";
    }
}
