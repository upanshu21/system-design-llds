package com.patterns.lld.examples.amazonlocker.locker;

import java.util.HashMap;
import java.util.List;
import com.patterns.lld.examples.amazonlocker.models.Locker;
import com.patterns.lld.examples.amazonlocker.models.LockerSize;


public interface LockerFacility {

    // this can also be HashMap<LockerType, Locker>; HashMap<LockerSize, Locker>
    void displayLockers();

    boolean addLocker(Locker locker);

    boolean isLockerTypeAvailable(LockerSize type);

    HashMap<LockerSize, List<Locker>> getLockers();

    HashMap<LockerSize, Integer> getLockerSize();

    // this and add locker actually should be an authorized call but you can add and mention this in interview
    // boolean archievelockers(Locker locker);
}
