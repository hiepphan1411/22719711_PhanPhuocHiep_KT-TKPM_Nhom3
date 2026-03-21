package com.iuh;

import com.iuh.decorator.BasePayment;
import com.iuh.decorator.DiscountDecorator;
import com.iuh.decorator.Payment;
import com.iuh.decorator.ProcessingFeeDecorator;
import com.iuh.state.PaymentContext;
import com.iuh.strategy.CreditCardPayment;
import com.iuh.strategy.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("HỆ THỐNG THANH TOÁN - PHAN PHƯỚC HIỆP - 22719711\n");

        // Decorator: tính số tiền cuối cùng
        System.out.println("-- Decorator: Tính tiền");
        Payment payment = new DiscountDecorator(
                new ProcessingFeeDecorator(
                        new BasePayment(500_000)), 0.10);
        System.out.println(payment.describe());
        System.out.printf("Số tiền thanh toán: %.0f VNĐ%n%n", payment.getAmount());

        // Strategy + State: để quản lý luồng thanh toán
        System.out.println("-- Strategy + State: Luồng giao dịch");
        PaymentContext ctx = new PaymentContext(
                payment.getAmount(),
                new CreditCardPayment("1234567812345678")
        );
        System.out.println("Trạng thái: " + ctx.getStateName());
        ctx.next(); // Pending → Processing
        System.out.println("Trạng thái: " + ctx.getStateName());
        ctx.next(); // Processing → thực hiện pay → Completed
        System.out.println("Trạng thái: " + ctx.getStateName());

        // Đổi strategy sang PayPal
        System.out.println("\n-- Đổi sang PayPal");
        PaymentContext ctx2 = new PaymentContext(200_000, new PayPalPayment("phanphuochiep2004@gmail.com"));
        ctx2.next();
        ctx2.next();
    }
}