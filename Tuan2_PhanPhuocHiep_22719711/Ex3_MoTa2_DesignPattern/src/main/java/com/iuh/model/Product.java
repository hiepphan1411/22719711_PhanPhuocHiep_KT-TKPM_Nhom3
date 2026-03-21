package com.iuh.model;

import com.iuh.state.ProductState;
import com.iuh.state.RegularState;
import com.iuh.strategy.TaxStrategy;
import com.iuh.strategy.VATTax;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;
    private ProductState state;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.state = new RegularState();
        this.taxStrategy = new VATTax();
    }

    public void setState(ProductState state) {
        this.state = state;
        state.applyState(this);
    }

    public void setTaxStrategy(TaxStrategy t) { this.taxStrategy = t; }

    public void printInvoice() {
        double tax = taxStrategy.calculateTax(price);
        System.out.println("  Sản phẩm : " + name);
        System.out.println("  Giá gốc  : " + price + " VNĐ");
        System.out.println("  Loại thuế: " + taxStrategy.getTaxName());
        System.out.println("  Tiền thuế: " + tax + " VNĐ");
        System.out.println("  Tổng cộng: " + (price + tax) + " VNĐ");
    }
}