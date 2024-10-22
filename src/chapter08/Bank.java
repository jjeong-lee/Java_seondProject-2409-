package chapter08;

public class Bank {

	private String point; //지점명
	private String tel;
	static float interest;  //static은 생성자 오버로딩이 안됨.
	
	
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	//결과 출력 메서드
	public void getBank() {
		System.out.println("지점: " +point+"\n"+"전화번호 : "+tel+"\n"+"은행이자 : "+interest);
	}
}
