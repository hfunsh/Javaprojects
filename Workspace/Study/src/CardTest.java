
public class CardTest {

public static void shuffle(Card []deck){
		
		for (int i = 0; i < deck.length; i++){
		int rIndex = (int)(Math.random()* deck.length);
		
		Card temp = deck[rIndex];
		deck[rIndex] = deck[i];
		deck[i] = temp;
		
		}
}
	
	public static void main(String[] args) {
		//create a new deck of cards
		Card [] deck = new Card[52];
		for (int i = 0; i < deck.length; i++){
			deck[i] = new Card(i);
		}
		
		
		//print the deck
		for (int j = 0; j < deck.length; j++){
			System.out.print(deck[j].getValue() + " " + deck[j].getFaceVal() + " " + deck[j].getSuit() + "\n");
			
		}
		
		
		//shuffle the deck
		shuffle(deck);
		
		System.out.println("");
		System.out.println("New Deck-----------------------------------------------------------");
		System.out.println("");
		
		
		
		//print the newly shuffled deck
		for (int j = 0; j < deck.length; j++){
			System.out.print(deck[j].getValue() + " " + deck[j].getFaceVal() + " " + deck[j].getSuit() + "\n");
		
	}

}
}