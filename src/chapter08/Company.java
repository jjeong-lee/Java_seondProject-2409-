package chapter08;

public class Company {

	//�������
	//��ü�� �� �ϳ��� �����ϴ� Ŭ����
	private static Company instance = new Company();
	//private static Company instance ; //�̷��Ե� ��������.����ó���ϸ� ������.
	
	//������
	public Company() {
		// TODO Auto-generated constructor stub
	}
	//singleton  ��ü ���� �޼���
	public static Company getInstance() {
		
		//����ó�� -> ������ ��ü�� ������ ��ü����
		if(instance==null){
			instance = new Company();
		}
		return instance;
	}
	
	
	
	
	
}
