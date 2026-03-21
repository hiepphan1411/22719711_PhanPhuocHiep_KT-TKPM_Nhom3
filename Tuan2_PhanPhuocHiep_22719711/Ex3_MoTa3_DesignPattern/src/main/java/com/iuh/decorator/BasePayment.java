package com.iuh.decorator;

public class BasePayment implements Payment {
    private double amount;
    public BasePayment(double amount) { this.amount = amount; }
    @Override public double getAmount() { return amount; }
    @Override public String describe() { return "Gốc: " + amount + " VNĐ"; }
}
