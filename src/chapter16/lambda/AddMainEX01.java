package chapter16.lambda;

public class AddMainEX01 {

	public static void main(String[] args) {
		//Lamda: �޼����� �̸��� ���� �����θ� ����
		
		Add addF=(x,y)->x+y; //���๮�� ȣ��
		System.out.println(addF.add(3, 4));  //�� ���, functional interface������ ������ 
		
	}
}
