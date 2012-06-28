package playable;

import poker.Playable;
import poker.Player;
import poker.RoundState;

/**
 * 
 * @author ajc
 * 
 */
public abstract class Hand implements Playable {

	/**
	 * All hands have a value consisting of a string with 3 characters. First
	 * character is hand type i.e. straight, etc Second is value, third is also
	 * value if hand is 2 card type (i.e. 2 pair, full house)
	 * 
	 * @param Playable
	 *            o
	 * @return 1 if greater, 0 if equal, -1 if less than
	 */
	public int compareTo(Playable o) {
		return (this.getValue().compareTo(o.getValue()));
	}

	public String toString() {
		// todo
		return null;
	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBS() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLegal(RoundState state) {
		if (getValue().compareTo(((Hand) state.getPreviousPlay()).getValue()) == 1)
			return true;
		return false;
	}

	@Override
	public boolean isInPlay(RoundState state) {
		// TODO Auto-generated method stub
		return false;
	}

}
