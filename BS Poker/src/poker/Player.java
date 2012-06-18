package poker;

import java.util.List;

import vis.PlayerUI;

public class Player {
	String name;
	int numCards;
	private boolean isAlive;
	// boolean isActive;
	Hand myHand;

	PlayerUI ui;

	public void deal(List<Card> cards) {

	}

	public int getNumCards() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 
	 */
	public Playable getPlay(RoundState state) {

		Playable p = ui.getPlay();
		// checks if is legal mouve
		if (p.isLegal(state)) {
			ui.notifyBadPlay();
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
