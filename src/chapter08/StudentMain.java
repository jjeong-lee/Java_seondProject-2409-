package chapter08;

public class StudentMain {

	public static void main(String[] args) {
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("�̼���");
		System.out.println("�̸�: "+studentLee.StudentName+" | �й�: "+studentLee.studentID);
		
		
		System.out.println();
		Student2 studentKim = new Student2();
		studentKim.setStudentName("�����");
		System.out.println("�̸�: "+studentKim.StudentName+" | �й�: "+studentKim.studentID);
		
		System.out.println();
		Student2 studentPark = new Student2();
		studentPark.setStudentName("������");
		System.out.println("�̸�: "+studentPark.StudentName+" | �й�: "+studentPark.studentID);
		
		
		
	}

}
