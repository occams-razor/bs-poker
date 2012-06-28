import hand.Pair;
import junit.framework.Assert;

import org.junit.Test;

import poker.Player;

public class PairHand {

	@Test
	public void testGetOwner() {
		Player player = new Player();
		Pair pair = new Pair(player, 2);
		Assert.assertTrue("These should be same", pair.getOwner()
				.equals(player));
	}

	@Test
	public void testIsBS() {
		Player player = new Player();
		// Pair pair = new Pair(player, 2);
		// fail("Not yet implemented");
	}

	@Test
	public void testIsInPlay() {
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
