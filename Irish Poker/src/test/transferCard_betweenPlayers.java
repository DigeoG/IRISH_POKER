package test;
import game.busPhase; 
import game.Deck;
import game.Player;
import game.Card;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class transferCard_betweenPlayers {

	@Test
	void cardGoesToAnotherPlayer() {
		
		Deck deck = new Deck();
		Player giver = new Player();
		Player receiver = new Player();
		
		Card card = deck.drawCard();
		giver.addCard(card);
		
		busPhase Busphase = new busPhase( deck, List.of(giver, receiver), true);
		
		Busphase.transferCard(giver, receiver, card);
		
		assertEquals(0, giver.getHandSize());
		assertEquals(1, receiver.getHandSize());
		
		assertFalse(giver.getHand().contains(card));
		assertTrue(receiver.getHand().contains(card));
	}

}
