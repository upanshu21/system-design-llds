package com.patterns.lld.examples.amazonlocker.locker;

import java.util.HashMap;
import java.util.List;

import com.patterns.lld.examples.amazonlocker.models.Locker;
import com.patterns.lld.examples.amazonlocker.models.LockerSize;

public class LockerFacilityImpl implements LockerFacility {

    private HashMap<LockerSize, List<Locker>> lockers;
    private HashMap<LockerSize, Integer> tracker;
    private String location;

    private LockerFacilityImpl(String location) {
        this.tracker.put(LockerSize.LARGE, 50);
        this.tracker.put(LockerSize.SMALL, 25);
        this.tracker.put(LockerSize.MEDIUM, 25);
        this.lockers = new HashMap<>();
        this.location = location;
    }

    @Override
    public void displayLockers() {
        lockers.forEach((k, v) -> {
            System.out.println("Locker Size: " + k + " Available Lockers: " + v.size());
        });
    }

    @Override
    public boolean addLocker(Locker locker) {
        List<Locker> lockerList = lockers.get(locker.getCapacity());
        if (lockerList != null) {
            tracker.put(locker.getCapacity(), tracker.get(locker.getCapacity()) + 1);
            lockerList.add(locker);
            lockers.put(locker.getCapacity(), lockerList);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isLockerTypeAvailable(LockerSize type) {
        if (tracker.get(type) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public HashMap<LockerSize, List<Locker>> getLockers() {
            return lockers;
    }



    public String getLocation() {
        return location;
    }

    @Override
    public HashMap<LockerSize, Integer> getLockerSize() {
        return tracker;
    }

    
}
