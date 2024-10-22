package chapter11;

public class MyClassMain {

	
	public static void main(String[] args) {
		
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		System.out.println();
		
		Y yclass = mClass;
		yclass.y();
		System.out.println();
		
		mClass.myMethod();
		
		//¹Ø¿¡¸¸ ¼±»ý´Ô²¨ Âü°í
		
		
		
	}
}
