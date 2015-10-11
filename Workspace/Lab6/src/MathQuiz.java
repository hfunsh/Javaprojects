/* This application will include several methods using some global static variables that are accessible by all methods within the class (file). 
 * We will generate questions with randomly generated operands and operations (add or subtract).
 *  The questions will be graded and timed, so we can compute the final grade and average response time.
 */

import java.util.*; //Import the Scanner Class

public class MathQuiz {
	
	// Define  static global variables: 
	static long startTime;
	static long endTime;
	static long totalTime;
	static Scanner input = new Scanner (System.in);
	static int numCorrect;                                //number of question correctly answered
	static int totalNum;                                  //Number of questions asked so far
	
	
	//Define a CONSTANT for the number of questions and average time per question
	final static double NUM_QUESTIONS = 10;
	
	// Write a method which will generate a random integer number given a range and offset (both integers).
	public static int numGen(int rnge, int offset)
	{
		int randNum = (int)(Math.random()*rnge + offset);
		
		return randNum;	
	}
	
	/* Write a method which will generate an addition problem given two operands.
	 * The method will prompt the user to add the two operands, get a response, and then verify the answer.  
	 * Indicate to the user if they got the answer correct or not.  
	 * If it was incorrect, display the correct value.
	 */
	
	public static boolean addMeth(int num1, int num2){
		System.out.println("What is " + num1 + " + " + num2 + "?");
		totalNum++;                                      //Increment the count for the total number of questions asked
		
		startTime = System.currentTimeMillis();          //Start a System timer
		
		int userAddAnswer = input.nextInt();             //read the user input
		
		endTime = System.currentTimeMillis();            //Stop the System Timer
		long timePer = (endTime - startTime) / 1000;     //Calculate the time per question and convert to Seconds
		totalTime +=  timePer;                           // Add to the total time
		
		int compAddAnswer = num1 + num2;                // Add the numbers
		
		//Grade the answer and return a boolean
		
		if (compAddAnswer == userAddAnswer){            
			numCorrect++;
			return true;
		} else 
			return false;
		}
	
	/* Method which will generate a Subtraction problem given two operands.
	 * The method will prompt the user to subtract the two operands, get a response, and then verify the answer.  
	 * Indicate to the user if they got the answer correct or not.  
	 * If it was incorrect, display the correct value.
	 */
	
	
	
	public static boolean subMeth(int num1, int num2){
		
		//Ensure that num1 is greater than num2, to maintain a positive number
		if (num2 > num1){
			int temp = num2;
			    num2 = num1;
			    num1 = temp;
		}
		
		System.out.println("What is " + num1 + " - " + num2 + "?"); 
		totalNum++;                                             //Increment the count for the total number of questions asked
		   
		startTime = System.currentTimeMillis();                 //Start a System timer
		
		int userSubAnswer = input.nextInt();                     //read the user input
		endTime = System.currentTimeMillis();                    //Stop the System Timer
		long timePer = (endTime - startTime) / 1000;             //Calculate the timer per question and convert to Seconds
		totalTime +=  timePer;                                   // Add to the total time
		
		int compSubAnswer = num1 - num2;                         //Subtract the numbers
		
		//Grade the quiz answer
		if (compSubAnswer == userSubAnswer){
			numCorrect++;
			return true;
		}
		else return false;
		}
	
	
	//Write a Method to assign a letter grade based on the number of questions answered correctly
	public static String quizGrade(int numberCorrect, int totalNumber){
		
		double grade = ((double)(numberCorrect)/ (double) (totalNumber))*100; //Convert this number to a double in order to divide and multiply by 100 
		
		String letterGrade = " ";
		if (grade < 60){
			letterGrade = "F";} 
		if (grade >= 60 && grade < 70){
			letterGrade = "D";}
		if (grade >= 70 && grade < 80){
			letterGrade = "C";}
		if (grade >= 80 && grade < 90){
			letterGrade = "B";}
		if (grade >= 90){
			 letterGrade = "A";}
		
		return letterGrade;
		
	}
	

	public static void main(String[] args) {
		
		
		
		//loop to generate questions 
	   for (int count = 0; count < NUM_QUESTIONS; count++){
		
		int selectMeth = (int)(Math.random()*2 +1);   //generate 1 or 2 to determine which method to run
		int operand1 = numGen(20, 5);                 //generate the operands to add or subtract
		int operand2 = numGen(20, 5);
		boolean quizQuest = false;
		
		if (selectMeth == 1){                       //if we generate a 1, select the subtract method
		quizQuest = (subMeth(operand1,operand2));
		} else if (selectMeth == 2){                //if we generate a 2, select the add method
		quizQuest = (addMeth(operand1,operand2));	
		
		}
		if (quizQuest == true){                     //provide feedback on answers entered
			System.out.println("Correct! ");
		}else
			System.out.println("Incorrect - the correct answer is " + (Math.abs(operand1 - operand2)));
		   }
	   
	   
	   double avgTime = totalTime/NUM_QUESTIONS; //Calculate the average time per question
	   
	   //Display the results
	   System.out.println("You got " + numCorrect + " correct out of " + totalNum + " questions " + "\n"
			   + "Your grade is: " + (quizGrade(numCorrect, totalNum)) + "\n" 
			   + "The average response time: " + avgTime + " secs ");
	   	  
	}

}

