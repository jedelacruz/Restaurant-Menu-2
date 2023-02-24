package restoBill2;
import java.util.Scanner;
public class bill {
	  public static void main(String[] args) {
	  
		  Scanner scanner = new Scanner(System.in);
		  
		  
		   // Print the menu
		    System.out.println("Welcome to Lyceum restaurant!\n");
		    System.out.println("Here is our menu:\n ");
		    
		    System.out.println("[1]. Imissusilog - $15.00");
		    System.out.println("[2]. Chickensilog - $7.00");
		    System.out.println("[3]. Siomai Rice - $5.00");
		    System.out.println("[4]. Tapsilog - $10.00");
		    System.out.println("[5]. Hotsilog - $5.00");
		    
		    
		    // Prompt the customer to select an item
		    System.out.print("\nPlease enter the number of the item you would like to order: ");
		    int item = scanner.nextInt();
		    
		    // Determine the price of the selected item
		    double price;
		    
		    if (item == 1) {
		      price = 15.00;
		    } 
		    else if (item == 2) {
		      price = 7.00;
		    } 
		    else if (item == 3) {
		      price = 5.00;
		    } 
		    else if (item == 4) {
			  price = 10.00;
			} 
		    else if (item == 5) {
			  price = 5.00;
			} 
		    else {
		      System.out.println("Invalid item selected.");
		      return;
		    }
	  
		    // Prompt the customer for the quantity
		    System.out.print("Please enter the quantity: ");
		    int quantity = scanner.nextInt();

		    // Calculate the total price
		    double totalPrice = price * quantity;
		    System.out.println("Your total is $" + totalPrice);
	  
	
		    // it will ask the user on how will they pay
		    boolean isValidPaymentMethod = false;
		    
		    while (!isValidPaymentMethod) {
		        System.out.println("Would you like to pay with [1] cash or [2] credit card?");
		        
		        int payment = scanner.nextInt();
		        if(payment == 1) {
		        	isValidPaymentMethod = true;
			          System.out.println("Please enter the amount of money you have:");
			          double amountOfMoney = scanner.nextDouble();
			          double change = amountOfMoney - price;
			          System.out.println("Your change is: " + change);
			          System.out.println("Thank you for dining in our restaurant!");
		        }
		        else if (payment == 2) {
		        	isValidPaymentMethod = true;
			        System.out.println("Please swipe your credit card.");
			        System.out.println("Thank you for dining in our restaurant!");
		        }
		        else {
		        	 System.out.println("Invalid payment method. Please try again.");
		        }
		    }
		        
		    
	  }
}
