package com.iuh.state;

public class YellowState implements TrafficLightState {
    @Override
    public void handle(TrafficLight context) {
        System.out.println("-> Chuẩn bị dừng! Chuyển sang đèn đỏ");
        context.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "VÀNG";
    }
}
