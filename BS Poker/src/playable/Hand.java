package playable;

import poker.Playable;

/**
 * 
 * @author ajc
 * 
 */
public interface Hand extends Playable {

	public int getValue();

	public String toString();

}
