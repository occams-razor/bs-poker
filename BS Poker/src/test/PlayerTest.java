package test;

import java.util.LinkedList;

import javax.swing.JFrame;

import poker.Card;
import poker.Player;
import vis.PlayerUI;

public class PlayerTest {

	public static void main(String[] args) {
		System.out.println("Drawing player...");
		Player player = new Player("Andrew");

		LinkedList<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(3, 's'));
		cards.add(new Card(4, 's'));
		cards.add(new Card(5, 's'));
		cards.add(new Card(6, 's'));

		player.deal(cards);

		PlayerUI playerUI = new PlayerUI(player);

		JFrame frame = new JFrame("Player test");
		frame.getContentPane().add(playerUI);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
