package playable;

import poker.Playable;
import poker.Player;
import poker.RoundState;

public class BS implements Playable {

	@Override
	public int compareTo(Playable o) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean isBS() {
		return true;
	}

	@Override
	public boolean isLegal(RoundState state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInPlay(RoundState state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

}
