package com.iuh.decorator;

public class GiftWrapDecorator extends OrderDecorator {
    public GiftWrapDecorator(OrderService s) { super(s); }
    @Override public void process() {
        super.process();
        System.out.println("<>/ Gói quà tặng thêm.");
    }
    @Override public double getCost() { return super.getCost() + 15000; }
}