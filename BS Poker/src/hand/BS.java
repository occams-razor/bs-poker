package hand;

import playable.Hand;
import poker.Playable;
import poker.Player;
import poker.RoundState;

public class BS extends Hand {
	
	private final Player owner;
	private final String handValue;
	
	public BS(Player owner){
		this.owner = owner;
		handValue = "zzz";
		
	}
	
	@Override
	public int compareTo(Playable o) {
		return 1;
	}

	@Override
	public boolean isBS() {
		return true;
	}

	@Override
	public boolean isLegal(RoundState state) {
		// TODO Auto-generated method stub
		if (state.getCurrentTurnCount() > 0)
			return true;
		return false;
	}

	@Override
	//doesn't matter, shouldn't ever happen
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
