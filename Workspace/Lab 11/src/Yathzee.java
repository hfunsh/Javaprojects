//Game of Yathzee using the Die class

public class Yathzee {

	static Die [] dice = new Die [5]; //Define a static array of Die, length 5
	final static int NUM_SIDES = 6;


	//method, getCounts, which returns an array of integers representing the count of each Die value, 
	//length=NUM_SIDES.

	public static int [] getCounts( Die [] dice)
	{
		int [] counts = {0,0,0,0,0,0}; 
		for (int i =0 ; i < dice.length; i++){  //loop through the dice array
			counts[dice[i].getValue()-1]++;   //count the number of occurrences of each value, and increment the index of the new array
		}
		return counts;
	}

	//Boolean method is True if you have 5 of a kind
	public static boolean isYathzee(int [] counts)
	{ 

		//loop through the array of counts to determine if a number appears 5 times 
		for (int i = 0; i < dice.length; i++){
			if (counts[i] == 5)
				return true;}

		return false;
	}

	//Boolean is true if you have at least 4 die with the same value
	public static boolean isFourOfKind(int [] counts)
	{
		
		for (int i = 0; i < counts.length; i++){
			if (counts[i]>= 4)
				return true;}
		return false;
	}

	//Boolean Method for Three of a Kind
	public static boolean isThreeOfKind(int [] counts)
	{         
		for (int i = 0; i < counts.length; i++)
			if (counts[i]>=3)
				return true;
		return false;
	}

	//boolean to determine if we have a small straight
	public static boolean isSmallStraight(int [] counts){

		if (counts[2] > 0 && counts[3] > 0){
			if ((counts[0] > 0 && counts[1] > 0) ||
					(counts[1] > 0 && counts[4] > 0) ||
					(counts[4] > 0 && counts[5] > 0))
				return true;
		}

		return false;
	}

	//Large Straight Method
	public static boolean isLargeStraight(int [] counts){

		int value = counts[0];
		for (int i = 1; i < counts.length; i++){
			if (value != counts[i])
				return false;
		}

		return true;


	}
	//Full House Method
	public static boolean isFullHouse(int [] counts){

		if(isThreeOfKind(counts)){
			for (int i = 0; i < counts.length; i++){
				if (counts[i] == 2)
					return true;
			}

		}

		return false;
	}

	//Print method for the dice array
	public static void displayRoll(){


		//print the dice roll array
		System.out.print("roll: ");
		for (int i = 0; i  < dice.length; i++){
			System.out.print("  " + dice[i]+ "," + "");}

		int [] dieCount = getCounts(dice);
		System.out.print("\ncounts: ");
		for (int i = 0; i < dieCount.length; i++){
			System.out.print(dieCount[i] + ", " + " ");
		}

		System.out.println();

		System.out.printf("   Yathzee: %b\n   Four of a kind: %b\n   Three of a kind: %b\n   Small Straight: %b\n   Large Straight: %b\n   Full House: %b\n", isYathzee(dieCount), 
				isFourOfKind(dieCount), isThreeOfKind(dieCount), isSmallStraight(dieCount), isLargeStraight(dieCount), isFullHouse(dieCount));

		System.out.println();
	}



	public static void main (String [] args )
	{
		dice = new Die [5];

		//create the dice
		for (int i = 0; i < dice.length; i++) {  //loop to create a Die object for each element in the array
			dice[i] = new Die(6);
		}

		//roll the dice 5 times and display the results
		for (int k = 0; k < dice.length; k++){

			dice[k].roll();
			displayRoll();

		}          


		/*
         Set the die values using the SetValue Method
		 */
		System.out.println("The following die values were set using the setValue Method");
		System.out.println();


		dice[0].setValue(1);	
		dice[1].setValue(6);
		dice[2].setValue(4);	
		dice[3].setValue(6);
		dice[4].setValue(4);

		displayRoll();



		dice[0].setValue(5);	
		dice[1].setValue(5);
		dice[2].setValue(5);	
		dice[3].setValue(5);
		dice[4].setValue(5);

		displayRoll();

		dice[0].setValue(1);	
		dice[1].setValue(2);
		dice[2].setValue(3);	
		dice[3].setValue(4);
		dice[4].setValue(5);

		displayRoll();

		dice[0].setValue(2);	
		dice[1].setValue(3);
		dice[2].setValue(3);	
		dice[3].setValue(4);
		dice[4].setValue(5);

		displayRoll();

		dice[0].setValue(1);	
		dice[1].setValue(3);
		dice[2].setValue(3);	
		dice[3].setValue(1);
		dice[4].setValue(3);

		displayRoll();
	}

}