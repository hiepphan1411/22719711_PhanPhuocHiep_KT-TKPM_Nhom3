package com.iuh.state;

import com.iuh.strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentState state;
    private PaymentStrategy strategy;
    private double amount;

    public PaymentContext(double amount, PaymentStrategy strategy) {
        this.amount = amount;
        this.strategy = strategy;
        this.state = new PendingState();
    }

    public void setState(PaymentState s) { this.state = s; }
    public void setStrategy(PaymentStrategy s) { this.strategy = s; }
    public void next() { state.handle(this); }
    public void executePayment() { strategy.pay(amount); }
    public String getStateName() { return state.getStateName(); }
}
