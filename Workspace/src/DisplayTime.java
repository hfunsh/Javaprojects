//This program will prompt the user to enter a time and calculate the number of minutes and seconds left

import java.util.*; //Import the util package which contains the Scanner class
import javax.swing.*;

public class DisplayTime {

	public static void main(String[] args){
		// Declare variables that will store minutes and the seconds
		int minutes;
		int seconds;
	    
		//Prompt the user to enter a time, do this using the scanner method
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter an integer to be converted to Minutes and Seconds");
	    int numEntered = input.nextInt();
	
		
		
		/*calculate the number of minutes left
		 * This can be done by dividing the user input by 60. This will give us the number of minutes in said input
		 * We will then reassign the inputed number to be the modulos of 60
		 * This will allow the rest of the program to execute with ONLY the remainder of the division
		 * This is important since we want the number of seconds calculated after we have removed the amount of minutes
		 */
		
	    minutes = numEntered / 60; //This will find the number of minutes left by dividing by 60
	    numEntered = numEntered % 60; //This will assign the remainder of that division to the number entered
				
		//calculate the number of seconds left
	    seconds = numEntered;
		
		//display the output
	   // System.out.println("The time you entered contains " + minutes + " minute(s) and " + seconds + " second(s)");
	    
	    //What if we tried to display the output in a dialog box
	    JOptionPane.showMessageDialog(null, "The time you entered contains " + minutes + " minute(s) and " + seconds + " second(s)");
	

	}

}
