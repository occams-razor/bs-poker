package poker;

import java.util.List;

import playable.Hand;

import vis.PlayerUI;

public class Player {
	private String name;
	private int numCards = 1;
	private boolean isAlive;

	private Playable currentPlay;

	// boolean isActive;
	Hand myHand;

	PlayerUI ui;
	private List<Card> cards;

	/**
	 * Gives the player their cards
	 * 
	 * @param cards
	 */
	public void deal(List<Card> cards) {
		this.cards = cards;
		// assert (cards.size() == numCards);
	}

	/**
	 * Number of cards the player should receive (starts at 1, up to 5)
	 * 
	 * @return
	 */
	public int getNumCards() {
		return numCards;
	}

	/**
	 * Gets a new user inputted play, guaranteed to be game legal.
	 * {@link Playable#isLegal(RoundState)}
	 * 
	 * @param state
	 * @return
	 */
	public Playable getPlay(RoundState state) {
		return currentPlay = ui.getPlay(state);
	}

	/**
	 * 
	 * @return true if still alive
	 */
	public boolean onLose() {
		numCards++;
		isAlive = numCards <= 5;
		return isAlive();
	}

	public boolean isAlive() {
		return isAlive;
	}
}
