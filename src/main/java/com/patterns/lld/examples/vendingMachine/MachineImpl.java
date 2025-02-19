package com.patterns.lld.examples.vendingMachine;

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
        inventory.displayProducts();
    }

    @Override
    public int selectProduct(Product product) {
        return inventory.getProducts(product);
    }

    @Override
    public boolean buyproductByMakingPayment(Product product, int price, int quantity) {
        if (payment.makePayment(price) && inventory.removeProductByQuantity(product, quantity)) {
            return true;
        }
        return false;
    }

}
