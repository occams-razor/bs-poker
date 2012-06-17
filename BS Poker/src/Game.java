import java.util.LinkedList;
import java.util.List;



public class Game {

	List<Player> players;
	Deck deck;
	
	Playable currentPlay;
	Table table;
	
	public Game(){
		players = new LinkedList<Player>();
		deck = new Deck();
		currentPlay = null;
		table = new Table();
	}
	
	public void mainLoop(){
		
		
		while (isRunning()){
			//deal
			table.clear();
			for (Player p:players){
				List<Card> toDeal = deck.getCards(p.getNumCards());
				table.add(toDeal);
				p.deal(toDeal);
			}
			
			//play loop
			for (Player p: players){
				//TODO compare the plays, throw an exception somewhere
				Playable nextPlay = p.getPlay();
				if (nextPlay.isBS()){
					//verify
					if(table.handExists(currentPlay)){
						//previous player wins
						break;
					}else{
						//bs player wins
						break;
					}
					
				}else{
					//not a bs
					//current hand updated
					currentPlay = nextPlay;
				}
			}
		}
		
		//deal with losers:
		for(Player p: players){
			if(p.getNumCards() >5 ){ //TODO magic number
				//TODO callback to player/ui
 				//player loses, notify loss, remove from list
				players.remove(p);
			}
		}
		
		
	}
	
	public boolean isRunning(){
		return true; //TODO
	}
}
