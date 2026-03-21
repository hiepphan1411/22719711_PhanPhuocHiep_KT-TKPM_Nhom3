package com.iuh.decorator;

public class InsuranceDecorator extends OrderDecorator {
    public InsuranceDecorator(OrderService s) { super(s); }
    @Override public void process() {
        super.process();
        System.out.println("<>/ Bảo hiểm hàng hóa.");
    }
    @Override public double getCost() { return super.getCost() + 30000; }
}
