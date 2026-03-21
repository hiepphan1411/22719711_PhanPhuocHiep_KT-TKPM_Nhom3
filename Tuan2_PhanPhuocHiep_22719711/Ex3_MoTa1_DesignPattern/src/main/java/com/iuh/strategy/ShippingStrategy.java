package com.iuh.strategy;

public interface ShippingStrategy {
    void ship(String orderId);
    double getCost();
}
