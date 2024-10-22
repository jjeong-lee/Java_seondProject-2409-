package chapter12.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {

		
		Date now = new Date();
		System.out.println(now); //객체출력
		String strNow1=now.toString(); //객체 -> String의 타입
		System.out.println("-----DATE-----");
		System.out.println(strNow1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2=sdf.format(now);//객체의 값을 문자열로 반환
		System.out.println("-----SimpleDateFormat-----");
		System.out.println(strNow2);
		
		String strNow3 = sdf.toString();//객체의 주소를 String으로 반환
		System.out.println("-----NoFormat-----");
		System.out.println(strNow3);
		
	}

}
