package com.patterns.lld.examples.vendingMachine.interfaces.inventory;

import com.patterns.lld.examples.vendingMachine.Product;

public interface Inventory {
    
    boolean addProduct(Product product, int quantity, int price);

    boolean removeProduct(Product product);

    boolean removeProductByQuantity(Product product, int quantity);

}
