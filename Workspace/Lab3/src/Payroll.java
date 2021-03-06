/*This program will prompt the user to Enter the following Payroll related information
 * Employee Name
 * Number of Hours worked
 * Hourly Pay rate
 * Federal Tax Withholding
 * State Tax withholding
 * 
 * The system will then generate a Payroll statement which will print the entered information, along with pay and tax information. 
 * 
 * For example:
 * 
 * Employees name: Fred Smith
 * Hours worked: 10
 * Pay Rate: $6.75
 * Gross Pay: $67.5
 * Deductions:
 * Federal Withholding(20.0%): $13.5
 * State Withholding(9.0%): $6.075 
 * Total Deductions: $19.575
 * Net Pay: $47.925
 */

import java.util.*;
public class Payroll {

	public static void main(String[] args) {
		//Create a scanner object 
		Scanner input = new Scanner(System.in);
		
		
		//Prompt the user to enter the required information
		System.out.println("Please enter Employee first and last name (e.g John Doe): ");
		String empName = input.nextLine();
		
		System.out.println("Please enter the number of hours worked in a week (e.g 45): "); 
		double hoursWorked = input.nextDouble();
		
		System.out.println("Please enter hourly pay rate e.g (8.75): ");
		double payRate = input.nextDouble();
		
		System.out.println("Please enter the Federal Tax Withholding rate (e.g .20 => 20%) : ");
		double fedTax = input.nextDouble();
		
		System.out.println("Please enter the State Tax Withholding rate (e.g .09 => 9%) : ");
		double stateTax = input.nextDouble();
		
		//Calculate gross pay
		double grossPay = hoursWorked * payRate;
		
		//Calculate the taxes and withholdings
		double fedHold = grossPay * fedTax;
		double stateHold = grossPay * stateTax;
		double totalHold = fedHold + stateHold;
		double netPay = grossPay - totalHold;
		
		
		
		//Display the output
		System.out.println("Employee name: " + empName + " \n"+
							"Hours worked: " + hoursWorked  + "\n" + //Leaving this as double rather an int since it is better suited to the data being entered
							"Pay Rate: $" + payRate + "\n" +
							"Gross Pay: $"  + grossPay + "\n" +
							"Deductions: " + "\n" +
							"    Federal Withholding " + "(" + fedTax * 100 + "%): " + "$" +fedHold  + "\n" +
							"    State Withholding "	+ "(" + stateTax * 100 + "%): " + "$" + stateHold + "\n" +
							"    Total Deductions: $"  + totalHold + "\n" +
							"Net Pay: $" + netPay);

	}

}
