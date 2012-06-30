import hand.High;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import poker.Card;
import poker.Player;
import poker.RoundState;

public class HighHandTest {

	@Test
	public void testGetOwner() {
		Player player = new Player("Samanthero");
		High high = new High(player, 2);
		Assert.assertTrue("These should be same", high.getOwner()
				.equals(player));
	}

	@Test
	public void testIsBS() {
		Player player = new Player("Jerry");
		High high = new High(player, 2);
		Assert.assertTrue("Hand is not BS", high.isBS() == false);
	}

	@Test
	public void testIsInPlay() {
		Player player = new Player("Fred");
		High high = new High(player, 3);
		RoundState st = new RoundState();
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(3, 'd'));
		cards.add(new Card(12, 'h'));
		st.addCards(cards);
		Assert.assertTrue("There is a three", high.isInPlay(st));

		// fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		Player player = new Player("Ian");
		High high = new High(player, 4);
		Assert.assertEquals("ae#", high.getValue());

	}

	@Test
	public void testCompareTo() {
		Player player1 = new Player("Andruw");
		Player player2 = new Player("Will");
		High high1 = new High(player1, 5);
		High high2 = new High(player2, 5);
		Assert
				.assertTrue("Will has a higher hand",
						high2.compareTo(high1) == 0);
	}

	@Test
	public void testToString() {
		// fail("Not yet implemented");
	}

	@Test
	public void testIsLegal() {
		// fail("Not yet implemented");
	}

}
