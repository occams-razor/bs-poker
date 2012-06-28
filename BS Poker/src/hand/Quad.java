package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Player;
import poker.RoundState;

public class Quad extends Hand {

	private final String handValue;
	private final int rank;
	private final Player owner;

	public Quad(Player owner, int rank) {
		this.owner = owner;
		this.rank = rank;
		this.handValue = "h" + ('a' + rank) + '#';
	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBS() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInPlay(RoundState state) {
		List<Card> cards = state.getCards();
		for (Card c : cards) {
			if (c.getRank() != rank)
				cards.remove(c);
		}
		if (cards.size() == 4)
			return true;
		return false;
	}

	@Override
	public String getValue() {
		return handValue;
	}

}
