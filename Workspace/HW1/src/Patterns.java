// simple application to print a pattern of numbers

public class Patterns {
		
	final static int NUM_ROWS = 6;

	public static void main(String[] args){

	int col = 1;

	for (int row = 0; row <= NUM_ROWS; row++) { //Outer loop to iterate through a specific number of rows

		for (int x = 6; x > row; x--){    //inner loop to print the numbers 
			System.out.printf("%3d", x);  //printf prints the numbers 
}
		System.out.println(); //insert a blank line after each iteration
	}
	
 	}
}