package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		
		Taxi taxi = new Taxi();
		taxi.run();
		
		
		Driver di = new Driver();
		di.drive(new Bus());
		
		di.drive(taxi);
		
		
		
		
		
		
	}

}
