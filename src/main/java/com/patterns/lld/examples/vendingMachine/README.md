Requirements
The vending machine should support multiple products with different prices and quantities.
The machine should accept coins and notes of different denominations.
The machine should dispense the selected product and return change if necessary.
The machine should keep track of the available products and their quantities.
The machine should handle multiple transactions concurrently and ensure data consistency.
The machine should provide an interface for restocking products and collecting money.
The machine should handle exceptional scenarios, such as insufficient funds or out-of-stock products.


Thought process behind building:
1. Identify the actors.
2. Identify the components that can have their own dynamic flow or meaning eg, inventory, payments.
3. Create a high-level interaction flow, it gives you a good idea of the object calls will look like and how you can divide responsibilities. Top down approach is the way to go!


High-level user machine interaction thought process, final can be seen in demo class:

class VendingMachineDemo {

    PaymentInterfact paymentsMode = new Payment();
    Inventory inventory = new Inventory();
    VendingMachine machine  = new VendingMachine(paymentsMode, inventory);


    machine.displayProducts();
    int price = machine.selectProdcut(productname);
    machine.buyproductbByMakingPayment(prodcut, price);
    machine.addPorduct(Product);
    machine.collectMoney();

}


Design Patterns used and concepts:

1. Facade pattern: The MachineImpl class acts as a façade by coordinating between the payment and inventory subsystems. This simplifies the client’s interaction with the vending machine functionality.

2. Builder Pattern: The Product class implements a builder pattern and enables easy construction of Products.

3. Interface-Based Design: By using interfaces (Inventory, Machine, MachineAdmin, Payments), we enable loose coupling and easier swapping of implementations. 

4. Dependency Injection: Both MachineImpl and MachineAdminImpl receive their dependencies via constructor injection, which facilitates testing and future extension.

