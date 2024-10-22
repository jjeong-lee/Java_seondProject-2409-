package chapter12.string;

import java.util.Date;

public class ToStingMain {

	public static void main(String[] args) {


		Object obj1=new Object();
		System.out.println("===재정의가 안되어있는 기본 toSting===");
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println("===재정의가 되어있는 toSting===");
		Date obj2 = new Date();
		System.out.println(obj2);
		
	}

}
