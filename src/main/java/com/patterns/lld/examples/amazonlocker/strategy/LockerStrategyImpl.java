package com.patterns.lld.examples.amazonlocker.strategy;

import java.util.HashMap;
import java.util.List;

import com.patterns.lld.examples.amazonlocker.locker.LockerFacility;
import com.patterns.lld.examples.amazonlocker.models.Locker;
import com.patterns.lld.examples.amazonlocker.models.LockerSize;
import com.patterns.lld.examples.amazonlocker.models.Order;

public class LockerStrategyImpl implements LockerStrategy {

    private LockerFacility facility;

    public LockerStrategyImpl () {}

    public LockerStrategyImpl(LockerFacility facility) {
        this.facility = facility;
    }

    @Override
    public boolean assingLocker(Order order) {
        facility.addLocker(null);
        return true;
    }

    @Override
    public boolean unAssignLocker(Order order) {
        throw new UnsupportedOperationException("Unimplemented method 'unAssignLocker'");
    }

    @Override
    public HashMap<LockerSize, List<Locker>> getLockers() {
        throw new UnsupportedOperationException("Unimplemented method 'getLockers'");
    }

    @Override
    public HashMap<LockerSize, List<Locker>> displayLockers() {
        throw new UnsupportedOperationException("Unimplemented method 'displayLockers'");
    }

    @Override
    public HashMap<LockerSize, Integer> getLockerTypesCount() {
        throw new UnsupportedOperationException("Unimplemented method 'getLockerTypesCount'");
    }


    
}
