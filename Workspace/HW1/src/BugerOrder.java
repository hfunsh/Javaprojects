//This application will take orders for Burgers, fries & drinks, calculating a discount for any single item with a quantity greater than three. It will then calc total + tax and change due if applicable

import java.util.*;


public class BugerOrder {
	
	//Declare Constants for the prices of items, along with sales tax
	final static double COST_BURGER = 2.75;
	final static double FRIES = 1.25;
	final static double COKE = .95;
	final static double DISCOUNT = .80;
	final static double TAX = .05;
	
	
	public static void main(String[] args) {
		
		//declare variables to store the qty and prices
		
		int burgerOrdered = 0;      //number of burgers ordered
		int friesOrdered = 0;       // number of fries ordered
		int cokesOrdered= 0;        //number of cokes ordered
		double burgerPrice = 0;     //total price for burgers ordered
		double friesPrice = 0;      //total price for fries ordered
		double cokesPrice = 0;      //total price for cokes ordered
		double subTotal = 0;        //total price of all three items before tax
		double amtDue = 0;          //Total price + tax
		double changeDue = 0;       // Change due to the customer
		double salesTax = 0;        //Calculated tax 
		double remBal = 0;          //Balance if amount is not paid in full
		double payment= 0;          //Amount tendered
		
		
		//create a scanner object
		Scanner input = new Scanner(System.in);


		//prompt the user to enter their order
		System.out.println("How many Burgers do you want?");
		burgerOrdered = input.nextInt();
		
		System.out.println("How many Fries do you want?");
		friesOrdered = input.nextInt();
		
		
		System.out.println("How many Cokes do you want?");
		cokesOrdered = input.nextInt();
		
		
		//Output a message and exit if there are no items ordered
		if (burgerOrdered <= 0 && friesOrdered <= 0 && cokesOrdered <= 0 ){
			System.out.print("You didn't order anything, no payment due");
		}else{
			
		//Otherwise, proceed with the rest of the program
		
		//calculate the discount qty is greater than three for any item
		if (burgerOrdered >= 3){
			burgerPrice = COST_BURGER * burgerOrdered * DISCOUNT; 
			} else 
				burgerPrice = COST_BURGER * burgerOrdered;
		
		if (friesOrdered >= 3){
			friesPrice = FRIES * friesOrdered * DISCOUNT; 
			} else 
				friesPrice = FRIES * friesOrdered;
		
		if (cokesOrdered >= 3){
			cokesPrice = COKE * cokesOrdered * DISCOUNT; 
			} else 
				cokesPrice = COKE * cokesOrdered;

		//calculate the total price plus tax 
		subTotal = burgerPrice + friesPrice + cokesPrice;
		salesTax = subTotal * TAX;
		amtDue = subTotal + salesTax;		

		//prompt the user for payment
		
		System.out.println("Number of Burgers........... " + burgerOrdered);
		System.out.println("Number of Fries............. " + friesOrdered);
		System.out.println("Number of Cokes............. " + cokesOrdered);
		System.out.printf("\n                   subtotal: %5.2f\n", subTotal);
		System.out.printf("                        tax:%5.2f\n", salesTax);
		System.out.printf("                      total: %5.2f\n", amtDue);


		//enter amount tendered
		System.out.printf("\n              Enter payment: " );
		payment = input.nextDouble();
		
				
		//Ensure the user doesn't under pay
		while (payment < amtDue){
			remBal = amtDue - payment;
			System.out.printf("              You still owe: %5.2f \n              Enter payment: ", + remBal );
			amtDue = remBal;
			payment = input.nextDouble();
			}
		
		//Calculate change due if applicable
		if (payment > amtDue){
			changeDue = payment - amtDue;
			System.out.printf("\n             Your change is:%5.2f ", + changeDue);
		
			
         //Calculate the breakdown of the change in dollars and coins
		changeDue = changeDue + .00001;              //prevents rounding errors
        int numPennies = (int)(changeDue * 100);  //amount is a double, storing into an int
     
      //compute the number of dollars
        int numDollars = numPennies / 100;
        numPennies = numPennies % 100;
        
     //compute number of quarters 
        int numQuarters = numPennies / 25;
        numPennies = numPennies % 25;
     
     //todo: compute number of dimes
        int numDimes = numPennies / 10;
        numPennies = numPennies % 10;
     
     //todo: compute number of nickels
        int numNickels = numPennies/5;
        numPennies = Math.round(numPennies) % 5;
     
        System.out.println("\n                    Dollars: " + numDollars);
        System.out.println("                   Quarters: " + numQuarters);
        System.out.println("                      Dimes: " + numDimes);
        System.out.println("                    Nickels: " + numNickels);
        System.out.println("                    Pennies: " + numPennies);
        
		}
        System.out.println("\nEnjoy your meal, thanks!");
		}
	}

}
