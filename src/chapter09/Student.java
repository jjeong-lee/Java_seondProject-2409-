package chapter09;

public class Student extends People{
	
	
	/*
	public String name;
	public String ssn;
	*/
	
	public int sutdentNo;

	public Student(String name, String ssn, int sutdentNo) {
		super(name, ssn); //�θ�Ŭ������ ������ ȣ���Ͽ� ��� �ʱ�ȭ
		this.sutdentNo = sutdentNo;
	}
	
	
	
	
}
