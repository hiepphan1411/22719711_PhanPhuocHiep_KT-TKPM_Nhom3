package com.iuh.state;

import com.iuh.strategy.ShippingStrategy;
import com.iuh.strategy.StandardShipping;

public class Order {
    private OrderState currentState;
    private String orderId;
    private ShippingStrategy shippingStrategy;

    public Order(String orderId) {
        this.orderId = orderId;
        this.currentState = new NewOrderState();
        this.shippingStrategy = new StandardShipping();
    }

    public void setState(OrderState state) { this.currentState = state; }
    public void setShippingStrategy(ShippingStrategy s) { this.shippingStrategy = s; }
    public void nextStep() { currentState.nextStep(this); }
    public void cancel()   { currentState.cancel(this); }
    public String getStatus() { return currentState.getStatus(); }
    public void processShipping() { shippingStrategy.ship(orderId); }
    public String getOrderId() { return orderId; }
}
