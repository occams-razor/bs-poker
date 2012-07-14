import static org.junit.Assert.*;
import hand.Quad;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import poker.Card;
import poker.Player;
import poker.RoundState;


public class QuadTest {

	@Test
	public void testGetOwner() {
		Player player = new Player("Samanthero");
		Quad quad = new Quad(player, 2);
		Assert.assertTrue("These should be same", quad.getOwner()
				.equals(player));
		// Assert.assertTrue("These should be same", false);
	}

	@Test
	public void testIsBS() {
		Player player = new Player("Jerry");
		Quad quad = new Quad(player, 2);
		Assert.assertTrue("Quad is not BS", quad.isBS() == false);
	}

	@Test
	public void testIsInPlay() {
		RoundState st = new RoundState();
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(2, 'd'));
		cards.add(new Card(5, 'h'));
		cards.add(new Card(2, 'h'));
		cards.add(new Card(2, 'c'));
		st.addCards(cards);
		Player player = new Player("Joel");
		Quad quad = new Quad(player, 2);
		Assert.assertTrue("There is a quad of twos", quad.isInPlay(st));
	}

	@Test
	public void testGetValue() {
		Player player = new Player("Ian");
		Quad quad = new Quad(player, 4);
		Assert.assertEquals("he#", quad.getValue());
	}

	@Test
	public void testCompareTo() {
		Player player1 = new Player("Andruw");
		Player player2 = new Player("Will");
		Quad quad1 = new Quad(player1, 5);
		Quad quad2 = new Quad(player2, 5);
		Assert
				.assertTrue("Will has a higher hand",
						quad2.compareTo(quad1) == 0);
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
		Quad quad1=new Quad(player1, 4);
		Quad quad2=new Quad(player2, 5);
		st.commitNewPlay(quad1);
		Assert.assertTrue(quad2.isLegal(st));
	}


}
