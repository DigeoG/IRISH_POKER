import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
public class busPhase {

private Deck deck;
private List<Player> players;
private State busState;
private boolean active;
	
public busPhase (Deck deck, List<Player> players, boolean active) {
		this.deck = deck;
		this.players = players;
		this.busState = State.TAKE;
		this.active = true;
		
	}

	public busFlipResult flipNextCard() {
		if(!active) {
			throw new IllegalArgumentException("Not in the busphase, deciding who rides the bus is no longer active");
		}
		Card flippedCard = deck.drawCard();
		List<busEffect> effects = new ArrayList<>();
		int drinks = 2;
		for(Player player : players) {
			
			for(Card card : player.getHand()) {
				
				if(flippedCard.getRank() == card.getRank()) {
					if(busState == State.TAKE) {
						busEffect effect  = new TakeDrinkEffect(player,busState, drinks);
						effects.add(effect);
					
					} else if(busState == State.GIVE) {
						busEffect effect = new GiveCardEffect(player, busState, card);
						effects.add(effect);
				
					}
					
					
				}
				
			}
		}
		while(effects.isEmpty() && !deck.isEmpty()) {
			flippedCard = deck.drawCard(); 
		}
		
		if(busState == State.TAKE) {
			busState = State.GIVE;
		}
		else {
			busState = State.TAKE;
		}
						
		return new busFlipResult(flippedCard, busState, effects);
	}
	/////////
	public void transferCard(Player from, Player to, Card card) {
		if(from == null|| to == null || card == null) {
			throw new IllegalArgumentException("Transfer parameters cannot be null");
		}
		if(!from.getHand().contains(card)) {
			throw new IllegalArgumentException("The selected player does not own this card");
		}
		
		from.removeCard(card);
		to.addCard(card);
	}
	//////
	public void endPhase() {
		active = false;
	}
	//////
	public Player determineBusRider() {
		if(players == null || players.isEmpty()) {
			throw new IllegalStateException("No players exist in the game");
		}
		int maxSize = 0;
		List<Player> tiedPlayers = new ArrayList<>();
		
		for(Player player : players) {
			if(player.getHand().size() > maxSize) {
				maxSize = player.getHand().size();
		
			}
			
		}
		for(Player player : players) {
			
			if(player.getHand().size() == maxSize) {
				tiedPlayers.add(player);
			}
		
		} if(tiedPlayers.size() == 1) {
			 return tiedPlayers.get(0); 
		} else {
			int randomIndex = ThreadLocalRandom.current().nextInt(tiedPlayers.size());
				return tiedPlayers.get(randomIndex); 
		}
	}
}	




