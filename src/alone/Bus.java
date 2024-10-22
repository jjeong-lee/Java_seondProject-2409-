package alone;

public class Bus extends Car {

	@Override
	void refuel() {
		System.out.println("천연가스를 충전합니다.");

	}
	
	 public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}

	@Override
	void run() {
		System.out.println("버스가 달립니다.");
	} 
	 
	 
}
