package com.iuh.state;

public interface OrderState {
    void nextStep(Order order);
    void cancel(Order order);
    String getStatus();
}
