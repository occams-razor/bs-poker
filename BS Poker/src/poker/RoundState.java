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

	private Table table = new Table();

	public RoundState() {
		// table = new
	}

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

	/**
	 * Adds the provided cards to the table
	 * 
	 * @param toDeal
	 */
	public void addCards(List<Card> toDeal) {
		table.add(toDeal);

	}

	/**
	 * 
	 * @return all the cards on the table
	 */
	public List<Card> getCards() {
		return table.getCards();
	}

}
