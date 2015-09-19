//This program will add the sum of the digits entered by the user

import java.util.*;
public class SumDigits {

	public static void main(String[] args) {
		//prompt the user to enter a number
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number within the range of 0 and 999");
		int numEntered = input.nextInt();
		
		/*add the numbers together by:
		 * use the modulus to remove extract digits, then use the divide operation to extract them
		 * 
		 */
		int a = numEntered  % 10;
				
		int x = numEntered / 10;
				
		int b = x % 10;
				
		int c = x / 10;
				
		int d = a + b + c;
		
		
		//display the output
		System.out.println("The sum of the digits is " + d);
		

	}

}
