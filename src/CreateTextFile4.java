//create a text file and prompt the user to write data to the file

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.lang.SecurityException;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;
import java.util.NoSuchElementException;
import java.util.Formatter;

public class CreateTextFile4{

	public static void main(String[] args){

	openFile();
	addRecords();
	closeFile();

}
	public static void openFile(){
	
	try{
		output = new Formatter("Neighbors.txt");
	} 	
	catch (SecurityException securityException)
	{
	 	System.err.print("You don't the permission, terminating");
	}
	catch (IOException ioException)
	{
		System.err.print("Error opening the file, terminating");
	}
	
}
	private static Formatter output;

	public static void addRecords(){
	Scanner	input = new Scanner(System.in);

	System.out.printf("%s %n %s %n", "Enter First Name, Last Name, Street Number", "Enter end of file indicator");

	while(input.hasNext()){

	try{
		output.format("%s %s %d", input.next(), input.next(), input.nextInt());
	}
	catch (NoSuchElementException noSuchElementException)
	{
		System.err.println("File not found, terminating");
	}
	catch (IllegalStateException illegalStateException)
	{
		System.err.print("Error reading the file, terminating");
	}

	}
}

	public static void closeFile(){
	
	if(output != null){
	output.close();
}


}



}
