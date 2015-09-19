/** simple program will convert the temp from Celcius to Fahrenheit
 * this will be in the javadoc
**/

import java.util.*;
class CelciusToFahrenheit {

	public static void main(String[] args) {
		//Declare the variables which will hold the values
		double tempInFahrenheit;
		
		//Prompt the user to enter the temp in celcius
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a temperature in celcius");
		int tempInCelsius = input.nextInt();
		
		//Convert to Fahrenheit
		tempInFahrenheit = ( 9 / 5) * tempInCelsius + 32;
				
		//display the output
		System.out.println(tempInCelsius + " degrees Celcius is " + tempInFahrenheit + " degrees Fahrenheit" );

	}

}
