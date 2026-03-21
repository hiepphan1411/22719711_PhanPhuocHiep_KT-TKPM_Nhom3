package com.iuh.strategy;

public class DroneShipping implements ShippingStrategy {
    @Override public void ship(String id) {
        System.out.println("  -> Giao bằng drone: " + id);
    }
    @Override public double getCost() { return 100000; }
}
