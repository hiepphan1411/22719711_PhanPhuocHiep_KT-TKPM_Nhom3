package com.iuh.state;

public class CompletedState implements PaymentState {
    @Override public void handle(PaymentContext ctx) {
        System.out.println("  Thanh toán đã hoàn tất!");
    }
    @Override public String getStateName() { return "Hoàn tất"; }
}
