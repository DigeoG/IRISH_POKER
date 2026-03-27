package test;
import game.Deck;
import game.Player;
import game.Card;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void addingCardTest() {
		
		Deck deck = new Deck();
		Player player = new Player();
		
		Card card = deck.drawCard();
		player.addCard(card);
		
		assertEquals(1,player.getHandSize());
		
			
	}
	@Test 
	void removingCardTest() {
		
		Deck deck = new Deck();
		Player player = new Player();
		Card card = deck.drawCard();
		
		player.addCard(card);
		//assertEquals(1,player.getHandSize());
		player.removeCard(card);
		
		assertEquals(0,player.getHandSize());
		assertFalse(player.getHand().contains(card));
	}
	@Test
	void checkingIfHasCard() {
		
		Deck deck = new Deck();
		Player player = new Player();
		
		Card card = deck.drawCard();
		player.addCard(card);;
		
		assertTrue(player.getHand().contains(card));
		
	}
	@Test
	void playerCanHoldManyCards() {
		
		Deck deck = new Deck();
		Player player = new Player();
		
		player.addCard(deck.drawCard());
		player.addCard(deck.drawCard());
		player.addCard(deck.drawCard());
		
		assertEquals(3, player.getHandSize());
	}
	@Test
	void removesOnlyOneCorrectCard() {
		
		Deck deck = new Deck(); 
		Player player = new Player();
		
		Card card1 = deck.drawCard();
		Card card2 = deck.drawCard();
		
		player.addCard(card2);
		player.addCard(card1);
		player.removeCard(card1);
		
		assertEquals(1, player.getHandSize());
		assertTrue(player.getHand().contains(card2));
		
			
	}
}
