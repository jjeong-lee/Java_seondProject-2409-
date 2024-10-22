package chapter12.wrapperclass;

public class IntegerTest {

	public static void main(String[] args) {
		
		//Integer i= new Integer(100);
		//오토박싱: 일반자료(int) => 클래스(Integer)로 선언
		Integer num = 100;
		
		int iNum=num.intValue();//언박싱: 클래스(Integer) =>일반자료(int)
		int jNum =200;
		
		int sum=iNum+jNum;
		System.out.println(sum);
	
		System.out.println();
		//언박싱(Integer => int)
		int total = num + jNum; //num.intValue()+jNum
		System.out.println(total);
		//오토박싱(int => Integer)
		Integer i = jNum;
		System.out.println(i);
		
	
	
	}
	
}
