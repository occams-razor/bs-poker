package hand;

import java.util.List;

import playable.Hand;
import poker.Card;
import poker.Player;
import poker.RoundState;

/**
 * A high is characterized by a given rank
 * 
 * @author ajc
 * 
 */
public class High extends Hand {
	private final String handValue;
	private final int rank;
	private final Player owner;

	/**
	 * 
	 * @param rank
	 *            the rank we want to find
	 */
	public High(Player owner, int rank) {
		this.owner = owner;
		this.rank = rank;
		this.handValue = "a" + (char)('a' + rank) + '#';
	}

	@Override
	public Player getOwner() {
		return owner; //need something to return the owner's name, not the player object
	}

	@Override
	public boolean isBS() {
		return false;
	}

	@Override
	public boolean isInPlay(RoundState state) {
		// a High is in play if the table has a card of our rank.
		List<Card> cards = state.getCards();
		for (Card c : cards) {
			if (c.getRank() == rank) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String getValue() {
		return handValue;
	}

}
