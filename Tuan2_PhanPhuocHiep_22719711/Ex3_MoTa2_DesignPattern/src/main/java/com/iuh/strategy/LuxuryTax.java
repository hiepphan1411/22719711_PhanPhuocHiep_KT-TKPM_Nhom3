package com.iuh.strategy;

public class LuxuryTax implements TaxStrategy {
    @Override public double calculateTax(double price) { return price * 0.30; }
    @Override public String getTaxName() { return "Thuế luxury (30%)"; }
}
