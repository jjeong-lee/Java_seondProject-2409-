package chapter15;

public class ThreadEx02Main {

	public static void main(String[] args) {
		
		ThreadEx02 t1 = new ThreadEx02();  //0~9까지의 요소가 저장된 temp변수방 생성됨
		
		t1.start(); //start와 run의 차이를 알기,복습
		
		try {
			Thread.sleep(11000);//2초
			System.out.println("프로그램이 종료됩니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
