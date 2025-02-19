package com.patterns.lld.examples.vendingMachine;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.patterns.lld.examples.vendingMachine.interfaces.inventory.Inventory;

public class InventoryImpl implements Inventory{

    private ConcurrentHashMap<String, Product> catalog;
    private ConcurrentHashMap<String, Integer> catalogCount;

    public  InventoryImpl() {
        catalog = new ConcurrentHashMap<>();
        catalogCount = new ConcurrentHashMap<>();
    }

    @Override
    public boolean addProducts(Product product, int quantity) {
        catalog.putIfAbsent(product.getNameOfProduct(), product);
        catalogCount.put(product.nameOfProduct, catalogCount.getOrDefault(product.getNameOfProduct(), 0) + quantity);
        return false;
    }

    @Override
    public int getProducts(Product product) {
        return catalogCount.getOrDefault(product.nameOfProduct, 0);
    }

    @Override
    public boolean removeProduct(Product product) {
        catalogCount.put(product.nameOfProduct, 0);
        return false;
    }

    @Override
    public boolean removeProductByQuantity(Product product, int quantity) {
        catalogCount.put(product.nameOfProduct, catalogCount.get(product.getNameOfProduct()) - quantity);
        return false;
    }

    @Override
    public void displayProducts() {
        System.out.println("Catalog:");
        for (Map.Entry<String, Product> entry : catalog.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Product: " + entry.getValue().getNameOfProduct());
        }

        System.out.println("\nCatalog Count:");
        for (Map.Entry<String, Integer> entry : catalogCount.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    // public static void main(String[] args) {
    //     InventoryImpl impl = new InventoryImpl();
    //     Product product1 = new Product.ProductBuilder("Lays", null, 10).build();
    //     impl.addProducts(product1, 10, 0);
    //     int n = impl.getProducts(product1);
    //     System.err.println(n);
    //     impl.displayProducts();    
    // }

    
}
