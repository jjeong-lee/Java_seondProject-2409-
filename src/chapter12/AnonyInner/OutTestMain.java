package chapter12.AnonyInner;

public class OutTestMain {

	public static void main(String[] args) {
		//인스턴스 멤버 클래스
		OutTest out = new OutTest();
		OutTest.A a=out.new A();
		a.field1=3;
		a.method();
		
		//정적 클래스 호출
		OutTest.B b = new OutTest.B();
		b.field1=5;
		b.method1();
		OutTest.B.field2=10;
		OutTest.B.method2();
		
		
		
	}
	
	
}
