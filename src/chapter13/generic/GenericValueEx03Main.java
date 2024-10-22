package chapter13.generic;

public class GenericValueEx03Main {

	public static void main(String[] args) {


		GenericValueEx03<String> v1 = new GenericValueEx03<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		GenericValueEx03<Integer> v2 = new GenericValueEx03<Integer>(); //AutoBoxing∏∏ √Î±ﬁ
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		GenericValueEx03<Double> v3 = new GenericValueEx03<Double>();
		v3.setValue(3.141592);
		System.out.println(v3.getValue());
		
		GenericValueEx03<Character> v4 = new GenericValueEx03<Character>();
		v4.setValue('A');
		System.out.println(v4.getValue());

	}

}
