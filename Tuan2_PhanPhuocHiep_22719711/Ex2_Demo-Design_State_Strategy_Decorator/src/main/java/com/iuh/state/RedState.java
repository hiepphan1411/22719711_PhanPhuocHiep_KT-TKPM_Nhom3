package com.iuh.state;

public class RedState implements TrafficLightState {

    @Override
    public void handle(TrafficLight context) {
        System.out.println("-> Dừng hoặc 6tr! Chuyển sang đèn Xanh");
        context.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "ĐỎ";
    }
}
