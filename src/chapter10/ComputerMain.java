package chapter10;

public class ComputerMain {

	
	public static void main(String[] args) {
		
		int r=10;
		Calculator calculator = new Calculator();
		System.out.println("¿øÀÇ ³ÐÀÌ: "+calculator.areaCircle(r));
		System.out.println();
		Computer computer = new Computer();
		System.out.println("¿øÀÇ ³ÐÀÌ: "+computer.areaCircle(r));
	}
	
}
