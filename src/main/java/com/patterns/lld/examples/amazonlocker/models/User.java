package com.patterns.lld.examples.amazonlocker.models;

import java.util.List;
import java.util.Optional;

public class User {
    
    private String userId;
    private String name;
    private String address;
    private Optional<List<Order>> orderHistory;

    public User(String userId, String name, String address, Optional<List<Order>> orderHistory) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.orderHistory = orderHistory;
    }
    
    public String getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Optional<List<Order>> getOrderHistory() {
        return orderHistory;
    }
    
}
