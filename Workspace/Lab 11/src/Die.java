//Die class 
public class Die {

	//data variables
	private int value;
	private int numSides;


	//empty constructor
	public Die () 
	{ 
		numSides = 6; //set the default value to 6
		value = roll(); //roll the dice
	}

	//Method to set the default numsides to 6
	public Die (int numSides)
	{
		this.numSides = numSides;
		value = roll();
	}
	
	//roll the die
	 int roll()
	{
		value = (int)(Math.random()*6+1);
		return value;
	}
	 
	//flip the die 
	int flip(){
		value = (int)(Math.random()*numSides + 1);
		return value;
	}

	//get the value of the die
	int getValue()
	{
		return value;
	}

	//set the value of the die for testing purposes
	public int setValue(int newValue)
	{
		return value = newValue;
	}


	public String toString()
	{
		return "" + getValue();
	}	



}


