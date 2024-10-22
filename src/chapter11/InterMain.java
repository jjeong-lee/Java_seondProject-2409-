package chapter11;

public class InterMain {

	
	public static void main(String[] args) {
		
		//InterBase it = new InterBase() //추상클래스라서 안됨.
		Intersample it = new Intersample();
		
		System.out.println("getA() : "+it.getA());
		
	}
}
