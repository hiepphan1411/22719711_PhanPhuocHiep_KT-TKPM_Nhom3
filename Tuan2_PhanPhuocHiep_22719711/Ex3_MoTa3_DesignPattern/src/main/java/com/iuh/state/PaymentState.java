package com.iuh.state;

public interface PaymentState {
    void handle(PaymentContext ctx);
    String getStateName();
}
