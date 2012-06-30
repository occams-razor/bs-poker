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
		Player player = new Player("Naor");
		Pair pair = new Pair(player, 2);
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(2, 'h'));
		st.addCards(cards);
		Assert.assertTrue("Pair is in play",pair.isInPlay(st));
	}

	@Test
	public void testPair() {
		// fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		Player player = new Player("IDon't want to");
		
		Pair threes  =new Pair(player, 3);
		Assert.assertTrue("These should be the same", "bd#".equals(threes.getValue()));
	}

	@Test
	public void testCompareTo() {
	Player player1 = new Player("p1");
	Player p2 = new Player("p2");
	Pair threes = new Pair(player1, 3);
	Pair fours = new Pair(p2,4);
	Assert.assertTrue("threes are less than fours",threes.compareTo(fours)<0);
	}

	@Test
	public void testToString() {
		Pair threes = new Pair (new Player("py"), 3);
		//System.out.println(threes);
		Assert.assertTrue("should output owner and hand value", "Owner: py 1 Hand Value: bd#".equals(threes.toString()));
	}

	@Test
	public void testIsLegal() {
		// fail("Not yet implemented");
	}

}
