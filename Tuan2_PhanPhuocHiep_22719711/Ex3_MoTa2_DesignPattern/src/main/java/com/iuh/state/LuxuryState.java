package com.iuh.state;

import com.iuh.model.Product;
import com.iuh.strategy.LuxuryTax;

public class LuxuryState implements ProductState {
    @Override public void applyState(Product p) {
        p.setTaxStrategy(new LuxuryTax());
        System.out.println("-> Sản phẩm xa xỉ, áp dụng thuế luxury 30%");
    }
    @Override public String getStateName() { return "Luxury"; }
}
