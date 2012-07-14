import static org.junit.Assert.*;
import hand.RoyalFlush;
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
		RoyalFlush royalFlush = new RoyalFlush(player, 'h');
		Assert.assertTrue("These should be same", royalFlush.getOwner()
				.equals(player));
	}

	@Test
	public void testIsBS() {
		Player player = new Player("Jerry");
		RoyalFlush royalFlush = new RoyalFlush(player,  'h');
		Assert.assertTrue("Hand is not BS", royalFlush.isBS() == false);
	}

	@Test
	public void testIsInPlay() {
		Player player = new Player("Fred");
		RoyalFlush royalFlush = new RoyalFlush(player,  'c');
		RoundState st = new RoundState();
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(3, 'd'));
		cards.add(new Card(12, 'h'));
		cards.add(new Card(10, 'c'));
		cards.add(new Card(11, 'c'));
		cards.add(new Card(7, 'c'));
		cards.add(new Card(12, 'c'));
		cards.add(new Card(13, 'c'));
		cards.add(new Card(5, 'c'));
		cards.add(new Card(14, 'c'));
		st.addCards(cards);
		Assert.assertTrue("There is a royal flush of clubs", royalFlush.isInPlay(st));

		// fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		Player player = new Player("Ian");
		RoyalFlush royalFlush = new RoyalFlush(player, 'h');
		Assert.assertEquals("jc#", royalFlush.getValue());

	}

	@Test
	public void testCompareTo() {
		Player player1 = new Player("Andruw");
		Player player2 = new Player("Will");
		RoyalFlush royalFlush1 = new RoyalFlush(player1, 'c');
		RoyalFlush royalFlush2 = new RoyalFlush(player2, 'h');
		Assert
				.assertTrue("Will has a royalFlusher hand",
						royalFlush2.compareTo(royalFlush1) > 0);
	}

	@Test
	public void testToString() {  //not sure this works how we want it to//
		Player player=new Player("Steve");
		RoyalFlush royalFlush=new RoyalFlush(player, 'd');
		System.out.println(royalFlush);
		Assert.assertEquals("Owner: Steve Hand Value: ja#", royalFlush.toString());
		
	}

	@Test
	public void testIsLegal() {
		Player player1=new Player("Alan");
		Player player2=new Player("Sarah");
		RoundState st=new RoundState();
		RoyalFlush royalFlush1=new RoyalFlush(player1, 'h');
		RoyalFlush royalFlush2=new RoyalFlush(player2, 's');
		st.commitNewPlay(royalFlush1);
		Assert.assertTrue(royalFlush2.isLegal(st));
	}

}
