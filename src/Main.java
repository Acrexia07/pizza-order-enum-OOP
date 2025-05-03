import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialization: Variable and object Declaration
        Scanner scn = new Scanner (System.in);
        String description = "";

        // Process: Handling an error in the entire process
        try {
            // Input: user input - pizza size
            System.out.print("Select pizza size (Small, Medium, Large) – not case sensitive: ");
            String pizzaSizeResponse = scn.nextLine().toUpperCase();

            // Input: user input - pizza crust type
            System.out.print("Select pizza crust type (Thin, Thick, Stuffed) – not case sensitive: ");
            String pizzaCrustTypeResponse = scn.nextLine().toUpperCase();

            // Instantiation: ENUM instantiation
            PizzaSize size = PizzaSize.valueOf(pizzaSizeResponse);
            PizzaCrustType crustType = PizzaCrustType.valueOf(pizzaCrustTypeResponse);

            switch (crustType) {
                case THIN -> description = "Nice one! 😁";
                case THICK -> description = "That pizza is THICK! 😲";
                case STUFFED -> description = "That pizza really is sTOUGHED! 😍😻";
                default -> System.out.println("Enter correct options only (Thin, Thick, Stuffed)!");
            }

            // Instantiation: Create a new object based on user response
            Pizza pizza = new Pizza(size, crustType);

            // Output: Print output
            System.out.println("\n======= Order Display =======");
            System.out.println("You ordered a " + pizza.getSize()  + " with a " + pizza.getCrust() + " crust.");
            System.out.println("Total Price: $"+ pizza.getSize().getPizzaPrice());
            System.out.println("Message: " + description);

            // Exit: Close Scanner Object
            scn.close();
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid input: Enter only correct option!");
        }
    }
}

