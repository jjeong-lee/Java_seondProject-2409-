package chapter16.lambda;

public class StringConcatMainEX03 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		//인스턴스 메서드 호출 방식
		System.out.println("----인스턴스 방식-----");
		StringConcatImple concat1 = new StringConcatImple();
		concat1.makeString(s1, s2);

		
		// 익명의 내부 클래스 호출 방식
		System.out.println("----익명의 내부 클래스 방식-----");
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+" "+s2);	
			}
		};//concat2
		concat2.makeString(s1, s2);
		
		
		//람다식 호출 방식
		System.out.println("----람다식 방식-----");
		StringConcat concat = (str1, str2)-> System.out.println(str1+" "+str2);
		concat.makeString("Hello", "World");
		
	}
}
