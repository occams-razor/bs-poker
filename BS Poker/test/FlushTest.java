import static org.junit.Assert.*;
import poker.Card;
import hand.Flush;
import hand.Quad;
import junit.framework.Assert;

import org.junit.Test;

import poker.Player;
import poker.RoundState;
import java.util.LinkedList;
import java.util.List;


public class FlushTest {

	@Test
	public void testGetOwner() {
		Player player = new Player("Samanthero");
		Flush flush = new Flush(player, 2, 'h');
		Assert.assertTrue("These should be same", flush.getOwner()
				.equals(player));
		// Assert.assertTrue("These should be same", false);
	}
	@Test
	public void testIsBS() {
		Player player=new Player("Sylvia");
		Flush flush=new Flush(player, 2, 'd');
		Assert.assertTrue("This is not BS", flush.isBS()==false);
	}

	@Test
	public void testIsInPlay() {
		Player player=new Player("Wank");
		RoundState st=new RoundState();
		List<Card> cards=new LinkedList<Card>();
		cards.add(new Card(4, 'd'));
		cards.add(new Card(5, 'd'));
		cards.add(new Card(10, 'd'));
		cards.add(new Card(9, 's'));
		cards.add(new Card(7, 'd'));
		cards.add(new Card(3, 'd'));
		st.addCards(cards);
		Flush flush=new Flush(player, 2, 'd');
		Assert.assertTrue(flush.isInPlay(st));
		
		}

	@Test
	public void testGetValue() {
		Player player = new Player("DZ");
		Flush flush = new Flush(player, 5, 'd');
		Assert.assertEquals("ff#", flush.getValue());
	}

	@Test
	public void testCompareTo() {
		Player player1=new Player("Tony Martin");
		Player player2=new Player("Bradley Wiggins");
		Flush f1=new Flush(player1, 3, 'd');
		Flush f2=new Flush(player2, 4, 'h');
		Assert.assertEquals(1, f2.compareTo(f1));
	}

	@Test
	public void testToString() {
		Player player=new Player("Cance");
	}

	@Test
	public void testIsLegal() {
		Player player1=new Player("Tony Martin");
		Player player2=new Player("Bradley Wiggins");
		Flush f1=new Flush(player1, 3, 'd');
		Flush f2=new Flush(player2, 4, 'h');
		RoundState st=new RoundState();
		st.commitNewPlay(f1);
		Assert.assertTrue(f2.isLegal(st));
		
	}

	

}
