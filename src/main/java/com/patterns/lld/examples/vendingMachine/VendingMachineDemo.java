package com.patterns.lld.examples.vendingMachine;

import com.patterns.lld.examples.vendingMachine.interfaces.inventory.Inventory;
import com.patterns.lld.examples.vendingMachine.interfaces.machine.Machine;
import com.patterns.lld.examples.vendingMachine.interfaces.payments.Payments;

public class VendingMachineDemo {

    public static void main(String[] args) {


        // Machine initializations
        // Design patter - Facade: The MachineImpl class acts as a façade by orchestrating operations between the 
        //payments system and the inventory management. 
        //It provides a simple interface to clients while delegating the actual work to the underlying subsystems.
        Payments payments = new PaymentsImpl();
        Inventory inventory = new InventoryImpl();

        // Note: Potential for Strategy Pattern:
        // use of a Payments interface opens up the possibility of implementing different payment strategies 
        //(e.g., coin, note, digital) by providing multiple concrete implementations. This aligns with the Strategy Pattern.

        // Design pattern: Seperation of concerns: How? the functions in the MachinAdmin consists of collecting payments and restocking
        // which is not something users are concerned about and should be in context of.
        // only autorized admins should have those privilages.
        Machine machine = new MachineImpl(payments, inventory);
        MachineAdminImpl machineAdmin = new MachineAdminImpl(inventory, payments);

        // Product initialization
        Product product1 = new Product.ProductBuilder("Lays", null, 10).build();
        Product product2 = new Product.ProductBuilder("MilkyBar", null, 10).build();
        Product product3 = new Product.ProductBuilder("Gatorade", null, 10).build();

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
