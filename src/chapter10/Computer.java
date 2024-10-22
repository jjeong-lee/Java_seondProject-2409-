package chapter10;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 클래스의 메서드 areaCircle()");
		return Math.PI*r*r;
	}

	
	
}
