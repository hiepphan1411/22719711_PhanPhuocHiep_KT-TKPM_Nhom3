package com.iuh.decorator;

public abstract class PriceDecorator implements PriceCalculator {
    protected PriceCalculator wrapped;
    public PriceDecorator(PriceCalculator p) { this.wrapped = p; }
    @Override public double getPrice() { return wrapped.getPrice(); }
    @Override public String describe() { return wrapped.describe(); }
}
