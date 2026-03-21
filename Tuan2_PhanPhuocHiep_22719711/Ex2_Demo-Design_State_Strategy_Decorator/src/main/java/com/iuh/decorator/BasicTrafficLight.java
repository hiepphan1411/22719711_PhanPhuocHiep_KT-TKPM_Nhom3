package com.iuh.decorator;

public class BasicTrafficLight implements TrafficLightDisplay {
    @Override
    public void display() {
        System.out.println("[Đèn cơ bản] Hiển thị màu đèn hiện tại.");
    }
}
