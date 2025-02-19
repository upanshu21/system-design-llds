package com.patterns.lld.examples.vendingMachine;

import com.patterns.lld.examples.vendingMachine.interfaces.machine.MachineAdmin;

public class MachineAdminImpl implements MachineAdmin {

    @Override
    public boolean addProduct(Product product, int quantity, int price) {
        return false;
    }

    @Override
    public int collectMoney() {
        return 1;
    }

    @Override
    public boolean autorized() {
        throw new UnsupportedOperationException("Unimplemented method 'autorized'");
    }
    
}
