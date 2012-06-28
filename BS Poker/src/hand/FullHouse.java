package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Player;
import poker.RoundState;

public class FullHouse extends Hand {

	private final String handValue;
	private final Player owner;
	private final int rank1;
	private final int rank2;

	public FullHouse(Player owner, int rank1, int rank2) {
		this.owner = owner;
		this.rank1 = rank1;
		this.rank2 = rank2;
		this.handValue = "g" + ('a' + rank1) + ('a' + rank2);
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
		// TODO Auto-generated method stub
		int a = 0;
		List<Card> cards = state.getCards();
		for (Card c : cards) {
			if (c.getRank() != rank1)
				cards.remove(c);
		}
		if (cards.size() >= 3)
			a++;

		cards = state.getCards();
		for (Card c : cards) {
			if (c.getRank() != rank2)
				cards.remove(c);
		}
		if (cards.size() >= 2)
			a++;

		if (a == 2)
			return true;
		return false;
	}

	@Override
	public String getValue() {
		return handValue;
	}

}
