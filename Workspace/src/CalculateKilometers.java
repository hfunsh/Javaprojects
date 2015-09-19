//This program will calculate kilometers per mile
public class CalculateKilometers {

	public static void main(String[] args) {
		// Declare a double variable named miles with an initial value 100
		
		double miles = 100;
		
		//Declare a double constant named KILOMETERS_PER_MILE with value 1.609
		
		final double KILOMETERS_PER_MILE = 1.609;
		
		//Declare a double variable named kilometers, multiply miles and KILOMEERS_PER_MILE and assign the result to kilometers
		
		double kilometers = KILOMETERS_PER_MILE * miles;
		
		//display kilometers to the console
		
		System.out.println(kilometers);

	}

}
