//This program will convert the number of minutes to years and days

import java.util.*;
public class MinutesToYears {

	public static void main(String[] args) {
		//prompt the user to enter a number of minutes
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of minutes : ");
		int minutes = input.nextInt();
		
		//convert the minutes into hours
		int totalHours = minutes / 60;
		
		//convert the number of hours to days
		int numberOfDays = totalHours / 24;
		
		
		//convert the number of days to years
		int numOfYears = numberOfDays / 365;
		
		//find the number of days left after converting to years
		
		numberOfDays = numberOfDays % 365;
	
		
		
		//display the output
		
		System.out.println(minutes + " minutes is approximately " + numOfYears + " years " + numberOfDays + " days ");

	}

}
