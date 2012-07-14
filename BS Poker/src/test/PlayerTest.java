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

		// PlayerUI playerUI = new PlayerUI(player);
		// playerUI.setOpaque(true);

		JFrame frame = new PlayerUI(player);
	}
}
