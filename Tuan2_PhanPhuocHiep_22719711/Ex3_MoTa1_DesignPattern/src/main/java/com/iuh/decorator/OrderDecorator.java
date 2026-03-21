package com.iuh.decorator;

public abstract class OrderDecorator implements OrderService {
    protected OrderService wrapped;
    public OrderDecorator(OrderService s) { this.wrapped = s; }
    @Override public void process() { wrapped.process(); }
    @Override public double getCost() { return wrapped.getCost(); }
}
