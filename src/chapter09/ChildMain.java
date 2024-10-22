package chapter09;

import chapter08.Bank;

public class ChildMain {

	public static void main(String[] args) {
		
		
		//Child객체
		Child child = new Child();
		
		
		//method1 / method2 / method3
		child.method1(); //부모꺼
		child.method2(); //자식꺼
		child.method3(); //자식꺼
		
		
		
		System.out.println();
		//독립적인 Parent 객체
		Parent parent1 = new Parent();
		
		parent1.method1();
		parent1.method2();
		
		System.out.println();
		//Parent parent2 = child;
		Parent parent2 = new Child(); //부모꺼 또는 override된 메서드// 부모가 반드시 왼쪽으로 와야함.
		parent2.method1();//부모꺼
		parent2.method2();//자식꺼를 복제해서 사용
		
		
	}
	
}
