package chapter11;

public class Player {

	private PlayerLevel level;
	
	
	public Player() {
		//PlayerLevel level = new BeginnerLevel();
		level=new BeginnerLevel();  
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	//2단계 3단계
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	
	
}
