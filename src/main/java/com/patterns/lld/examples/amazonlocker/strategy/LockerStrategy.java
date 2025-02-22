package com.patterns.lld.examples.amazonlocker.strategy;


import com.patterns.lld.examples.amazonlocker.models.Order;
import com.patterns.lld.examples.amazonlocker.locker.LockerFacility;

public interface LockerStrategy {


    String assignLocker(LockerFacility locker, Order order);

    
}
