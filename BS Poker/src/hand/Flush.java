package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Player;
import poker.RoundState;

public class Flush extends Hand {

	private final String handValue;
	private final int rank;
	private final Player owner;
	private final char suit;

	public Flush(Player owner, int rank, char suit) {
		this.suit = suit;
		this.owner = owner;
		this.rank = rank;
		this.handValue = "f" +(char) ('a' + rank) + '#';
	}

	@Override
	public Player getOwner() {
		return owner;
	}

	@Override
	public boolean isBS() {
		return false;
	}

	@Override
	public boolean isInPlay(RoundState state) { //consider not removing cards for isinplay; check for Comodification
		// TODO Auto-generated method stub
		List<Card> cards = state.getCards();
		int num = 0;
		for (Card c : cards) {
			if (c.getSuit() == suit)
				num++;
		}

		if (num >= 5)
			return true;
		return false;
	}

	@Override
	public String getValue() {
		return handValue;
	}

}
