An Amazon pickup location has various lockers for packages to be dropped off and picked up. We have both packages and lockers of varying sizes. Model the lockers, packages, and pickup location and implement an algorithm to find the best possible empty locker for a given package efficiently.



Start with Clarifying Questions
A sample communication between a candidate and an interview can look like:

What are the sizes for packages and lockers?
Small, Medium, Large
Can I assume that a package should go to the corresponding locker size?
Yes
What if there is no small locker left and a small package arrives?
Good question, if there is no locker with matching size of the package, the package should go to the next locker size available (e.g. Small package goes inside of a medium locker)
Nice, how many lockers from each size exist in the pickup location?
It changes per pickup location. Your model should be able to handle that.
Understood, what if a package arrives and there is no valid locker available?
Your pickup location should not accept the package.
What do you mean by finding an empty locker efficiently?
Well, customers drop and pick up packages constantly. The lockers becomes full and empty constantly as well. Your code should be able to find an available locker very quickly


A larger locker can be used if the right size is not available for a package. He also said that I need to write 3 classes. User can enter a locker number and the package is removed from the locker. It took a couple of more minutes.


points:

- customer places an order
- customer chooses a delivery address and pickup pachage from there in no extra cost.
- customer places an oorder and the service suggests the nearest available locker based on preferences.
- The order is packaged and placed in the locker. 


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