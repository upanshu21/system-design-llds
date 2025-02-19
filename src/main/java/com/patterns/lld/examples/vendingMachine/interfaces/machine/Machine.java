package com.patterns.lld.examples.vendingMachine.interfaces.machine;

import com.patterns.lld.examples.vendingMachine.Product;

public interface Machine {

    void displayProduct();

    int selectProduct(Product product);

    boolean buyproductByMakingPayment(Product product, int price, int quantity);

}
