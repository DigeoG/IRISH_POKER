/* This class is used to store a players cards as well as has actions to remove and add cards
 * to a players hand. Lists have built in .add and .remove functions. Must call the array 
 * which in this case is hand to use those built in functions. The score setters and getters are 
 * there just incase for future use. 
 */
package game;

import java.util.ArrayList; 
import java.util.List;
public class Player {

	
	private List <Card> hand; 
	private int score;
	
	
	public Player() {
		hand = new ArrayList<>(); 
		score = 0; 
		 
	}
		public void addCard(Card card) {
			hand.add(card);
			
		}
			public List<Card> getHand() {
				return hand;
			}
		public int getScore() {
			return score;
		}
		public void addScore(int amount) {
			score += amount; 
		}
		public void removeCard(Card card) {
			hand.remove(card);

		}
		public int getHandSize() {
			return hand.size();
		}
		}
