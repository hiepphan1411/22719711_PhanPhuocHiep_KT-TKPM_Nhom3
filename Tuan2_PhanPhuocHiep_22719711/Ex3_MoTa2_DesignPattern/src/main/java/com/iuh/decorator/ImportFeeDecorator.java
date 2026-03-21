package com.iuh.decorator;

public class ImportFeeDecorator extends PriceDecorator {
    public ImportFeeDecorator(PriceCalculator p) { super(p); }
    @Override public double getPrice() { return super.getPrice() * 1.15; }
    @Override public String describe() {
        return super.describe() + " + Phí nhập khẩu (15%)";
    }
}
