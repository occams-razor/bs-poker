import static org.junit.Assert.*;
import hand.StraightFlush;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import poker.Card;
import poker.Player;
import poker.RoundState;


public class StraightFlushTest {

	@Test
	public void testGetOwner() {
		Player player = new Player("Samanthero");
		StraightFlush straightFlush = new StraightFlush(player, 6, 'h');
		Assert.assertTrue("These should be same", straightFlush.getOwner()
				.equals(player));
	}

	@Test
	public void testIsBS() {
		Player player = new Player("Jerry");
		StraightFlush straightFlush = new StraightFlush(player, 8, 'h');
		Assert.assertTrue("Hand is not BS", straightFlush.isBS() == false);
	}

	@Test
	public void testIsInPlay() {
		Player player = new Player("Fred");
		StraightFlush straightFlush = new StraightFlush(player, 7, 'c');
		RoundState st = new RoundState();
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(3, 'd'));
		cards.add(new Card(12, 'h'));
		cards.add(new Card(10, 'c'));
		cards.add(new Card(3, 'c'));
		cards.add(new Card(7, 'c'));
		cards.add(new Card(8, 'c'));
		cards.add(new Card(6, 'c'));
		cards.add(new Card(5, 'c'));
		cards.add(new Card(4, 'c'));
		st.addCards(cards);
		Assert.assertTrue("There is a three", straightFlush.isInPlay(st));

		// fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		Player player = new Player("Ian");
		StraightFlush straightFlush = new StraightFlush(player, 8, 'h');
		Assert.assertEquals("ii#", straightFlush.getValue());

	}

	@Test
	public void testCompareTo() {
		Player player1 = new Player("Andruw");
		Player player2 = new Player("Will");
		StraightFlush straightFlush1 = new StraightFlush(player1, 5, 'c');
		StraightFlush straightFlush2 = new StraightFlush(player2, 7, 'h');
		Assert
				.assertTrue("Will has a straightFlusher hand",
						straightFlush2.compareTo(straightFlush1) > 0);
	}

	@Test
	public void testToString() {  //not sure this works how we want it to//
		Player player=new Player("Steve");
		StraightFlush straightFlush=new StraightFlush(player, 13, 'd');
		System.out.println(straightFlush);
		Assert.assertEquals("Owner: Steve Hand Value: in#", straightFlush.toString());
		
	}

	@Test
	public void testIsLegal() {
		Player player1=new Player("Alan");
		Player player2=new Player("Sarah");
		RoundState st=new RoundState();
		StraightFlush straightFlush1=new StraightFlush(player1, 6, 'h');
		StraightFlush straightFlush2=new StraightFlush(player2, 7, 's');
		st.commitNewPlay(straightFlush1);
		Assert.assertTrue(straightFlush2.isLegal(st));
	}
}
