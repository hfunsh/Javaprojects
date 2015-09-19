/*This program will generate two random numbers, then prompt the user to add them together
  The system will then display the results of the addition as well as the amount of time it took the user to respond*/

import java.util.Scanner;
public class AddNumbers {

	public static void main(String[] args) {
		
		// Use the Math.random class to generate two random numbers in the given range
		int val1 = (int)(Math.random()*100 + 10);
		int val2 = (int)(Math.random()*100 + 10);
		int val3 = val1 + val2;
	
		
		//Prompt the user to add them together
		Scanner input = new Scanner(System.in);
		System.out.println("What is: " + val1 + " + " + val2 + " = ? ");
		
		
		//Start a System timer to time the user response time 
		long startTime = System.currentTimeMillis();
		
		
		//Read in the input from the user 
		int userAnswer = input.nextInt();
		
		
		//Stop the timer and calculate the time y subtracting Start from End times
		long stopTime = System.currentTimeMillis();
		long timeToAnswer = stopTime - startTime; //calculate the time it took to respond
		long timeInSecs = timeToAnswer / 1000; // Convert the milliseconds to seconds
				 
		
		//Display the output
		System.out.println("The answer is: " + val3 + " and it took you: " + timeInSecs + " secs");

		val1 = (int)(Math.random()*200 + 50);
		val2 = (int)(Math.random()*200 + 50);
		val3 = val1 + val2;		
		
		//Prompt the user to add them together
		System.out.println("What is: " + val1 + " + " + val2 );
		
		
		//Start a System timer to time the user response time 
		 startTime = System.currentTimeMillis();
		
		
		//Read in the input from the user 
		 userAnswer = input.nextInt();
		
		
		//Stop the timer and calculate the time y subtracting Start from End times
		stopTime = System.currentTimeMillis();
		timeToAnswer = stopTime - startTime; //calculate the time it took to respond
		timeInSecs = timeToAnswer / 1000; // Convert the milliseconds to seconds
				 
		
		//Display the output
		System.out.println("The answer is: " + val3 + " and it took you: " + timeInSecs + " secs");
	
	}

}
