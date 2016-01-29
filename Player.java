import java.util.HashSet;

public class Player implements IPlayer {
	
	private String name;
	private Territory playerTerritory;
	private HashSet<Card> deck;
	//private HashSet<Card> hand;
	
	@Override
	public void ask(Player enemy) {
		//print Question
		//getEnemyAnswer
		//compare with cardAnswer
		//if true conquer
	}
	@Override
	public void conquer() {
		this.playerTerritory.setSize(this.playerTerritory.getSize()-1);
		
	}
	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
	} 

}
