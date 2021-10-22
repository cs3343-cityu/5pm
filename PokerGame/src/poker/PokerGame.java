package poker;

public class PokerGame {

	private Player PokerPlayer;
	
	PokerGame (Player player)
	{
		PokerPlayer = player; 
		
		// write your code here =) 
	}
	
	public String getLastName () {
		return PokerPlayer.getLastName();
	}
	public static void main(String args[]) {
		System.out.println(new Poker().isFullHouse(new String[] { "C2", "D2",
				"H2", "S3", "S4" }, 5));
	}
}
