

package poker;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import hand.*;
import playable.*;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Player player=new Player("Steve");
		High high=new High(player, 14);
		System.out.println(high);
	}
}

