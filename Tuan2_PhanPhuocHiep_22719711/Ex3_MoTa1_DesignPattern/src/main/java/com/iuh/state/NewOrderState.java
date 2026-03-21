package com.iuh.state;

public class NewOrderState implements OrderState {
    @Override
    public void nextStep(Order order) {
        System.out.println("[" + order.getOrderId() + "] Kiểm tra thông tin → Đang xử lý.");
        order.setState(new ProcessingState());
    }
    @Override
    public void cancel(Order order) {
        System.out.println("[" + order.getOrderId() + "] Hủy đơn hàng mới.");
        order.setState(new CancelledState());
    }
    @Override public String getStatus() { return "Mới tạo"; }
}
