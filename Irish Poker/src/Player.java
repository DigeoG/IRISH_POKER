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
}
