package game;
import java.util.List;
public class busFlipResult {
	
	private final Card card;
	private final State busState;
	private final List<busEffect> Effects;
	
	public busFlipResult(Card card, State busState, List<busEffect> Effects) {
		this.card = card;
		this.busState = busState;
		this.Effects = Effects;	
	}
	public Card getCard() {
		return card;
	}
	
	public State getBusState() {
		return busState;
	}
	public List<busEffect> getEffects() {
		return Effects;
	}
}
