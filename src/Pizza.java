public class Pizza {

    // Initialization: Attribute Declaration
    private final PizzaSize size;
    private final PizzaCrustType crust;

    // Constructor: Pizza
    Pizza (PizzaSize size, PizzaCrustType crust) {
        this.size = size;
        this.crust = crust;
    }

    // Method: Getter (size attribute)
    PizzaSize getSize () {
        return this.size;
    }

    // Method: Getter (crust attribute)
    PizzaCrustType getCrust () {
        return this.crust;
    }
}

// Enum: Enumerate pizza size
enum PizzaSize {
    SMALL(5), MEDIUM(7), LARGE(10);

    // Initialization: Variable Declaration
    private final int pizzaPrice;

    // Constructor: PizzaSize
    PizzaSize(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    // Method: Getter (pizzaPrice)
    public int getPizzaPrice () {
        return this.pizzaPrice;
    }
}

// Enum: Enumerate pizza crust types
enum PizzaCrustType {
    THIN, THICK, STUFFED
}