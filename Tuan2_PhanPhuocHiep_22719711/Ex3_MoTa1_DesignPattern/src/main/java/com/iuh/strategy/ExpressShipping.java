package com.iuh.strategy;

public class ExpressShipping implements ShippingStrategy {
    @Override public void ship(String id) {
        System.out.println("  -> Giao hàng nhanh: " + id);
    }
    @Override public double getCost() { return 50000; }
}
