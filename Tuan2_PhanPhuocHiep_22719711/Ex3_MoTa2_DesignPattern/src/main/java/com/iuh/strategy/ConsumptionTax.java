package com.iuh.strategy;

public class ConsumptionTax implements TaxStrategy {
    @Override public double calculateTax(double price) { return price * 0.05; }
    @Override public String getTaxName() { return "Thuế tiêu thụ (5%)"; }
}
