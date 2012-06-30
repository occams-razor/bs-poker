import hand.Pair;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import poker.Card;
import poker.Player;
import poker.RoundState;

public class PairHand {

	@Test
	public void testGetOwner() {
		Player player = new Player("Samanthero");
		Pair pair = new Pair(player, 2);
		Assert.assertTrue("These should be same", pair.getOwner()
				.equals(player));
		// Assert.assertTrue("These should be same", false);
	}

	@Test
	public void testIsBS() {
		Player player = new Player("Jerry");
		Pair pair = new Pair(player, 2);
		Assert.assertTrue("Pair is not BS", pair.isBS() == false);
	}

	@Test
	public void testIsInPlay() {
		RoundState st = new RoundState();
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(2, 'd'));
		st.addCards(cards);
		Player player = new Player("Joel");
		Pair pair = new Pair(player, 2);
		Assert.assertTrue("There is a pair of twos", pair.isInPlay(st));
		// fail("Not yet implemented");
	}

	@Test
	public void testPair() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		// fail("Not yet implemented");
	}

	@Test
	public void testCompareTo() {
		// fail("Not yet implemented");
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
