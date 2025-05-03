public class Pizza {

    private final PizzaSize size;
    private final PizzaCrustType crust;

    Pizza (PizzaSize size, PizzaCrustType crust) {
        this.size = size;
        this.crust = crust;
    }

    PizzaSize getSize () {
        return this.size;
    }

    PizzaCrustType getCrust () {
        return this.crust;
    }
}

enum PizzaSize {
    SMALL(5), MEDIUM(7), LARGE(10);

    private final int pizzaPrice;

    PizzaSize(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public int getPizzaPrice () {
        return this.pizzaPrice;
    }

}

enum PizzaCrustType {
    THIN, THICK, STUFFED
}