import java.util.Scanner;

public class CalcTip
{
	public static void main(String[] args)
	{
	   //Create a Scanner object, reading from the keyboard (System.in)
		Scanner input = new Scanner (System.in);
		
		//prompt user to enter in the amount of the bill
		System.out.println("Enter amount of the bill: ");
		double bill = input.nextDouble();
		
		double tip = 0.15;
		//todo: prompt user for amount(percent: 15 for 15%) of the tip
		//      input the value as a double, then convert to a decimal (0.15)
		System.out.println("Enter a percent for the tip");
		tip = input.nextDouble();
		tip = tip/100;
		 
		double total = 0;
		//todo: compute total cost
		total = bill + (bill * tip);
		
		//display the tip and the total
		System.out.println("tip=" + tip + ", total=" + total);
		
	}

}