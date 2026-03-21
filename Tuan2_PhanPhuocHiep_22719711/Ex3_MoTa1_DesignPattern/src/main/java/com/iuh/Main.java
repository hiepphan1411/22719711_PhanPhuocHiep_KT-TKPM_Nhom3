package com.iuh;

import com.iuh.decorator.BasicOrderService;
import com.iuh.decorator.GiftWrapDecorator;
import com.iuh.decorator.InsuranceDecorator;
import com.iuh.decorator.OrderService;
import com.iuh.state.Order;
import com.iuh.strategy.ExpressShipping;

public class Main {
    public static void main(String[] args) {
        System.out.println("QUẢN LÝ ĐƠN HÀNG - PHAN PHƯỚC HIỆP - 22719711");

        Order order = new Order("DH22719711");
        order.setShippingStrategy(new ExpressShipping());

        System.out.println("Trạng thái: " + order.getStatus());
        order.nextStep(); // Mới tạo → Xử lý
        System.out.println("Trạng thái: " + order.getStatus());
        order.nextStep(); // Xử lý → Đã giao
        System.out.println("Trạng thái: " + order.getStatus());
        order.cancel();   // Không thể hủy

        System.out.println("\n-- Decorator: Dịch vụ bổ sung");
        OrderService service = new InsuranceDecorator(
                new GiftWrapDecorator(
                        new BasicOrderService()));
        service.process();
        System.out.println("  Phí dịch vụ thêm: " + service.getCost() + " VNĐ");
    }
}