package com.patterns.lld.examples.amazonlocker.strategy;


import com.patterns.lld.examples.amazonlocker.models.Locker;
import com.patterns.lld.examples.amazonlocker.models.LockerSize;
import com.patterns.lld.examples.amazonlocker.models.Order;

import java.util.HashMap;
import java.util.List;

public interface LockerStrategy {

    boolean assingLocker(Order order);

    boolean unAssignLocker(Order order);

    HashMap<LockerSize, List<Locker>> getLockers();

    HashMap<LockerSize, List<Locker>> displayLockers();

    HashMap<LockerSize, Integer> getLockerTypesCount();
    
}
