
import javax.swing.JOptionPane;

public class ComputeTheTip
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog(null,
				                  "Enter cost of the meal:",
				                  "Computing the Tip",
				                  JOptionPane.QUESTION_MESSAGE);
		
		double originalAmount = Double.parseDouble(input);
		System.out.println("You entered: " + originalAmount);
		
		double tip = originalAmount * 0.15;
		System.out.println("tip is: " + tip);
		
		double tax = originalAmount * 0.05;
		System.out.println("tax is: " + tax);
		
		double amount = originalAmount + tax + tip;
		System.out.println("you owe: " + amount);
		
		String outMsg = "Bill was: " + originalAmount + 
		              "\nTip is:   " + tip + 
		              "\nTax is:   " + tax + 
		              "\nTotal is: " + amount; 
		 JOptionPane.showMessageDialog(null, outMsg);             

	}

}
