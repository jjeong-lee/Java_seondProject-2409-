package chapter12.AnonyInner;

public class StaticInner{
	int a =10;
	private int b=100;
	static int c=200; //Data영역

	//생성자
	
	//메서드
	
	//내부 클래스
	static class Inner{
		
		static int d=1000;
		//메서드
		public void printData() {
			//a와 b는 static이 아니기 때문에 사용이 불가능함
			/*
			System.out.println("int a: "+ a);
			System.out.println("private b: "+ b);
			*/
			System.out.println("static int c: "+ c);
		}
		
	}
	public static void main(String[] args) {
		
		Inner inner = new Inner();
		inner.printData();
		
		
	}
	
}
