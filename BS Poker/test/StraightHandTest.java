import static org.junit.Assert.*;
import hand.Straight;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import poker.Card;
import poker.Player;
import poker.RoundState;


public class StraightHandTest {

	@Test
	public void testGetOwner() {
		Player player = new Player("Samanthero");
		Straight straight = new Straight(player, 8);
		Assert.assertTrue("These should be same", straight.getOwner()
				.equals(player));
	}

	@Test
	public void testIsBS() {
		Player player = new Player("Jerry");
		Straight straight = new Straight(player, 6);
		Assert.assertTrue("Hand is not BS", straight.isBS() == false);
	}

	@Test
	public void testIsInPlay() {
		Player player = new Player("Fred");
		Straight straight = new Straight(player, 3);
		RoundState st = new RoundState();
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(2, 's'));
		cards.add(new Card(3, 'd'));
		cards.add(new Card(4, 'h'));
		cards.add(new Card(5, 'h'));
		cards.add(new Card(6, 'h'));
		cards.add(new Card(7, 'h'));
		st.addCards(cards);
		Assert.assertTrue("There is a straight to 7", straight.isInPlay(st));

		// fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		Player player = new Player("Ian");
		Straight straight = new Straight(player, 5);
		Assert.assertEquals("ef#", straight.getValue());

	}

	@Test
	public void testCompareTo() {
		Player player1 = new Player("Andruw");
		Player player2 = new Player("Will");
		Straight straight1 = new Straight(player1, 14);
		Straight straight2 = new Straight(player2, 5);
		System.out.println(straight2.compareTo(straight1));
		Assert
				.assertTrue("Will has a straighter hand",
						straight2.compareTo(straight1) <0);
	}

	@Test
	public void testToString() {  
		Player player=new Player("Steve");
		Straight straight=new Straight(player, 14);
		System.out.println(straight);
		Assert.assertEquals("Owner: Steve Hand Value: eo#", straight.toString());
	}

	@Test
	public void testIsLegal() {
		Player player1=new Player("Alan");
		Player player2=new Player("Sarah");
		RoundState st=new RoundState();
		Straight straight1=new Straight(player1, 5);
		Straight straight2=new Straight(player2, 6);
		st.commitNewPlay(straight1);
		Assert.assertTrue(straight2.isLegal(st));
	
	}

}
