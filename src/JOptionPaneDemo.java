//demonstrate the JOptionPane class

import javax.swing.JOptionPane;
import java.lang.NumberFormatException;

public class JOptionPaneDemo{

	public static void main(String[] args){

	boolean continueLoop = true;	

//	do{

	try{
        //declare 2 String inputs and set their values to the JOptionPane message dialog method
	String string1 = JOptionPane.showInputDialog("Enter the first number");
	String string2 = JOptionPane.showInputDialog("Enter the second number");

        //Convert the strings to numbers and perform calculations
	int num1 = Integer.parseInt(string1);
	int num2 = Integer.parseInt(string2);

	int sum = num1 + num2;

	//Display the output using a message box
	JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of two integers",
					JOptionPane.PLAIN_MESSAGE);
	}catch(NumberFormatException numberFormatException){
	JOptionPane.showMessageDialog(null,"Invalid input, please enter an integer", "Input error",
	JOptionPane.PLAIN_MESSAGE); }

	//}while (continueLoop == true);

}

}
