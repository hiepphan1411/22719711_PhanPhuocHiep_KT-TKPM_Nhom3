package com.iuh.strategy.controller;

import com.iuh.strategy.TimingStrategy;

public class TrafficController {
    private TimingStrategy strategy;

    public TrafficController(TimingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TimingStrategy strategy) {
        this.strategy = strategy;
    }

    public void displayTiming() {
        System.out.println("Thời gian đèn Xanh: " + strategy.getGreenDuration() + "s");
        System.out.println("Thời gian đèn Đỏ  : " + strategy.getRedDuration() + "s");
    }
}
