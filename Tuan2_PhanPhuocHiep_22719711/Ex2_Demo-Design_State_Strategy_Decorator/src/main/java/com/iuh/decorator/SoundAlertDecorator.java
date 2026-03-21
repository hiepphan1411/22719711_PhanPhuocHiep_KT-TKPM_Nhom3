package com.iuh.decorator;

public class SoundAlertDecorator extends TrafficLightDecorator {
    public SoundAlertDecorator(TrafficLightDisplay light) {
        super(light);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("[+] Cảnh báo âm thanh");
    }
}
