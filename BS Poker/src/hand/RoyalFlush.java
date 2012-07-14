package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Player;
import poker.RoundState;

public class RoyalFlush extends Hand {

	private final String handValue;
	private final char suit;
	private final int rank;
	private final Player owner;

	// rank takes in a suit here, 0 = diamonds, 1 = clubs, 2 = hearts, 3 =
	// spades
	public RoyalFlush(Player owner, char suit) {
		this.owner = owner;
		this.suit = suit;
		switch (suit) {
		case ('d'):
			this.rank = 0;
			break;
		case ('c'):
			this.rank = 1;
			break;
		case ('h'):
			this.rank = 2;
			break;
		case ('s'):
			this.rank = 3;
			break;
		default:
			this.rank = -10;
			break;
		}
		this.handValue = "j" + (char)('a' + this.rank) + '#';
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

	@Override
	public boolean isInPlay(RoundState state) {
		List<Card> cards = state.getCards();
		int a = 0, b = 0, c = 0, d = 0, e = 0;

		for (Card p : cards) {
			if (p.getRank() == 10 && p.getSuit() == suit)
				a = 1;
			if (p.getRank() == 11 && p.getSuit() == suit)
				b = 1;
			if (p.getRank() == 12 && p.getSuit() == suit)
				c = 1;
			if (p.getRank() == 13 && p.getSuit() == suit)
				d = 1;
			if (p.getRank() == 14 && p.getSuit() == suit)
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
