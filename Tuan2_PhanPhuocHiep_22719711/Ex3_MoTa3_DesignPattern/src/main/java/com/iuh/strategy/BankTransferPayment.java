package com.iuh.strategy;

public class BankTransferPayment implements PaymentStrategy {
    @Override public void pay(double amount) {
        System.out.println("Chuyển khoản ngân hàng: " + amount + " VNĐ");
    }
    @Override public String getMethodName() { return "Chuyển khoản"; }
}
