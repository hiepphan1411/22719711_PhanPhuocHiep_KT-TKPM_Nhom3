package com.iuh.state;

public class PendingState implements PaymentState {
    @Override public void handle(PaymentContext ctx) {
        System.out.println("  Đang chờ xác nhận → Chuyển sang Đang xử lý...");
        ctx.setState(new ProcessingPaymentState());
    }
    @Override public String getStateName() { return "Chờ xử lý"; }
}
