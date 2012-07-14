package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Player;
import poker.RoundState;

public class Pair extends Hand {

	private final String handValue;
	private final int rank;
	private final Player owner;

	public Pair(Player owner, int rank) {
		this.owner = owner;
		this.rank = rank;
		this.handValue = "b" +(char)('a' + rank) + '#';
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
	public boolean isInPlay(RoundState state) {
		List<Card> cards = state.getCards();
		int num = 0;
		for (Card c : cards) {
			if (c.getRank() == rank)
				num++;
		}
		
		if (num >= 2)
			return true;
		return false;
	}

	@Override
	public String getValue() {
		return handValue;
	}

}
