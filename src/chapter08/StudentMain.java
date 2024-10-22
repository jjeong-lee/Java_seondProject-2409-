package chapter08;

public class StudentMain {

	public static void main(String[] args) {
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이수정");
		System.out.println("이름: "+studentLee.StudentName+" | 학번: "+studentLee.studentID);
		
		
		System.out.println();
		Student2 studentKim = new Student2();
		studentKim.setStudentName("김우진");
		System.out.println("이름: "+studentKim.StudentName+" | 학번: "+studentKim.studentID);
		
		System.out.println();
		Student2 studentPark = new Student2();
		studentPark.setStudentName("박진영");
		System.out.println("이름: "+studentPark.StudentName+" | 학번: "+studentPark.studentID);
		
		
		
	}

}
