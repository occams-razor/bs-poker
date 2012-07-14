package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Player;
import poker.RoundState;

public class StraightFlush extends Hand {

	private final String handValue;
	private final int rank;
	private final Player owner;
	private final char suit;

	public StraightFlush(Player owner, int rank, char suit) {
		this.suit = suit;
		this.owner = owner;
		this.rank = rank;
		this.handValue = "i" +(char) ('a' + rank) + '#';
	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return owner;
	}

	@Override
	public boolean isBS() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isInPlay(RoundState state) {
		// TODO Auto-generated method stub
		List<Card> cards = state.getCards();
		int a = 0, b = 0, c = 0, d = 0, e = 0;

		for (Card p : cards) {
			if (p.getRank() == rank && p.getSuit() == suit)
				a = 1;
			if (p.getRank() == rank - 1 && p.getSuit() == suit)
				b = 1;
			if (p.getRank() == rank - 2 && p.getSuit() == suit)
				c = 1;
			if (p.getRank() == rank - 3 && p.getSuit() == suit)
				d = 1;
			if (p.getRank() == rank - 4 && p.getSuit() == suit)
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
