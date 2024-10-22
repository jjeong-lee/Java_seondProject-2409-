package chapter12.AnonyInner;

public class OutTest {

	public OutTest() {
		System.out.println("Out 객체가 생성됩니다");
	}

	public class A {
		int field1;
		A() {
			System.out.println("A 객체가 생성됨");
		}
		
		void method() {
			
		}
	}

	/** 인스턴스 멤버 클래스 **/
	static class B {
		B() {
			System.out.println("B 객체가 생성됨");
		}

		int field1;
		static int field2;

		// static int field2;
		void method1() {}
		static void method2() {}
		// static void method2() { }
	}// B class

	void method() {
		/** 로컬 클래스 **/
		class C {
			int field1;

			C() {
				System.out.println("C 객체가 생성됨");
			}

			void method1() {
			}

		}// C class
		C c = new C();
		c.field1 = 3;
		c.method1();
	}// method()

}//Out
