package com.iuh.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    public CreditCardPayment(String cardNumber) { this.cardNumber = cardNumber; }
    @Override public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " VNĐ bằng Thẻ tín dụng: "
                + cardNumber.substring(cardNumber.length()-4));
    }
    @Override public String getMethodName() { return "Thẻ tín dụng"; }
}
