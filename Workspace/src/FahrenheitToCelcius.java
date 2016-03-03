//This program will convert Fahrenheit to Celcius

import java.util.*;
public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// declare the variable which will hold the temps in celcius
		
		double tempInCel;
		
		//Prompt the user to enter a temp in Fahrenheit
		System.out.println("Please enter a temperature in Fahrenheit");
		Scanner input = new Scanner(System.in);
		double tempInFah = input.nextDouble();
		
		
		//Convert the input to celcius
		
		tempInCel = (5.0 / 9) * (tempInFah - 32);
		
				
		//display the output
		System.out.println(tempInFah + " Fahrenheit is " + tempInCel + " celcius" );

	}

}
