package poker;

/**
 * A card hard a denomination and suit.
 * 
 * Denominations are 2-10, Jack-Ace (11-14)
 * 
 * Suits are Spades, Clubs, Diamonds, Hearts
 * 
 * @author ajc
 * 
 */
public class Card {

	// public static final int NUM_RANKS = 13;
	public static final int ACE_RANK = 14;
	public static final int TWO_RANK = 2;

	private final int rank;
	private final char suit;

	/**
	 * 
	 * @param rank
	 * @param suit
	 */
	public Card(int rank, char suit) {
		this.rank = rank;
		this.suit = suit;
	}

	/**
	 * 
	 * @return
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * 
	 * @return
	 */
	public char getSuit() {
		return suit;
	}

	public String getSuitName() {
		switch (suit) {
		case 's':
			return "Spades";
		case 'c':
			return "Clubs";
		case 'd':
			return "Diamonds";
		case 'h':
			return "Hearts";
		}
		return "Unknown";
	}
}
