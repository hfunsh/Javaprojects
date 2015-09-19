//This program will prompt the user to enter 3 numbers, then store and compute their average

import java.util.*;
public class ComputeAverage {

	public static void main(String[] args) {
		//create a new scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter 3 numbers 
		System.out.println("Enter three numbers to be averaged");
		
		//read in these numbers into declared variables
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		//compute the average
		
		double average = (number1 + number2 + number3)/3;
		
		
		// display the output
		System.out.println("The average is " + average);

	}

}
