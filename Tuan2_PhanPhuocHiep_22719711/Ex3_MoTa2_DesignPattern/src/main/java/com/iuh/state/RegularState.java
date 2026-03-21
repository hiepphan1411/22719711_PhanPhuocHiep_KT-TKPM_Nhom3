package com.iuh.state;

import com.iuh.model.Product;
import com.iuh.strategy.VATTax;

public class RegularState implements ProductState {
    @Override public void applyState(Product p) {
        p.setTaxStrategy(new VATTax());
        System.out.println(" -> Sản phẩm thông thường, áp dụng VAT 10%");
    }
    @Override public String getStateName() { return "Thông thường"; }
}
