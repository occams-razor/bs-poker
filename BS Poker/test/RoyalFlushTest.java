import static org.junit.Assert.*;
import hand.RoyalFlush;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import poker.Card;
import poker.Player;
import poker.RoundState;


public class RoyalFlushTest {

	@Test
	public void testGetOwner() {
		Player player = new Player("Samanthero");
		RoyalFlush royalflush = new RoyalFlush(player, 's');
		Assert.assertTrue("These should be same", royalflush.getOwner()
				.equals(player));
	}

	@Test
	public void testIsBS() {
		Player player = new Player("Jerry");
		RoyalFlush royalflush = new RoyalFlush(player, 'd');
		Assert.assertTrue("Hand is not BS", royalflush.isBS() == false);
	}

	@Test
	public void testIsInPlay() {
		Player player = new Player("Fred");
		RoyalFlush royalflush = new RoyalFlush(player, 'h');
		RoundState st = new RoundState();
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(3, 'd'));
		cards.add(new Card(12, 'h'));
		st.addCards(cards);
		Assert.assertTrue("There is a three", royalflush.isInPlay(st));

		// fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		Player player = new Player("Ian");
		RoyalFlush royalflush = new RoyalFlush(player, 's');
		Assert.assertEquals("ae#", royalflush.getValue());

	}

	@Test
	public void testCompareTo() {
		Player player1 = new Player("Andruw");
		Player player2 = new Player("Will");
		RoyalFlush royalflush1 = new RoyalFlush(player1, 'h');
		RoyalFlush royalflush2 = new RoyalFlush(player2, 'd');
		Assert
				.assertTrue("Will has a royalflusher hand",
						royalflush2.compareTo(royalflush1) == -1);
	}

	@Test
	public void testToString() {  //not sure this works how we want it to//
		Player player=new Player("Steve");
		RoyalFlush royalflush=new RoyalFlush(player, 's');
		System.out.println(royalflush);
		Assert.assertEquals("Owner: Steve Hand Value: ao#", royalflush.toString());
		
	}

	@Test
	public void testIsLegal() {
		Player player1=new Player("Alan");
		Player player2=new Player("Sarah");
		RoundState st=new RoundState();
		RoyalFlush royalflush1=new RoyalFlush(player1, 'd');
		RoyalFlush royalflush2=new RoyalFlush(player2, 'h');
		st.commitNewPlay(royalflush1);
		Assert.assertTrue(royalflush2.isLegal(st));
	}

}
