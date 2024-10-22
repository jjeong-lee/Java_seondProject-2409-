package chapter12.AnonyInner;

public class OutTest {

	public OutTest() {
		System.out.println("Out ��ü�� �����˴ϴ�");
	}

	public class A {
		int field1;
		A() {
			System.out.println("A ��ü�� ������");
		}
		
		void method() {
			
		}
	}

	/** �ν��Ͻ� ��� Ŭ���� **/
	static class B {
		B() {
			System.out.println("B ��ü�� ������");
		}

		int field1;
		static int field2;

		// static int field2;
		void method1() {}
		static void method2() {}
		// static void method2() { }
	}// B class

	void method() {
		/** ���� Ŭ���� **/
		class C {
			int field1;

			C() {
				System.out.println("C ��ü�� ������");
			}

			void method1() {
			}

		}// C class
		C c = new C();
		c.field1 = 3;
		c.method1();
	}// method()

}//Out
