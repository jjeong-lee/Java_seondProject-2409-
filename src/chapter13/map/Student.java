package chapter13.map;

public class Student {
	// 다시 공부
	public int sno;
	public String name;
	
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}


	@Override
	public int hashCode() {
		return sno+name.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno == student.sno) && (name.equals(student.name));
		}
		return false;
	}


	@Override
	public String toString() {
		return "Student[sno="+sno +", name="+ name+"]" ;
	}


	
	
	
}
