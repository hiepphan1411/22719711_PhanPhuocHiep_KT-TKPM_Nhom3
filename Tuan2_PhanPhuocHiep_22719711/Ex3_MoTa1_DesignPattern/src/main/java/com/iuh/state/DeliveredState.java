package com.iuh.state;

public class DeliveredState implements OrderState {
    @Override
    public void nextStep(Order order) {
        System.out.println("[" + order.getOrderId() + "] Đã giao thành công!");
    }
    @Override
    public void cancel(Order order) {
        System.out.println("[" + order.getOrderId() + "] Không thể hủy — đã giao rồi!");
    }
    @Override public String getStatus() { return "Đã giao"; }
}
