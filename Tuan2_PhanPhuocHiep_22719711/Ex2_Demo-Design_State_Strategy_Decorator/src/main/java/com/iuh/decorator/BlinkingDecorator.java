package com.iuh.decorator;

public class BlinkingDecorator extends TrafficLightDecorator {
    public BlinkingDecorator(TrafficLightDisplay light) {
        super(light);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("[+] Đèn đang nhấp nháy...");
    }
}
