package com.patterns.lld.examples.vendingMachine;

import com.patterns.lld.examples.vendingMachine.interfaces.inventory.Inventory;
import com.patterns.lld.examples.vendingMachine.interfaces.machine.Machine;
import com.patterns.lld.examples.vendingMachine.interfaces.payments.Payments;

public class VendingMachineDemo {

    public static void main(String[] args) {


        // Machine initializations
        Payments payments = new PaymentsImpl();
        Inventory inventory = new InventoryImpl();
        Machine machine = new MachineImpl(payments, inventory);
        MachineAdminImpl machineAdmin = new MachineAdminImpl();

        // Product initialization
        Product product1 = new Product.ProductBuilder("Lays", null, 10).build();
        Product product2 = new Product.ProductBuilder("MilkyBar", null, 10).build();
        Product product3 = new Product.ProductBuilder("Gatorafe", null, 10).build();

        machineAdmin.addProduct(product1, 10, 10);
        machineAdmin.addProduct(product2, 10, 10);
        machineAdmin.addProduct(product3, 10, 10);

        // object flow:
        machine.displayProduct();
        int p1 = machine.selectProduct(product1.nameOfProduct);
        int p2 = machine.selectProduct(product2.nameOfProduct);
        machine.buyproductByMakingPayment(product1, p1);
        machine.buyproductByMakingPayment(product2, p2);
        machine.displayProduct();

    }
    
}
