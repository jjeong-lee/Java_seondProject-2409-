package chapter11;

public class CarMain {

	public static void method(Car car) {
		car.run();
	}
	
	
	public static void main(String[] args) {
		method(new ManualCar());
		System.out.println("-----------------------------------");
		method(new AICar());
		
		
		/*다른 방법
		Car mycar = new ManualCar();
		Car hicar = new AICar();
		mycar.run();
		hicar.run();
		*/
	}
}
