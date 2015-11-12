//Read ten numbers and input them into an array as long as they are distinct

import java.util.*;

public class PrintDistinctNumbers {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);


		//declare and initialize a new array
		int [] distNum = new int [10];


		//prompt the user to enter 10 numbers
		int count = 0;
		int num = 0;
		int nextNumber = 0;
		
		System.out.println("Please enter a 10 numbers");
		for (int i = 0; i < 10; i++){
			num = input.nextInt();
			boolean distinct = true;
			for (int k = 0;k < nextNumber; k++){
				if (num == distNum[k]){
					distinct = false;
					break;
				}
			}
				if (distinct)	distNum[nextNumber++] = num;
				//System.out.println(distNum[nextNumber]);
		
		}
		for (int i = 0; i < distNum.length; i++)
		System.out.println(distNum[i]);



		//read the numbers and determine if they already exist in the array
		//assign the new num to a variable, then write a loop to see if the value of that variable matches anything else currently in the array
		//Return/ end the method if it does







		//display the new array




	}

}
