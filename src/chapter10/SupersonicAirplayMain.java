package chapter10;

public class SupersonicAirplayMain {

	
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMODE=SupersonicAirplane.SUPERSONIC; //static�̶� Supersonic ��ü�� �ƴ� class���� ������
		sa.fly();
		sa.flyMODE=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		
		
		
		
		
		
	}
}
