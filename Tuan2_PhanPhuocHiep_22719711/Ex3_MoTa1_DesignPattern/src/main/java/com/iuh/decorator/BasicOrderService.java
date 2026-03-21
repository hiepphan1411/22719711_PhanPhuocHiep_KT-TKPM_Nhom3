package com.iuh.decorator;

public class BasicOrderService implements OrderService {
    @Override public void process() {
        System.out.println("Xử lý đơn hàng cơ bản");
    }
    @Override public double getCost() { return 0; }
}
