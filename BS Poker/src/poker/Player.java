package poker;

import java.util.List;

import vis.PlayerUI;

public class Player {
	private String name;
	private int numCards = 1;
	private boolean isAlive;
	// boolean isActive;
	Hand myHand;

	PlayerUI ui;

	public void deal(List<Card> cards) {
		// TODO
	}

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

		Playable p = ui.getPlay(RoundState);
		// checks if is legal move
		if (p.isLegal(state)) {
			// ui.notifyBadPlay();
		}
		// if is not legal:
		// ui.
		return null;
		// TODO Auto-generated method stub

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
