package com.iuh.strategy;

public interface TaxStrategy {
    double calculateTax(double price);
    String getTaxName();
}
