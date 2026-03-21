package com.iuh;

import com.iuh.decorator.BasePrice;
import com.iuh.decorator.ImportFeeDecorator;
import com.iuh.decorator.PriceCalculator;
import com.iuh.decorator.ServiceFeeDecorator;
import com.iuh.model.Product;
import com.iuh.state.DiscountedState;
import com.iuh.state.LuxuryState;

public class Main {
    public static void main(String[] args) {
        System.out.println("TÍNH THUẾ SẢN PHẨM - Phan Phước Hiệp - 22719711\n");

        Product phone = new Product("iPhone 16", 30_000_000);
        System.out.println("-- Trạng thái: Xa xỉ");
        phone.setState(new LuxuryState());
        phone.printInvoice();

        System.out.println();
        Product shirt = new Product("Áo thun", 200_000);
        System.out.println("-- Trạng thái: Giảm giá");
        shirt.setState(new DiscountedState());
        shirt.printInvoice();

        System.out.println("\n-- Decorator: Giá sau khi thêm phí");
        PriceCalculator calc = new ServiceFeeDecorator(
                new ImportFeeDecorator(
                        new BasePrice(30_000_000)));
        System.out.println(calc.describe());
        System.out.printf("Tổng giá: %.0f VNĐ%n", calc.getPrice());
    }
}