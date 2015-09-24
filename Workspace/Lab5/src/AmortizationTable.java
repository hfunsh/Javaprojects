import java.util.Scanner;

public class AmortizationTable {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		
		//Prompt the user to enter loan information
		System.out.println("Please enter the Loan Amount: ");
		double loanAmt = input.nextDouble();
		
		System.out.println("Please enter the Annual Interest rate e.g 4.5 ");
		double apr = input.nextDouble();
		
		System.out.println("Please enter the loan term in years e.g 1");
		int numYears = input.nextInt();
		
		//declare variables to hold the various amounts entered
		
		int term = numYears * 12; 
		
	  	
		double monthlyInterest = apr/12/100 ;
		
		double monthlyPayment = (monthlyInterest * loanAmt) / (1 - (Math.pow(1 + monthlyInterest, -term)));
	
		
		//display the header
		System.out.printf("%s %9.2f\n %9s %9s   %9s  %9s\n", "Monthly payment", monthlyPayment, "payment", "interest", "principal", "balance" );
		
				
		//Use a for loop to display calculate and display the table
		
		
		for (int i = 1; i <= term; i++ ){
			
			double interest = monthlyInterest * loanAmt; //calculate the interest for each month using the derived monthly interest rate
					
			double principal = monthlyPayment - interest; //deduct the interest from the payment to determine how much goes towards the principal
			
			loanAmt -= principal; //Update the new balance by subtracting the principal from the loan 
			
			System.out.printf("%9d %9.2f  %9.2f    %9.2f\n", i, interest, principal, loanAmt);
		}
		
		
		
				

	}

}