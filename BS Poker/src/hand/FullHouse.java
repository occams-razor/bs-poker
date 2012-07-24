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
		this.handValue = "g" + (char)('a' + rank1) + (char)('a' + rank2);
	}

	@Override
	public Player getOwner() {
		return owner;
	}

	@Override
	public boolean isBS() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInPlay(RoundState state) { //did we need to remove cards?  problems with comodification
		// TODO Auto-generated method stub
		int a = 0; //need three of rank1
		int b=0;  //need 2 of rank 2
		List<Card> cards = state.getCards();
		for (Card c : cards) {
			if (c.getRank() == rank1)
				a++; //counts number of occurences of rank1
			if (c.getRank()== rank2)
				b++; //counts number of occurences of rank2
		}
		if(a>=3&&b>=2)
			return true;
		return false;
	}

	@Override
	public String getValue() {
		return handValue;
	}

}
