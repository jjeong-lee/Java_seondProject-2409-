package chapter11;

public class GameMain {

	public static void main(String[] args) {
		Player player = new Player();
		
		//�⺻�ܰ�
		player.play(1);
		
		
		//����2
		player.upgradeLevel(new AdvancedLevel());
		player.play(3);
		
		
		//����3
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
		
	}
	
}
