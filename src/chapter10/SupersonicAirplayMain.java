package chapter10;

public class SupersonicAirplayMain {

	
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMODE=SupersonicAirplane.SUPERSONIC; //static이라서 Supersonic 객체가 아닌 class에서 가져옴
		sa.fly();
		sa.flyMODE=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		
		
		
		
		
		
	}
}
