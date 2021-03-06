//This program will play Rock, Paper, Scissors, prompting the user to enter a number and matching it to a randomly generated one

import java.util.*;
public class RockPaperScissors {

	//Define the constants for Rock Paper scissors, we will do this outside of main because of the static keyword
	final static int SCISSOR = 0;
	final static int ROCK = 1;
	final static int PAPER = 2;

	public static void main(String[] args) {
		//declare variables to keep score
		int compWins = 0;
		int userWins = 0;
		int userChoice = 0;

		//Create a new Scanner object
		Scanner input = new Scanner(System.in);

		//while loop to ensure the game exits after 3 wins by either player
		while (compWins < 3 && userWins < 3){ 


			//Prompt the user to enter a value for rock, paper or scissors
			System.out.println("\nEnter sissor (0), rock (1), paper (2)");
			userChoice = input.nextInt();
			
			//Verify that the user enters a number within the specified range
			if (userChoice > 2 || userChoice < 0){
				System.out.print("Please enter a number between 0 and 2");
			}else {
				
			//generate a random number within the specified range 
			int compChoice = (int)(Math.random()* 3);


			//Switch statements to evaluate and generate Strings for both the user guess and computer generated choice
			switch (compChoice){
			case PAPER: System.out.print("The computer is Paper,");
			break;
			case ROCK: System.out.print("The computer is Rock,");
			break;
			case SCISSOR: System.out.print("The computer is Scissor,");
			break;	
			}

			switch (userChoice){
			case PAPER: System.out.print(" the user is Paper,");
			break;
			case ROCK: System.out.print(" the user is Rock,");
			break;
			case SCISSOR: System.out.print(" the user is Scissor,");
			break;			
			}

			//Use selection statements to determine if there is a winner or a draw

			if (compChoice == userChoice){
				System.out.print(" Draw.");
			}else if (userChoice == ROCK && compChoice == PAPER){
				compWins +=1;
				System.out.print(" You lose.");
			}else if (userChoice == ROCK && compChoice == SCISSOR){
				System.out.print(" You win.");	
				userWins +=1;
			}else if (userChoice == PAPER && compChoice == ROCK){
				System.out.print(" You win.");
				userWins +=1;
			}else if (userChoice == PAPER && compChoice == SCISSOR){
				System.out.print(" You lose.");	
				compWins +=1;
			}else if (userChoice == SCISSOR && compChoice == ROCK){
				System.out.print(" You lose.");	
				compWins +=1;
			}else if (userChoice == SCISSOR && compChoice == PAPER){
				System.out.print(" You win.");	
				userWins +=1;
			}
			System.out.print("\nScore (wins): computer =  " + compWins + " user = " + userWins);
		}	
		}
		System.out.print("\nGame Over!"); 
		
	}
}
