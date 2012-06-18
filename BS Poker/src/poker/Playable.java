package poker;

/**
 * A playable is another word for a move, a potential hand/BS call.
 * 
 * @author ajc
 * 
 */
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
	 * 1. The first move may not be BS
	 * 
	 * 2. the current play must have a greater value than the previous
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
