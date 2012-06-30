package vis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

import poker.Card;
import poker.Playable;
import poker.Player;
import poker.RoundState;

public class PlayerStats extends JComponent {

	public static final int CARD_WIDTH = 100;
	public static final int CARD_HEIGHT = 175;

	public static final int CARD_XSPACE = 20;

	private final Player player;

	public PlayerStats(Player player) {
		this.player = player;
		setPreferredSize(new Dimension(800, 300));
		// setBounds(0, 0, 500, 500);

	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		// name
		g.setColor(Color.WHITE);
		g.drawString(player.getName(), 20, 20);

		g.drawString("Alive?: " + (player.isAlive() ? "Alive" : "Dead"), 20, 40);

		if (player.hasCards()) {
			int x = 0;
			for (Card c : player.getCards()) {
				drawCard(g, x += CARD_WIDTH + CARD_XSPACE, 50, c);
			}
		}

	}

	private static void drawCard(Graphics g, int x, int y, Card c) {
		g.setColor(Color.RED);
		g.drawRect(x, y, CARD_WIDTH, CARD_HEIGHT);

		g.drawString(c.getSuitName(), x + 20, y + 50);
		g.drawString("" + c.getRank(), x + CARD_WIDTH / 2, y + 30);
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
