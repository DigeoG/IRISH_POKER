
public class RoundResult {
	private final boolean correct;
	private final int drinks;
	private final Card card; 

	public RoundResult(boolean correct, int drinks, Card card) {
		this.correct = correct;
		this.drinks = drinks;
		this.card = card;
		
	}
	public boolean isCorrect() {
		return correct;
	}
		public int getDrinks() {
			return drinks;
		}
			public Card getCard(){
				return card;
			}
}

