//This program will find the day of the week

import java.util.*;
public class FindDayOfWeek {

	public static void main(String[] args) {
		//Declare a variable to hold the current day 
		int dayOfWeek;
		
		
		//prompt the user to enter a number of days to add
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the current day of the week between 0 and 7");
		int currentDay = input.nextInt();
		
		System.out.println("Please enter a number of days to add");
		int numDays = input.nextInt();
			
			
		/* Find the number of days by:
		 * 1) Adding the current day to the number of days inputed by the user
		 * 2) Taking the modulos of that number after dividing by 7 (number of days in a week
		 */
		
		if (numDays > 7) {System.out.println("Please enter a number below 7 and try again");}
		else {
		
		
		dayOfWeek = (currentDay + numDays) % 7;
		
				
				
		//Display the output

		System.out.println(numDays + " from now is the " + dayOfWeek + " day of the week");
		
		
		if (dayOfWeek == 1) System.out.println(numDays + " from now is a Monday");
		
		if (dayOfWeek == 2) System.out.println(numDays + " from now is a Tuesday");
		
		if (dayOfWeek == 3) System.out.println(numDays + " from now is a Wednesday");
		
		if (dayOfWeek ==4) System.out.println(numDays + " from now is a Thursday");
		
	    if (dayOfWeek ==5) System.out.println(numDays + " from now is a Friday");
		
	    if (dayOfWeek == 6) System.out.println(numDays + " from now is a Saturday");
		
	    if (dayOfWeek == 0) System.out.println(numDays + " from now is a Sunday");
		}
						
	}

}

