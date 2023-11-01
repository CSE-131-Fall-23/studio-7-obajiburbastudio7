package studio7;

public class HockeyPlayer {

	//instance variables
	private String name;
	private int jerseyNumber;
	private String handedness;
	private String shootDirection;
	private int numGoals;
	private int numAssists;
	private int numGames;
	
	//constructor
	public HockeyPlayer(String initName, int initJerseyNumber, String initHandedness, String initShootDirection, int initNumGoals, int initNumAssists, int initNumGames) {
		this.name = initName;
		this.jerseyNumber = initJerseyNumber;
		this.handedness = initHandedness;
		this.shootDirection = initShootDirection;
		this.numGoals = initNumGoals;
		this.numAssists = initNumAssists;
		this.numGames = initNumGames;			
	}
	
	public void updateInfo(int goals, int assists) {
		this.numGoals = this.numGoals + goals;
		this.numAssists += assists;
		this.numGames ++;		
	}
	
	public int calculatePoints() {
		return this.numGoals + this.numAssists;
	}
	
	public static void main(String[] args) {
		HockeyPlayer mvp = new HockeyPlayer("Doug Shook", 14, "right handed", "shoots left", 99, 200, 12);
			
	}
	
	
	
	
	
	
}



