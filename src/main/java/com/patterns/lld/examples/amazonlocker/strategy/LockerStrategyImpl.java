package com.patterns.lld.examples.amazonlocker.strategy;

import com.patterns.lld.examples.amazonlocker.locker.LockerFacility;
import com.patterns.lld.examples.amazonlocker.models.Locker;
import com.patterns.lld.examples.amazonlocker.models.LockerSize;
import com.patterns.lld.examples.amazonlocker.models.Order;

public class LockerStrategyImpl implements LockerStrategy {

    @Override
    public String assignLocker(LockerFacility locker, Order order) {
        //get locker size
        // ordersie should return a valid sizr but here you can just convert string to enum
        LockerSize orderSize = order.getSize();
        if (locker.getLockerSize().get(orderSize) == null || locker.getLockerSize().get(orderSize) <= 0) {
            return "No lockers available at location";
        }
        // TO:DO: Implement logic to assign locker
        if (locker.getLockerSize().get(orderSize) > 0) {
            // Create and assign a new locker
            Locker newLocker = new Locker(orderSize, true, 1, null, null, null);
            newLocker.setAvailable(false);
            locker.getLockers().get(orderSize).add(newLocker);
            locker.getLockerSize().put(orderSize, locker.getLockerSize().get(orderSize) - 1);
        }
        return "Locker Assigned";
    }

    
}
