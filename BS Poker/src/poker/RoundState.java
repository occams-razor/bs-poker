package poker;

import java.util.List;

/**
 * A roundstate defines the status of the round
 * 
 * @author ajc
 * 
 */
public class RoundState {

	private Playable previous = null; // TODO is null OK
	private int currentTurnCount = 0;

	/**
	 * 
	 * @return
	 */
	public Playable getPreviousPlay() {
		return previous;
	}

	/**
	 * Updates the Round state
	 * 
	 * @param newPlay
	 */
	public void commitNewPlay(Playable newPlay) {
		this.previous = newPlay;
		currentTurnCount++;
	}

	/**
	 * 
	 * @return number of plays that have occurred
	 */
	public int getCurrentTurnCount() {
		// TODO properly document what values this should have during a round
		return currentTurnCount;
	}

	public void addCards(List<Card> toDeal) {
		// TODO Auto-generated method stub

	}

}
