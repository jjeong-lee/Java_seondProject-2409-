package chapter11;

public class CarMain {

	public static void method(Car car) {
		car.run();
	}
	
	
	public static void main(String[] args) {
		method(new ManualCar());
		System.out.println("-----------------------------------");
		method(new AICar());
		
		
		/*�ٸ� ���
		Car mycar = new ManualCar();
		Car hicar = new AICar();
		mycar.run();
		hicar.run();
		*/
	}
}
