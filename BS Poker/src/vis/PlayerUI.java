package vis;

import poker.Playable;
import poker.RoundState;

public interface PlayerUI {

	Playable getPlay(RoundState state);

}
