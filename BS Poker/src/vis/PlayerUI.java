package vis;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

import poker.Playable;
import poker.Player;
import poker.RoundState;

/**
 * 
 * PlayerUI provides a view for the Player, as well as controls for it.
 * {@link Player}
 * 
 * @author ajc
 * 
 */
public class PlayerUI extends JComponent {

	private final Player player;

	public PlayerUI(Player player) {
		this.player = player;
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		g.setColor(Color.WHITE);
		g.drawString(player.getName(), 20, 20);

	}

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

	// public static void

}
