package chapter09;

public class SuperMain {

	public static void main(String[] args) {


		Paprika obj = new Paprika();
		
		obj.Set1("피망류", "여름", "노랑파프리카"); //부모클래스의 메서드
		obj.Set2("빨강", 7000, "빨강파프리카"); //자식클래스의 메서드
		
		obj.Disp1();
		System.out.println();
		obj.Disp2();
	}

}
