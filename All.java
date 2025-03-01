package Pizza_Pricing;

public class All {

		    public static void main(String[] args) {
		        Pizza p = new Pizza(false);
		        DeluxPizza p2 = new DeluxPizza(true);

		        p.getBill();

		        p.addExtraCheese();
		        p.addExtraToppings();
		        p.addExtraCheese(); // Trying to add cheese again
		        p.takeAway();
		        p.getBill();

		        p2.getBill();
		    }
		}
