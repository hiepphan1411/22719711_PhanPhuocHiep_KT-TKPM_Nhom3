package com.iuh.state;

public class CancelledState implements OrderState {
    @Override
    public void nextStep(Order order) {
        System.out.println("[" + order.getOrderId() + "] Đơn đã hủy, không thể tiếp tục.");
    }
    @Override
    public void cancel(Order order) {
        System.out.println("[" + order.getOrderId() + "] Đơn đã hủy rồiii.");
    }
    @Override public String getStatus() { return "Đã hủy"; }
}