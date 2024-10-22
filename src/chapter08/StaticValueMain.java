package chapter08;

public class StaticValueMain {

	public static void main(String[] args) {
		
		StaticValue obj1 = new StaticValue();
		StaticValue obj2 = new StaticValue();
	
		obj1.a=10;
		obj1.b=20;
		System.out.println("obj1.a: "+obj1.a+" | "+"obj1.b: "+obj1.b);
		//obj1.a=10;| obj1.b=20;

		
		obj2.a=100;
		obj2.b=200;
		System.out.println("obj2.a: "+obj2.a+" | "+"obj2.b: "+obj2.b);
		System.out.println("========================================");
		
		System.out.println("obj1.a: "+obj1.a+" | "+"obj1.b: "+obj1.b);
		obj2.a=100;
		obj2.b=300;
		
		System.out.println("obj2.a: "+obj2.a+" | "+"obj2.b: "+obj2.b);
		//obj1.a=100;| obj1.b=300;
		System.out.println("obj1.a: "+obj1.a+" | "+"obj1.b: "+obj1.b);
		//obj1.a=10;| obj1.b=300;
	}

}
