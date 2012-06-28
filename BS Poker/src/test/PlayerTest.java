package test;

import javax.swing.JFrame;

import poker.Player;
import vis.PlayerUI;

public class PlayerTest {

	public static void main(String[] args) {
		System.out.println("Drawing player...");
		Player player = new Player("Andrew");

		PlayerUI playerUI = new PlayerUI(player);

		JFrame frame = new JFrame("Player test");
		frame.getContentPane().add(playerUI);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
