package chapter16.lambda;

public class AddMainEX01 {

	public static void main(String[] args) {
		//Lamda: 메서드의 이름이 없고 구현부만 존재
		
		Add addF=(x,y)->x+y; //수행문만 호출
		System.out.println(addF.add(3, 4));  //이 경우, functional interface에서만 가능함 
		
	}
}
