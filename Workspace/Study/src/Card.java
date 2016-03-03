//Card class
public class Card {
	
	//variables
	private int value;
	private String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	
	
	//constructors
	public Card (int value){
		this.value = value;
	}
	
	
	//accessors
	public int getValue(){
		return value;
	}
	
	public String getSuit(){
		int index = value / 13;
		return suits[index];
	}
	
	public String getFaceVal(){
		String [] faceVals = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		return faceVals[value %13];
	}
	
	public String toString(){
		return getSuit() + "." + getFaceVal();
	}
	
	//mutators
	public static void shuffle(Card []deck){
		
		for (int i = 0; i < deck.length; i++){
		int rIndex = (int)(Math.random()* deck.length);
		
		Card temp = deck[rIndex];
		deck[rIndex] = deck[i];
		deck[i] = temp;
		
		}
		
		
		
	}
	
	
	
	
	
	//tostring

}
