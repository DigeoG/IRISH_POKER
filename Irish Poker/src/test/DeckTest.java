package test;
import game.Deck;
import game.Card;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DeckTest {

	@Test
	void newDeck_shouldHave52Cards() {
		
		Deck deck = new Deck(); 
		assertEquals(52, deck.currentCount());
	}
	@Test
	void drawDeck_ShouldReduceSize() {
		
		Deck deck = new Deck(); 
		deck.drawCard(); 
		assertEquals(51, deck.currentCount());
	}
	@Test
	void shouldReturnCard() {
		
		Deck deck = new Deck(); 
		Card card = deck.drawCard();
		assertNotNull(card, "Object should not be null must return something");
	}
	@Test
	void shuffle_ShouldNotChangeCount() {
		
		Deck deck = new Deck(); 
		deck.shuffle();
		assertEquals(52, deck.currentCount()); 
	}
	@Test 
	void drawing_FromEmptyDeckThrowsException() {
		
		Deck deck = new Deck(); 
		
		while(!deck.isEmpty()){
			deck.drawCard();
		}
		assertThrows(IllegalStateException.class, deck::drawCard);
	}
	@Test
	void drawing_AllCardsShouldEmptyDeck() {
		Deck deck = new Deck(); 
		while(!deck.isEmpty()) {
			deck.drawCard();
		}
		assertTrue(deck.isEmpty(), "should be empty since we looped through drawing the whole deck");
	}
}
