package chapter12.string;

public class StringEqualsMain {

	public static void main(String[] args) {

		String strVar1 = new String("솔데스크");
		String strVar2 = "솔데스크";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		
		//equals: value값을 주소로 지정
		if(strVar1.equals(strVar2)) {  
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}

	}

}
