package poker;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author ajc
 * 
 */
public class Game {

	List<Player> players;
	Deck deck;

	public Game() {
		players = new LinkedList<Player>();
		deck = new Deck();
	}

	public void mainLoop() {

		while (isRunning()) {
			// deal
			deck.shuffle();
			RoundState state = new RoundState();
			// table.clear();
			for (Player p : players) {
				List<Card> toDeal = deck.getCards(p.getNumCards());
				state.addCards(toDeal); // updates table
				p.deal(toDeal); // updates players
			}

			// play loop
			round: while (true) {
				for (Player p : players) {

					// nextplay guaranteed legal
					Playable nextPlay = p.getPlay(state);

					if (nextPlay.isBS()) {
						// verify
						if (state.getPreviousPlay().isInPlay(state)) {
							// previous player wins- round over
							nextPlay.getOwner().onLose();
							break round;
						} else {
							// bs player wins - round over
							state.getPreviousPlay().getOwner().onLose();
							break round;
						}

					} else {
						// not a bs
						// current hand updated
						// currentPlay = nextPlay;
						state.commitNewPlay(nextPlay);
					}
				}

			}

			// deal with losers:
			for (Player p : players) {
				if (!p.isAlive()) { // TODO magic number
					// TODO callback to player/ui
					// player loses, notify loss, remove from list
					players.remove(p);
				}
			}
		}

	}

	public boolean isRunning() {
		return true; // TODO
	}
}
