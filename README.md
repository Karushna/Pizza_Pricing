The Pizza Billing System is a simple Java application that allows users to order pizzas with additional options such as extra cheese, extra toppings, and takeaway services. The system calculates the final bill based on the selected options.
Features
Base Pizza Pricing
Veg Pizza: 300 Ksh
Non-Veg Pizza: 350 Ksh
Additional Options
Extra Cheese: +100 Ksh
Extra Toppings: +100 Ksh
Takeaway Service: +50 Ksh
Delux Pizza
Automatically includes extra cheese and extra toppings
Bill Generation
Displays itemized bill including all selected options


Classes Explanation
1. Pizza.java
This class represents a regular pizza and includes methods to:
Add extra cheese
Add extra toppings
Mark order for takeaway
Generate a bill
2. DeluxPizza.java
This class extends Pizza and automatically applies extra cheese and extra toppings.
3. Main.java
This is the entry point of the application, where pizzas are ordered and bills are generated.
How to Run
Clone the repository or copy the files into a Java project.
Compile the Java files using:
 javac Pizza.java DeluxPizza.java Main.java


Run the application:
 java Main



Future Improvements
Add more customization options (e.g., pizza sizes, crust types, etc.)
Implement a graphical user interface (GUI)
Integrate with a database for order management
License
This project is open-source and free to use.

