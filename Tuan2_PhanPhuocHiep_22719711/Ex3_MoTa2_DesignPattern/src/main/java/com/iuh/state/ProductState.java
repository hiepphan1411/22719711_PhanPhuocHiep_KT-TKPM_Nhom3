package com.iuh.state;

import com.iuh.model.Product;

public interface ProductState {
    void applyState(Product product);
    String getStateName();
}
