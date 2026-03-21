package com.iuh.decorator;

public class BasePrice implements PriceCalculator {
    private double price;
    public BasePrice(double price) { this.price = price; }
    @Override public double getPrice() { return price; }
    @Override public String describe() { return "Giá gốc: " + price; }
}
