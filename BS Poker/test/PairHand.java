import hand.Pair;
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
		Pair pair = new Pair(player, 6);
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
		cards.add(new Card(7, 's'));
		cards.add(new Card(7, 'd'));
		st.addCards(cards);
		Player player = new Player("Joel");
		Pair pair = new Pair(player, 7);
		Assert.assertTrue("There is a pair of twos", pair.isInPlay(st));
	}

	@Test
	public void testGetValue() {
		Player player = new Player("Ian");
		Pair pair = new Pair(player, 4);
		Assert.assertEquals("be#", pair.getValue());
	}

	@Test
	public void testCompareTo() {
		Player player1 = new Player("Andruw");
		Player player2 = new Player("Will");
		Pair pair1 = new Pair(player1, 5);
		Pair pair2 = new Pair(player2, 5);
		Assert
				.assertTrue("Will has a pairer hand",
						pair2.compareTo(pair1) == 0);
	}

	@Test
	public void testToString() {
		Player player=new Player("Steve");
		Pair pair=new Pair(player, 2);
		System.out.println(pair);
		Assert.assertEquals("Owner: Steve Hand Value: bc#", pair.toString());
	}

	@Test
	public void testIsLegal() {
		Player player1=new Player("Alan");
		Player player2=new Player("Sarah");
		RoundState st=new RoundState();
		Pair pair1=new Pair(player1, 4);
		Pair pair2=new Pair(player2, 5);
		st.commitNewPlay(pair1);
		Assert.assertTrue(pair2.isLegal(st));
	}

}
