package vis;

import poker.Playable;
import poker.Player;
import poker.RoundState;

/**
 * 
 * 
 * {@link Player}
 * 
 * @author ajc
 * 
 */
public class PlayerUI {

	/**
	 * Called by a Player
	 * 
	 * @param state
	 * 
	 * 
	 * @return guaranteed game legal play
	 */
	public Playable getPlay(RoundState state) {
		return null; // TODO

	}

	/**
	 * Called by a Player to notify that the recently returned value of
	 * {@link #getPlay()} is not legal
	 */
	public void notifyBadPlay() {

	}

}
