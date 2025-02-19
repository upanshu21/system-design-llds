package com.patterns.lld.examples.vendingMachine;

import java.util.Date;
import java.util.Optional;

public class Product {

    String nameOfProduct;
    // rational for keeping optional here is what if the item is nonperisible
    Optional<Date> expiryDate;
    Integer price;

    public Product(ProductBuilder builder) {
        this.nameOfProduct = builder.nameOfProduct;
        this.expiryDate = builder.expiryDate;
        this.price = builder.price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public Optional<Date> getExpiryDate() {
        return expiryDate;
    }

    public Integer getPrice() {
        return price;
    }

    
    public static class ProductBuilder {

        String nameOfProduct;
        Optional<Date> expiryDate;
        Integer price;

        public ProductBuilder(String nameOfProduct, Optional<Date> expiryDate, Integer price) {
            this.nameOfProduct = nameOfProduct;
            this.expiryDate = expiryDate;
            this.price = price;
        }

        public ProductBuilder setNameOfProduct(String nameOfProduct) {
            this.nameOfProduct = nameOfProduct;
            return this;
        }

        public ProductBuilder setExpiryDate(Optional<Date> expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public ProductBuilder setPrice(Integer price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
    
}
