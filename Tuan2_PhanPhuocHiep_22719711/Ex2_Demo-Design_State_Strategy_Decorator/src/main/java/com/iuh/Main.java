package com.iuh;

import com.iuh.decorator.BasicTrafficLight;
import com.iuh.decorator.BlinkingDecorator;
import com.iuh.decorator.SoundAlertDecorator;
import com.iuh.decorator.TrafficLightDisplay;
import com.iuh.state.TrafficLight;
import com.iuh.strategy.NightTimingStrategy;
import com.iuh.strategy.NormalTimingStrategy;
import com.iuh.strategy.PeakHourTimingStrategy;
import com.iuh.strategy.controller.TrafficController;

public class Main {
    public static void main(String[] args) {

        //State
        System.out.println("STATE PATTERN");
        TrafficLight light = new TrafficLight();
        light.request(); // Đỏ -> Xanh
        light.request(); // Xanh -> Vàng
        light.request(); // Vàng -> Đỏ

        //Strategy
        System.out.println("\n\nSTRATEGY PATTERN");
        TrafficController controller = new TrafficController(new NormalTimingStrategy());
        System.out.println("-- Test: Giờ bình thường --");
        controller.displayTiming();

        controller.setStrategy(new PeakHourTimingStrategy());
        System.out.println("-- Test: Giờ cao điểm --");
        controller.displayTiming();

        controller.setStrategy(new NightTimingStrategy());
        System.out.println("-- Test: Ban đêm --");
        controller.displayTiming();

        //Decorator
        System.out.println("\n\nDECORATOR PATTERN");
        TrafficLightDisplay basic = new BasicTrafficLight();
        TrafficLightDisplay withSound = new SoundAlertDecorator(basic);
        TrafficLightDisplay withSoundAndBlink = new BlinkingDecorator(withSound);

        System.out.println("-- Test: Đèn thường --");
        basic.display();
        System.out.println("-- Test: Đèn + Âm thanh --");
        withSound.display();
        System.out.println("-- Test: Đèn + Âm thanh + Nhấp nháy --");
        withSoundAndBlink.display();
    }
}