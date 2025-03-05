An Amazon pickup location has various lockers for packages to be dropped off and picked up. We have both packages and lockers of varying sizes. Model the lockers, packages, and pickup location and implement an algorithm to find the best possible empty locker for a given package efficiently.

A larger locker can be used if the right size is not available for a package. He also said that I need to write 3 classes. User can enter a locker number and the package is removed from the locker. It took a couple of more minutes.


points:

- customer places an order
- customer chooses a delivery address and pickup pachage from there in no extra cost.
- customer places an oorder and the service suggests the nearest available locker based on preferences.
- The order is packaged and placed in the locker. 





Order
Lockers for Orders


Order -> S M L


OrderType {
    SMALL,
    MEDIUM,
    LARGER
    // S,M,L
}

Order {

    String orderId;
    String userId;
    String OriginAddress;
    OrderType OrderDimension

    public Order () {}

    public String getOrder() {

    }

}


Locker {

    String lockerId;
    Optional<String> orderId;
    boolean available;
    String token;

    public Locker() {

    }

    public Locker() {}

}


interface LockerFacility {

    boolean addLockers(Locker locker);

    boolean decomissionLocker(Locker locker);

    boolean assignLocker(Locker locker);

    List<Lockers> getLockers();
}


class LockerFacilityImpl implements LockerFacility{

    String location;
    HashMap<LockerType, List<Locker>> lockers;
    HashMap<LockerType, Integer> lockerCount; 

    <!-- public LockerFacilityImpl(String location, int s, int m, int l) {

    } -->
    public LockerFacilityImpl(String location) {
        lockers = new HashMap<>(100);
        this.location = location;
        // 25,25,50

        for (int i = 0; i <= 50; i++) {
            Locker lock = new Locker();
            lock.setid(i);
            locker.computeIfAbsent(LockerType.SMALL, k -> new ArrayList().add(locker));
        }

        for (int i = 0; i <= 50; i++) {
            Locker lock = new Locker();
            lock.setid(i);
            locker.computeIfAbsent(LockerType.SMALL, k -> new ArrayList().add(locker));
        }

        for (int i = 0; i <= 50; i++) {
            Locker lock = new Locker();
            lock.setid(i);
            locker.computeIfAbsent(LockerType.SMALL, k -> new ArrayList().add(locker));
        }
    }

    public boolean addLockers(Locker locker) {

    }

    public boolean decomissionLocker(Locker locker) {

    }

    public boolean assignLocker(Locker locker) {

    }

    public List<Lockers> getLockers() {
        return lockers;
    }

}

interface LockerAssignmentStategy {

    assingLocker(Order order);

    unAssignLocker(Order order);

    List<lockerType, List<Lockers>> getLockers();

    List<lockerType, List<Lockers>> displayLockers();

    HashMap<LockerType, Integer> getLockerTypesCount();

}

class LockerAssignmentStrategyImpl implements LockerAssignmentStategy {

    LockerFacility facility;

    public LockerAssignmentStrategyImpl() {}

    public LockerAssignmentStrategyImpl {LockerFacility facility} {
        this.facility = facility;
    }

    assingLocker(Order order) {

    }

    unAssignLocker(Order order) {

    }

    List<lockerType, List<Lockers>> getLockers() {

    }

    List<lockerType, List<Lockers>> displayLockers() {

    }
}
























User flow {

    User user = new User() {
        String userId;
        String name;
        String address;
        List<Orderds>;
    }

    Order order = new Order() {
        String orderId;
        String customerId;
        String destinationAddress;
        String dispatchAdreessl;
        String mode;
        String size;
    }

    // I am going to assume that this class in encapsulated


    Locker {
        String capacity;
        boolean available;
        Date inUse;
        Optional<List<Order>> history;
        HashMap<String> token = new HashMap<>();
    }


    LockerFacility locker = new LockerFacility(location, S,M,L ratios) {

        availablelockers()
        addlockers()
        archievelockers()

    }

    LockerStrategy strategy = StrategyImplementation() {

    }

    LockerManager manager = new LockerManager(locker); {
        new LockerStrategy();
        strategy.assign(locker, order)

    }

    Location getnearestlocker = new Location() {
        HashMap<Location, LockerManager> 
    }


    CreateOrder create = new CreateOrder(); {
        placeorder(user,order) {
            order.getmode();
            findnearestlocation(order.getmode()); {
                getnearestlocker.lockermanager.assign(user,order)

            }
            
        }
    }


}