package poker;

import java.util.LinkedList;
import java.util.List;

/**
 * A deck is a collection of 52 poker cards
 * 
 * @author ajc
 * 
 */
public class Deck {
	
	private List<Card> cards = new LinkedList<Card>();

	public Deck() {
		// initialize cards
		for (int suitValue = 0; suitValue < 4; suitValue++) {
			char suit = toChar(suitValue);
			for (int rank = Card.TWO_RANK; rank <= Card.ACE_RANK; rank++) {
				cards.add(new Card(rank, suit));
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
	 * For a random position in cards list, takes out that card and adds it to the beginning of a temp list.
	 * Then copies the temp list into cards list
	 */
	public void shuffle() {
		List<Card> tempCards = new LinkedList<Card>();
		for (int i = 52; i>0; i--){
			int position = (int) (Math.random() * i);
			tempCards.add(52-i, cards.remove(position));
		}
		cards.addAll(tempCards);
	}

	/**
	 * Picks up cards from the top of the deck.
	 * @param numCards
	 * @return numCards cards from the deck
	 */
	public List<Card> getCards(int numCards) {
		List<Card> tempCards = new LinkedList<Card>();
		for (int i = 0; i < numCards; i ++){
		tempCards.add(cards.remove(51 - i));
		}
		return tempCards; // TODO
	}
	public String toString()
	{
		String deck="";
		for(Card c: cards)
		{
			deck+=c + " ";
		}
		return deck;
	}

}
