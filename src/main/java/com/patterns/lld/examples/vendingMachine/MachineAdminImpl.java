package com.patterns.lld.examples.vendingMachine;

import com.patterns.lld.examples.vendingMachine.interfaces.inventory.Inventory;
import com.patterns.lld.examples.vendingMachine.interfaces.machine.MachineAdmin;
import com.patterns.lld.examples.vendingMachine.interfaces.payments.Payments;

public class MachineAdminImpl implements MachineAdmin {
    
    private Inventory inventory;
    private Payments payments;

    public MachineAdminImpl(Inventory inventory, Payments payments) {
        this.inventory = inventory;
        this.payments = payments;
    }
    
    @Override
    public boolean addProduct(Product product, int quantity) {
        inventory.addProducts(product, quantity);
        return true;
    }

    @Override
    public int collectMoney() {
        return payments.collectMoney();
    }

    @Override
    public boolean autorized() {
        throw new UnsupportedOperationException("Unimplemented method 'autorized'");
    }
    
}
