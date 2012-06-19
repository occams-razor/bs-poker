package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Playable;
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
		this.handValue = "i" + ('a' + rank) + '#';
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

	public boolean isInPlay(RoundState state) {
		// TODO Auto-generated method stub
		List<Card> cards = state.getCards();
		for (Card c : cards) {
			if(c.getSuit()!=suit)
				cards.remove(c);
		}
		for (Card c : cards) {
			if(c.getRank()>rank)
				cards.remove(c);
		}
		for (Card c : cards) {
			if(c.getRank()<rank-4)
				cards.remove(c);
		}
		if (cards.size()==5)
			return true;
		return false;
	}



}
