import java.util.List;
import java.util.ArrayList;
public class busPhase {

private Deck deck;
private List<Player> players;
private State busState;
	
public busPhase (Deck deck, List<Player> players) {
		this.deck = deck;
		this.players = players;
		this.busState = State.TAKE;
		
	}

	public busFlipResult flipNextCard() {
		
		Card card = deck.drawCard();
		
		
	}


}
