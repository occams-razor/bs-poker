package poker;

public interface Playable extends Comparable<Playable> {

	// idea: make this an abstract class, give each play an owner (Player)

	/**
	 * @return Player who made play
	 */
	public Player getOwner();

	/**
	 * 
	 * @return
	 */
	public boolean isBS();

	// a fair move to make(greater move than prevoius, not first move BS)
	// TODO compare the plays, throw an exception somewhere
	// TODO first play can't be BS
	/**
	 * Checks if this play is a fair move (not necessarily on the table)
	 * 
	 * @param state
	 * @return
	 */
	public boolean isLegal(RoundState state);

	/**
	 * Checks if play is on the table
	 * 
	 * @param state
	 * @return
	 */
	public boolean isInPlay(RoundState state);

}
