package com.iuh.decorator;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment p) { super(p); }
    @Override public double getAmount() { return super.getAmount() * 1.02; }
    @Override public String describe() {
        return super.describe() + " + Phí xử lý (2%)";
    }
}
