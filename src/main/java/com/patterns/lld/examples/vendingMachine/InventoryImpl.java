package com.patterns.lld.examples.vendingMachine;

import com.patterns.lld.examples.vendingMachine.interfaces.inventory.Inventory;

public class InventoryImpl implements Inventory{


    @Override
    public boolean addProduct(Product product, int quantity, int price) {
        return false;
    }

    @Override
    public boolean removeProduct(Product product) {
        return false;
    }

    @Override
    public boolean removeProductByQuantity(Product product) {
        return false;
    }

    
}
