import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import poker.Card;
import poker.Deck;


public class DeckTest {

	@Test
	public void testShuffle() {
		//
	}

	@Test
	public void testGetCards() {
		Deck deck=new Deck();
		System.out.println(deck.getCards(1));
		Assert.assertEquals("14 Spades", deck.getCards(1));
		
	}

}
