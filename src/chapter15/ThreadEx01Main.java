package chapter15;

public class ThreadEx01Main {

	public static void main(String[] args) {

		ThreadEx01 t = new ThreadEx01();
		t.start();
		//t.run(); //독립적인 공간은 있지만 병렬처리에서는 컴파일을 하지 못함
		System.out.println("main 종료");
		
		
	}
}
