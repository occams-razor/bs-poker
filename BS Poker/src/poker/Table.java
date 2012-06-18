package poker;

import java.util.LinkedList;
import java.util.List;

/**
 * A table is a limited collection of cards
 * 
 * @author ajc
 * 
 */
public class Table {

	private List<Card> cards = new LinkedList<Card>();

	public Table() {

	}

	// public void clear() {
	//
	// }

	/**
	 * Adds provided cards to the table
	 * 
	 * @param toDeal
	 */
	public void add(List<Card> toDeal) {
		cards.addAll(toDeal);
	}

	/**
	 * 
	 * @return the list of all cards on table
	 */
	public List<Card> getCards() {
		return cards;
	}

}
