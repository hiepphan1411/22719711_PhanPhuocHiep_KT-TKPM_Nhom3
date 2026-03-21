package com.iuh.state;

import com.iuh.model.Product;
import com.iuh.strategy.ConsumptionTax;

public class DiscountedState implements ProductState {
    @Override public void applyState(Product p) {
        p.setTaxStrategy(new ConsumptionTax());
        System.out.println("-> Sản phẩm giảm giá, áp dụng thuế tiêu thụ 5%");
    }
    @Override public String getStateName() { return "Giảm giá"; }
}
