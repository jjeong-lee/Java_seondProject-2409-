package chapter08;

public class Company {

	//멤버변수
	//객체를 단 하나만 생성하는 클래스
	private static Company instance = new Company();
	//private static Company instance ; //이렇게도 쓸수있음.예외처리하면 괜찮음.
	
	//생성자
	public Company() {
		// TODO Auto-generated constructor stub
	}
	//singleton  객체 생성 메서드
	public static Company getInstance() {
		
		//예외처리 -> 생성된 객체가 없으면 객체생성
		if(instance==null){
			instance = new Company();
		}
		return instance;
	}
	
	
	
	
	
}
