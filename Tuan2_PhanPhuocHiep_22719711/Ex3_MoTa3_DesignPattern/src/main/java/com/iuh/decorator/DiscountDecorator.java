package com.iuh.decorator;

public class DiscountDecorator extends PaymentDecorator {
    private double rate;
    public DiscountDecorator(Payment p, double discountRate) {
        super(p);
        this.rate = discountRate;
    }
    @Override public double getAmount() { return super.getAmount() * (1 - rate); }
    @Override public String describe() {
        return super.describe() + " - Mã giảm (" + (int)(rate*100) + "%)";
    }
}
