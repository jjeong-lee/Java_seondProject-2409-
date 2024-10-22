package chapter11;

public class GameMain {

	public static void main(String[] args) {
		Player player = new Player();
		
		//기본단계
		player.play(1);
		
		
		//레벨2
		player.upgradeLevel(new AdvancedLevel());
		player.play(3);
		
		
		//레벨3
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
		
	}
	
}
