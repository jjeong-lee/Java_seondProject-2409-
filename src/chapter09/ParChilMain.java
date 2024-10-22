package chapter09;

public class ParChilMain {

	public static void main(String[] args) {
		
		ChildEx c1 = new ChildEx();
		
		System.out.println(c1.getCar());//자식
		System.out.println(c1.getMoney());//부모
		
		//====================================
		if(c1 instanceof ParentEx) {
			System.out.println("c1은 ParentEx의 자식 클래스 입니다.");
		}
		
		//====================================
		ChildEx ch = new ChildEx();
		ParentEx p1 = new ParentEx();
		System.out.println("===========================================");
		p1=ch; //자동형변환  
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		
		
		System.out.println("===========================================");
		ch=(ChildEx)p1; //명시적 형변환  
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		

	}

}
