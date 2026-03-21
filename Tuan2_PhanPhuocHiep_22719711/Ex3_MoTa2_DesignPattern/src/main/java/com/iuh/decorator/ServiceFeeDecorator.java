package com.iuh.decorator;

public class ServiceFeeDecorator extends PriceDecorator {
    public ServiceFeeDecorator(PriceCalculator p) { super(p); }
    @Override public double getPrice() { return super.getPrice() + 50000; }
    @Override public String describe() {
        return super.describe() + " + Phí dịch vụ (50,000đ)";
    }
}
