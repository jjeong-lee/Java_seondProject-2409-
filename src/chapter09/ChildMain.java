package chapter09;

import chapter08.Bank;

public class ChildMain {

	public static void main(String[] args) {
		
		
		//Child��ü
		Child child = new Child();
		
		
		//method1 / method2 / method3
		child.method1(); //�θ�
		child.method2(); //�ڽĲ�
		child.method3(); //�ڽĲ�
		
		
		
		System.out.println();
		//�������� Parent ��ü
		Parent parent1 = new Parent();
		
		parent1.method1();
		parent1.method2();
		
		System.out.println();
		//Parent parent2 = child;
		Parent parent2 = new Child(); //�θ� �Ǵ� override�� �޼���// �θ� �ݵ�� �������� �;���.
		parent2.method1();//�θ�
		parent2.method2();//�ڽĲ��� �����ؼ� ���
		
		
	}
	
}
