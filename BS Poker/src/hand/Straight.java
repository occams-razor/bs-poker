package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Player;
import poker.RoundState;

public class Straight extends Hand {

	private final String handValue;
	private final int rank;
	private final Player owner;

	public Straight(Player owner, int rank) {
		this.owner = owner;
		this.rank = rank;
		this.handValue = "e" +(char) ('a' + rank) + '#'; //Need to decide value for flush/straight
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
	public boolean isInPlay(RoundState state) { //doesn't work as originally written; "check for Comodification".  Do we need to remove any cards?
		List<Card> cards = state.getCards();
		for (Card c : cards) {
			if (c.getRank() > rank)
				cards.remove(c);
			if (c.getRank() < rank - 4)
				cards.remove(c);
		}
		int a = 0, b = 0, c = 0, d = 0, e = 0;

		for (Card p : cards) {
			if (p.getRank() == rank)
				a = 1;
			if (p.getRank() == rank - 1)
				b = 1;
			if (p.getRank() == rank - 2)
				c = 1;
			if (p.getRank() == rank - 3)
				d = 1;
			if (p.getRank() == rank - 4)
				e = 1;
		}

		if (a + b + c + d + e == 5)
			return true;
		return false;
	}

	@Override
	public String getValue() {
		return handValue;
	}
}
