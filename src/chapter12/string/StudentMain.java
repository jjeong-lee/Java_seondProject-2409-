package chapter12.string;

public class StudentMain {

	
	public static void main(String[] args) {
		//String Ŭ������ �̹� toString�� ������ �Ǿ�����
		
		String str1=new String("test");
		String str2=new String("test");
		System.out.println("String: "+str1); //test
		System.out.println("String: "+str2); //test
		System.out.println(str1==str2);//new�� �ٸ� �ּ� ����
		
		Student studentLee = new Student(100,"���ڹ�");
		System.out.println("Student: "+studentLee);
		Student studentLee2 = studentLee;
		Student studentJava = new Student(100,"���ڹ�");
		
		//�������� �ּ�
		if(studentLee == studentLee2) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		}

		// ������ �ּ�
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		}

		// ===============================================================
	
		// �������� �ּ�
		System.out.println("�������� �ּҴ� �ٸ����� ������ ���� �����ϵ��� ������");
		if (studentLee == studentJava) {
			System.out.println("studentLee�� studentJava�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentJava�� �ּҴ� �ٸ��ϴ�.");
		}

		// ������ �ּ�
		if (studentLee.equals(studentJava)) {
			System.out.println("studentLee�� studentJava�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("studentLee�� studentJava�� �ּҴ� �ٸ��ϴ�.");
		}
		
		//=====================================================
		System.out.println("-----������ �� ���-----");
		System.out.println("studentLee�� hashCode: "+studentLee.hashCode());
		System.out.println("studentJava�� hashCode: "+studentJava.hashCode());
		
		System.out.println("-----������ �� ���� hashCode----- ");
		System.out.println("studentLee�� ����hashCode: "+System.identityHashCode(studentLee));
		System.out.println("studentJava�� ���� hashCode: "+System.identityHashCode(studentJava));
		
		//�����ǰ� �Ǿ��ִ� HashCode
		System.out.println("===StringŬ������ ���� ��===");
		System.out.println("str1�� HashCode: "+str1.hashCode());
		System.out.println("str2�� HashCode: "+str2.hashCode());
		
	}
}
