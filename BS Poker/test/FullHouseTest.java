import static org.junit.Assert.*;
import hand.FullHouse;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import poker.Card;
import poker.Player;
import poker.RoundState;


public class FullHouseTest {

	@Test
	public void testGetOwner() {
		Player player = new Player("Samanthero");
		FullHouse fullHouse = new FullHouse(player, 2, 8);
		Assert.assertTrue("These should be same", fullHouse.getOwner()
				.equals(player));
	}

	@Test
	public void testIsBS() {
		Player player = new Player("Jerry");
		FullHouse fullHouse = new FullHouse(player, 2, 4);
		Assert.assertTrue("Hand is not BS", fullHouse.isBS() == false);
	}

	@Test
	public void testIsInPlay() {
		Player player = new Player("Fred");
		FullHouse fullHouse = new FullHouse(player, 8, 6);
		RoundState st = new RoundState();
		List<Card> cards = new LinkedList<Card>();
		cards.add(new Card(8, 's'));
		cards.add(new Card(8, 'd'));
		cards.add(new Card(4, 'h'));
		cards.add(new Card(6, 'c'));
		cards.add(new Card(5, 's'));
		cards.add(new Card(6, 'h'));
		cards.add(new Card(8, 'h'));
		st.addCards(cards);
		Assert.assertTrue("There is a full house of 8s over 6s", fullHouse.isInPlay(st));
	}

	@Test
	public void testGetValue() {
		Player player = new Player("Ian");
		FullHouse fullHouse = new FullHouse(player, 2,3);
		Assert.assertEquals("gcd", fullHouse.getValue());

	}

	@Test
	public void testCompareTo() {
		Player player1 = new Player("Andruw");
		Player player2 = new Player("Will");
		FullHouse fullHouse1 = new FullHouse(player1, 9, 3);
		FullHouse fullHouse2 = new FullHouse(player2, 8, 14);
		Assert
				.assertTrue("Will has a fullHouseer hand",
						fullHouse2.compareTo(fullHouse1) == -1);
	}

	@Test
	public void testToString() {  
		Player player=new Player("Steve");
		FullHouse fullHouse=new FullHouse(player, 14, 7);
		System.out.println(fullHouse);
		Assert.assertEquals("Owner: Steve Hand Value: goh", fullHouse.toString());
		
	}

	@Test
	public void testIsLegal() {
		Player player1=new Player("Alan");
		Player player2=new Player("Sarah");
		RoundState st=new RoundState();
		FullHouse fullHouse1=new FullHouse(player1, 4, 8);
		FullHouse fullHouse2=new FullHouse(player2, 5, 7);
		st.commitNewPlay(fullHouse1);
		Assert.assertTrue(fullHouse2.isLegal(st));
	}

}
