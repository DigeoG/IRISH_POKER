import java.util.ArrayList;
import java.util.List;
public class Irish_Poker {

private Deck deck;
private Player player;
private  int round;

	public Irish_Poker () {
		deck = new Deck();
		player = new Player();
		round = 1; 
	}
	
	
			
		public RoundResult playerRound1ColorGuess(String guess) { //must take parameter of a guess of color
			if (round != 1) {
				throw new IllegalStateException("Not Round 1!");
			}
			Card card = deck.drawCard();
			player.addCard(card);
			
			Color cardColor = card.getSuit().getColor(); 
			
			Color guessedColor = guess.equalsIgnoreCase("RED") ? Color.RED : Color.BLACK; 	//ignores whether upper or lower case 
			
			boolean correct = cardColor == guessedColor;
			
			int drinks = 2;
			round ++;
			
			return new RoundResult(correct, drinks, card);

		}
		
		public RoundResult playerRoundHigherLowerGuess(String guess) {
			if (round != 2) {
				throw new IllegalStateException("Not round 2!");
			}
			
			List<Card> hand = player.getHand();
			Card previousCard = hand.get(hand.size() -1);
			Card card2 = deck.drawCard();
			player.addCard(card2);
			
			
			int previousValue = previousCard.getRank().getValue();
			int newValueCard2 = card2.getRank().getValue();
			
			boolean correct;
			
			if( previousValue == newValueCard2) { //setting rule, if they are = then you still lose!
				correct = false;
			}
			else if (guess.equalsIgnoreCase("HIGHER")) { //Check the user guesses
				
				correct = newValueCard2 > previousValue; 
			
			} else if(guess.equalsIgnoreCase("LOWER")) {
				
				correct = newValueCard2 < previousValue;
			
			} else {
				
				throw new IllegalArgumentException("Guess must be 'HIGHER' or 'LOWER' ");
			}
			
			
			int drinks = 4;
			
			round ++;
			
			return new RoundResult(correct, drinks, card2);
		}
		
		public RoundResult playerRoundInOrOut(String guess) {
			
			if(round != 3) {
				throw new IllegalStateException("Not round 3!");
			}
			
			List <Card> hand = player.getHand();
			Card lastCard = hand.get(hand.size() -1);
			Card firstCard = hand.get(0); //can also do .getfirst on java 21 and up
			Card card3 = deck.drawCard();
			player.addCard(card3);
			
			int firstValue = firstCard.getRank().getValue(); //get ranks of cards 
			int secondValue = lastCard.getRank().getValue();
			int thirdValue = card3.getRank().getValue();
			
			boolean correct;
			
			
			if(firstValue == secondValue) {
				
				correct = false; 
			
			} else if(guess.equalsIgnoreCase("OUTSIDE")) {
				 correct = Math.min(firstValue, secondValue) > thirdValue && Math.max(firstValue, secondValue) < thirdValue;
			}
			
			else if(guess.equalsIgnoreCase("INSIDE")) {
				correct = Math.min(firstValue,  secondValue) < thirdValue && Math.max(firstValue, secondValue) > thirdValue; 
			}
			
			else {
				throw new IllegalArgumentException("Must guess 'OUTSIDE' or 'INSIDE' ");
			}
			
			int drinks = 6;
			round ++;
			
			return new RoundResult(correct, drinks, card3);
		
		}

}
