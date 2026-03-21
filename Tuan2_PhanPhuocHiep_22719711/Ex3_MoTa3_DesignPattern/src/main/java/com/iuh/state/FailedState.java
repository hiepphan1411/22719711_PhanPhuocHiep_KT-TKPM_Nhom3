package com.iuh.state;

public class FailedState implements PaymentState {
    @Override public void handle(PaymentContext ctx) {
        System.out.println("  Giao dịch thất bại. Vui lòng thử lại.");
    }
    @Override public String getStateName() { return "Thất bại"; }
}
