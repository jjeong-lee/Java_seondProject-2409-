package chapter12.AnonyInner;

public class OutTestMain {

	public static void main(String[] args) {
		//�ν��Ͻ� ��� Ŭ����
		OutTest out = new OutTest();
		OutTest.A a=out.new A();
		a.field1=3;
		a.method();
		
		//���� Ŭ���� ȣ��
		OutTest.B b = new OutTest.B();
		b.field1=5;
		b.method1();
		OutTest.B.field2=10;
		OutTest.B.method2();
		
		
		
	}
	
	
}
