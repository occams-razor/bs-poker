import static org.junit.Assert.*;
import hand.Triple;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import poker.Card;
import poker.Player;
import poker.RoundState;


public class TripleHandTest {

	@Test
	public void testGetOwner() {
		Player player = new Player("Samanthero");
		Triple triple = new Triple(player, 2);
		Assert.assertTrue("These should be same", triple.getOwner()
				.equals(player));
		// Assert.assertTrue("These should be same", false);
	}

	@Test
	public void testIsBS() {
		Player player = new Player("Jerry");
		Triple triple = new Triple(player, 2);
		Assert.assertTrue("Triple is not BS", triple.isBS() == false);
	}

	@Test
	public void testIsInPlay() {
		RoundState st = new RoundState();
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(2, 'd'));
		cards.add(new Card(2, 'h'));
		st.addCards(cards);
		Player player = new Player("Joel");
		Triple triple = new Triple(player, 2);
		Assert.assertTrue("There is a triple of twos", triple.isInPlay(st));
	}

	@Test
	public void testGetValue() {
		Player player = new Player("Ian");
		Triple triple = new Triple(player, 4);
		System.out.println(triple.getValue());
		Assert.assertEquals("de#", triple.getValue());
	}

	@Test
	public void testCompareTo() {
		Player player1 = new Player("Andruw");
		Player player2 = new Player("Will");
		Triple triple1 = new Triple(player1, 5);
		Triple triple2 = new Triple(player2, 5);
		Assert
				.assertTrue("Will has a higher hand",
						triple2.compareTo(triple1) == 0);
	}

	@Test
	public void testToString() {
		// fail("Not yet implemented");
	}

	@Test
	public void testIsLegal() {
		Player player1=new Player("Alan");
		Player player2=new Player("Sarah");
		RoundState st=new RoundState();
		Triple triple1=new Triple(player1, 4);
		Triple triple2=new Triple(player2, 5);
		st.commitNewPlay(triple1);
		Assert.assertTrue(triple2.isLegal(st));
	}

}