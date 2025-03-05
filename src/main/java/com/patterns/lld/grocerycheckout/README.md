Given shoping cart with products and coupons, calculate the net price after applying coupouns on products.
Coupouns can be of different types with certain conditions
1. N% of that is 10% of all items
2. p% of next item
3. D% of nth item of type T

the cart should check for ingredients that add extra taxes
the total should account for basic tax + ingredient taxes



Designe a Grocery Cart Checkout


a food has a list of ingredients
the cart should check for ingredients that add extra taxes
the total should account for basic tax + ingredient taxes



Food
asbtract class Ingredients {
    String name;
}

class Tomato extends Ingredients {

    public Tomato() {};
    private String name;
    private Optional<Integer> tax;
    prviate Integer price;
    private boolean Taxable;

    public Tomato(String name, Integer tax, Integer price, boolean Taxable) {
        this.name = name;
        this.tax = tax;
        this.price = price;
        this.Taxable = Taxable;
    }

}

class Food {

    private List<Ingredients> ingredients;

    public Food(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public getIngrediants() {
        return ingredients;
    }

    public addIngrediantes(Ingredients ingre) {
        result.add(ingre);
    }
}


interface TaxCalulator {

    double calculate(Food food);
}


class BasicTax implements TaxCalulator {

    public IngredientTax(double tax) {
        this.tax = tax;
    }

    double calculate(Food food) {
        return food.getprice * tax;
    } 

}


class IngredientTax implements TaxCalulator{
    private double IngredientTax;

    public IngredientTax(double tax) {
        this.tax = tax;
    }

    double calculate(Food food) {
        return food.getprice * tax;
    } 
}

class TaxManager implements TaxCalulator{

    private List<Taxcalulators> manager = new ArrayList<>();

    public TaxManager(TaxCalulator tax) {
        manager.add(tax);
    }

    public double calculate(Food food) {

        double totalTax = 0.0;
        for (TaxCalulator tax: manager) {
            totalTax += tax.calculate(food);
        }
        return totalTax;
    }

}




Ingredient in = new Ingredient("tomato", 10, 100, true);
Food food = new Food()
food.add(in);

BasicTax b = new BasicTax(0.5);
IngredientTax i = new IngredientTax(0.5);

TaxManager taxItem = new TaxManager();
taxItem.add(b);
taxItem.add(i);

Grocery cart = new GroceryCart(taxItem);





multi_dependents = {'a': ['b', 'c'], 'c' : ['b'], 'd': ['e'], 'b' : [a]}


def install(dependencies):

    visited= set()
    already_visited = set()
    result = []

    def dfs(node):

    
    return result

return [b,c,a]
