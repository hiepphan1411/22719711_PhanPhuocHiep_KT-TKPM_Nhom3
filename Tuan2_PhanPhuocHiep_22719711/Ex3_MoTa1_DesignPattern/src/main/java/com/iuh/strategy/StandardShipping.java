package com.iuh.strategy;

public class StandardShipping implements ShippingStrategy {
    @Override public void ship(String id) {
        System.out.println("-> Giao hàng tiêu chuẩn: " + id);
    }
    @Override public double getCost() { return 20000; }
}
