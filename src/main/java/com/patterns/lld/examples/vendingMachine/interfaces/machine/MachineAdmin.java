package com.patterns.lld.examples.vendingMachine.interfaces.machine;

import com.patterns.lld.examples.vendingMachine.Product;

public interface MachineAdmin {
    
    boolean autorized();

    boolean addProduct(Product product, int quantity);

    int collectMoney();
    
}
