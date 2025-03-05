package com.patterns.lld.examples.amazonlocker;

import com.patterns.lld.examples.amazonlocker.locker.LockerFacility;
import com.patterns.lld.examples.amazonlocker.locker.LockerFacilityImpl;
import com.patterns.lld.examples.amazonlocker.models.Locker;
import com.patterns.lld.examples.amazonlocker.models.User;
import com.patterns.lld.examples.amazonlocker.strategy.LockerStrategy;
import com.patterns.lld.examples.amazonlocker.strategy.LockerStrategyImpl;

public class AmazonLocker {

    User user = new User(null, null, null, null);
    Locker locekr = new Locker(null, false, null, null, null, null);

    LockerFacility facility = new LockerFacilityImpl("NYC");
    LockerStrategy strategy = new LockerStrategyImpl(facility);

    
}
