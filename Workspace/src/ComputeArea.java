//This program will compute the area of a circle
//Edit 1 - now we will edit the program to read in the radius from a user
//Edit 2 - now we will edit the program to read in the radius using a dialog box

import java.util.*; //import the entire util class which contains the Scanner method
import javax.swing.*; //import the javax class which contains the dialog box

public class ComputeArea {

	public static void main(String[] args) {
		/* 1. Read in the radius 
		 * 2. Compute the area using the formula: area = radius * radius * pie
		 * 3. Display the result
		 */
		
		// first step is to declare variables to store information
		
		double area; //store the area
		
		//create a new SCanner object 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to Enter a new Radius
		
		JOptionPane.showInputDialog("Enter the radius of a circle");
		//System.out.println("Enter the radius of the circle ");
		double radius = input.nextDouble();
		
		//compute the area
		
		area = radius * radius * 3.14159;
		
		//Display the results
		
		System.out.println("The area of your circle is " + area);
		
		
		

	}

}
