package com.patterns.lld.examples.amazonLocker.models;

public class Order {
    
    private String orderId;
    private String customerId;
    private String destinationAddress;
    private String dispatchAdreessl;
    private String mode;
    private LockerSize size;

    public Order(String orderId, String customerId, String destinationAddress, String dispatchAdreessl, String mode, LockerSize size) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.destinationAddress = destinationAddress;
        this.dispatchAdreessl = dispatchAdreessl;
        this.mode = mode;
        this.size = size;
    }
    
    public String getOrderId() {
        return orderId;
    }
    public String getCustomerId() {
        return customerId;
    }
    public String getDestinationAddress() {
        return destinationAddress;
    }
    public String getDispatchAdreessl() {
        return dispatchAdreessl;
    }
    public String getMode() {
        return mode;
    }
    public LockerSize getSize() {
        return size;
    }

}
