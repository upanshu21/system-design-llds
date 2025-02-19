package com.patterns.lld.examples.vendingMachine.interfaces.inventory;

import com.patterns.lld.examples.vendingMachine.Product;

public interface Inventory {
    
    boolean addProducts(Product product, int quantity);

    int getProducts(Product product);

    boolean removeProduct(Product product);

    boolean removeProductByQuantity(Product product, int quantity);

    void displayProducts();

}
