package com.patterns.lld.examples.vendingMachine;

import java.util.HashMap;
import java.util.Map;

import com.patterns.lld.examples.vendingMachine.interfaces.inventory.Inventory;

public class InventoryImpl implements Inventory{

    private HashMap<String, Product> catalog;
    private HashMap<String, Integer> catalogCount;

    public  InventoryImpl() {
        catalog = new HashMap<>();
        catalogCount = new HashMap<>();
    }

    @Override
    public boolean addProduct(Product product, int quantity, int price) {
        catalog.putIfAbsent(product.nameOfProduct, product);
        catalogCount.put(product.nameOfProduct, catalogCount.getOrDefault(product.nameOfProduct, 0) + quantity);
        return false;
    }

    @Override
    public boolean removeProduct(Product product) {
        catalogCount.put(product.nameOfProduct, 0);
        return false;
    }

    @Override
    public boolean removeProductByQuantity(Product product, int quantity) {
        catalogCount.put(product.nameOfProduct, catalogCount.get(product.nameOfProduct) - quantity);
        return false;
    }

    public void printCatalog() {
        System.out.println("Catalog:");
        for (Map.Entry<String, Product> entry : catalog.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Product: " + entry.getValue());
        }

        System.out.println("\nCatalog Count:");
        for (Map.Entry<String, Integer> entry : catalogCount.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    // public static void main(String[] args) {
    //     InventoryImpl impl = new InventoryImpl();
    //     Product product1 = new Product.ProductBuilder("Lays", null, 10).build();
    //     impl.addProduct(product1, 10, 0);
    //     impl.printCatalog();    
    // }

    
}
