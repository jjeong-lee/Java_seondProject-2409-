package chapter09;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed+=10;
		System.out.println("speed: "+ speed);
	}
	/* final�̹Ƿ� �����ǰ� �ȵ�.
	public final void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
		speed = 0;
	}
*/
	public static void main(String[] args) {
		
		SportsCar ac = new SportsCar();
		
		ac.speedUp();
		ac.stop();
		
		
	}
	
	
	
}
