import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
	
	private List <Card> cards;
	
	public Deck() {
        cards = new ArrayList<>();

	for(Suit suit : Suit.values()) {
		
		for(Rank rank : Rank.values()) {
			cards.add(new Card(suit, rank)); //create the cards, and add them to the list
			}
			
		} 
	
	}
	public void printAllCards() { //printing all cards
		System.out.println(cards);
	}
		public void shuffle() {      //built in shuffle method from list
			Collections.shuffle(cards);
			}
				public int currentCount() {
					return cards.size(); 
				}
	
					public Card drawCard () { 		//drawing a card from the deck(cards arrary)     	
						  if(cards.isEmpty()) {
							 return null; 
				}
							   return cards.remove(cards.size() - 1); //remove a card from the deck, the bottom of it
		
		}
						
}


