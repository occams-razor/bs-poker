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
		this.handValue = "e" +(char) ('a' + rank) + '#';
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
		// TODO Auto-generated method stub
		List<Card> cards = state.getCards();
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
