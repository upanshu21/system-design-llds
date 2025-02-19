package com.patterns.lld.examples.vendingMachine;

import java.util.HashMap;
import java.util.Map;

import com.patterns.lld.examples.vendingMachine.interfaces.inventory.Inventory;
import com.patterns.lld.examples.vendingMachine.interfaces.machine.Machine;
import com.patterns.lld.examples.vendingMachine.interfaces.payments.Payments;

public class MachineImpl implements Machine {

    private Payments payment;
    private Inventory inventory;    

    public MachineImpl(Payments payment, Inventory inventory) {
        this.payment = payment;
        this.inventory = inventory;
    }

    @Override
    public void displayProduct() {
   
    }

    @Override
    public int selectProduct(String product) {

            return 0;

    }

    @Override
    public boolean buyproductByMakingPayment(Product product, int price) {
        return false;

    }


}
