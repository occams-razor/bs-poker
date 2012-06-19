package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Playable;
import poker.Player;
import poker.RoundState;

public class Pair extends Hand {
	
	private final String handValue;
	private final int rank;
	private final Player owner;
	
	public Pair(Player owner, int rank) {
		this.owner = owner;
		this.rank = rank;
		this.handValue = "b" + ('a' + rank) + '#';
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
		List<Card> cards = state.getCards();
		for (Card c : cards) {
			if(c.getRank()!=rank)
				cards.remove(c);
		}
		if (cards.size()>=2)
			return true;
		return false;
	}



}
