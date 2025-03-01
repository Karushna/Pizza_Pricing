package Pizza_Pricing;

public class DeluxPizza extends Pizza {
    public DeluxPizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        // Prevents adding extra cheese again
    }

    @Override
    public void addExtraToppings() {
        // Prevents adding extra toppings again
    }
}
