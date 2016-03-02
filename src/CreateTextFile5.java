//create a text file and prompt the user to enter values

import java.util.Scanner;
import java.util.Formatter;
import java.io.IOException;
import java.lang.SecurityException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;

public class CreateTextFile5{

public static void main(String[] args){


	openFile();
	addRecords();
	closeFile();

}
	
	public static Formatter output;

	public static void openFile(){
	try{

		output = new Formatter("coffee.txt");

	} catch (SecurityException securityException){
		System.err.print("You do not have the permission to perform that action, terminating");
	} catch (FileNotFoundException fileNotFoundException){
		System.err.print("File not found, terminating");
	}	

}
	public static void addRecords(){
		Scanner input = new Scanner(System.in);

		System.out.printf("%s %n %s %n", "Please enter Coffee shop name, location and street number", "Enter end-of-file indicator");

		while(input.hasNext()){
	
		try{
	
		output.format("%s %s %d", input.next(), input.next(), input.nextInt());
	
		}catch (FormatterClosedException formatterClosedException){
			System.err.print("Illegal file state, terminating");
		}

		}

}


	public static void closeFile(){

	if (output != null){
	output.close();
	} 


}

}
