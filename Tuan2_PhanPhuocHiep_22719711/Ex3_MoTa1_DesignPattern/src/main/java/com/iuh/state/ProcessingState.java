package com.iuh.state;

public class ProcessingState implements OrderState {
    @Override
    public void nextStep(Order order) {
        System.out.println("[" + order.getOrderId() + "] Đóng gói & vận chuyển...");
        order.processShipping();
        order.setState(new DeliveredState());
    }
    @Override
    public void cancel(Order order) {
        System.out.println("[" + order.getOrderId() + "] Hủy & hoàn tiền.");
        order.setState(new CancelledState());
    }
    @Override public String getStatus() { return "Đang xử lý"; }
}
