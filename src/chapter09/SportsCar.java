package chapter09;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed+=10;
		System.out.println("speed: "+ speed);
	}
	/* final이므로 재정의가 안됨.
	public final void stop() {
		System.out.println("자동차가 멈춥니다.");
		speed = 0;
	}
*/
	public static void main(String[] args) {
		
		SportsCar ac = new SportsCar();
		
		ac.speedUp();
		ac.stop();
		
		
	}
	
	
	
}
