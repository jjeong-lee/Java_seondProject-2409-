package chapter12.string;

public class StudentMain {

	
	public static void main(String[] args) {
		//String 클래스는 이미 toString이 재정의 되어있음
		
		String str1=new String("test");
		String str2=new String("test");
		System.out.println("String: "+str1); //test
		System.out.println("String: "+str2); //test
		System.out.println(str1==str2);//new로 다른 주소 생성
		
		Student studentLee = new Student(100,"이자바");
		System.out.println("Student: "+studentLee);
		Student studentLee2 = studentLee;
		Student studentJava = new Student(100,"이자바");
		
		//물리적인 주소
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}

		// 논리적인 주소
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}

		// ===============================================================
	
		// 물리적인 주소
		System.out.println("물리적인 주소는 다르지만 논리적인 값은 동일하도록 재정의");
		if (studentLee == studentJava) {
			System.out.println("studentLee와 studentJava의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentJava의 주소는 다릅니다.");
		}

		// 논리적인 주소
		if (studentLee.equals(studentJava)) {
			System.out.println("studentLee와 studentJava의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentJava의 주소는 다릅니다.");
		}
		
		//=====================================================
		System.out.println("-----데이터 값 출력-----");
		System.out.println("studentLee의 hashCode: "+studentLee.hashCode());
		System.out.println("studentJava의 hashCode: "+studentJava.hashCode());
		
		System.out.println("-----데이터 값 같은 hashCode----- ");
		System.out.println("studentLee의 실제hashCode: "+System.identityHashCode(studentLee));
		System.out.println("studentJava의 실제 hashCode: "+System.identityHashCode(studentJava));
		
		//재정의가 되어있는 HashCode
		System.out.println("===String클래스의 실제 값===");
		System.out.println("str1의 HashCode: "+str1.hashCode());
		System.out.println("str2의 HashCode: "+str2.hashCode());
		
	}
}
