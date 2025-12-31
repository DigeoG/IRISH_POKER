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
			public void playerScore(int score) {
				
			}


}
