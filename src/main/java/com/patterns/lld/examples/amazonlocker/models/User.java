package com.patterns.lld.examples.amazonLocker.models;

import java.util.List;

public class User {
    
    private String userId;
    private String name;
    private String address;
    private List<Order> orderHistory;

    public User(String userId, String name, String address, List<Order> orderHistory) {
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
    public List<Order> getOrderHistory() {
        return orderHistory;
    }
    
}
