package com.iuh.decorator;

public abstract class PaymentDecorator implements Payment {
    protected Payment wrapped;
    public PaymentDecorator(Payment p) { this.wrapped = p; }
    @Override public double getAmount() { return wrapped.getAmount(); }
    @Override public String describe() { return wrapped.describe(); }
}
