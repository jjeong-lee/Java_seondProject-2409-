package chapter08;

public class StaticFunction {

	
	String str1="일반 회원변수";
	static String str2="Static 회원변수";
	
	
	public static String getString() {
		/*
		StaticFunction s=new StaticFunction();
		s.str1="MEMBER";
		*/
		str2="VIP";
		
		return str2;
		
	}
	
}
