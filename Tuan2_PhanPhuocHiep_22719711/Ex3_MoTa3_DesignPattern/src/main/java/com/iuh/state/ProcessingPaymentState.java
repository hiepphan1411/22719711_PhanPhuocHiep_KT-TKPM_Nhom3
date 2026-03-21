package com.iuh.state;

public class ProcessingPaymentState implements PaymentState {
    @Override public void handle(PaymentContext ctx) {
        System.out.println("  Đang xử lý thanh toán...");
        ctx.executePayment();
        ctx.setState(new CompletedState());
    }
    @Override public String getStateName() { return "Đang xử lý"; }
}