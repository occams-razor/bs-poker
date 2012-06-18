package poker;

import java.util.List;

/**
 * A deck is a collection of 52 poker cards
 * 
 * @author ajc
 * 
 */
public class Deck {

	private Card[] cards = new Card[52];

	public Deck() {
		// initialize cards
		int i = 0;
		for (int suitValue = 0; suitValue < 4; suitValue++) {
			char suit = toChar(suitValue);
			for (int rank = Card.TWO_RANK; rank <= Card.ACE_RANK; rank++) {
				cards[i++] = new Card(rank, suit);
			}
		}

	}

	/**
	 * ﻿ * A method to iterate though suits. ﻿ * ﻿ * @param value ﻿ * the int to
	 * convert to suit, or <code>char</code> ﻿ * @return the suit appropriate to
	 * ambiguously defined values ﻿
	 */
	private static char toChar(int value) {
		switch (value) {
		case 0:
			return 'c';
		case 1:
			return 'h';
		case 2:
			return 'd';
		case 3:
			return 's';
		default:
			return 'z';
		}
	}

	/**
	 * Randomizes the order of the cards
	 */
	public void shuffle() {
		// TODO
	}

	/**
	 * Picks up cards from the top of the deck.
	 * 
	 * @param numCards
	 * @return
	 */
	public List<Card> getCards(int numCards) {
		return null; // TODO
	}

}
