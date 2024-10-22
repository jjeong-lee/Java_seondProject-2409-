package chapter10;

public class CalMain {
	//선생님꺼 참고해서 다시 확인하기
	public static int calcul(CalculatorEx c1, int a, int b) {
		return c1.getResult(a, b);
		}
	
	public static void main(String[] args) {
/*
		CalculatorEx calP = new CalPlus();
		CalculatorEx calM = new CalMinus(); 
		
		System.out.println("CalPlus : "+(int)calP.getResult(25,5));
		System.out.println("CalMinus : "+(int)calM.getResult(20,5));
*/
		int plus = calcul(new CalPlus(),20,10);
		System.out.println("두 수의 합: "+plus);
		
		int minus = calcul(new CalMinus(), 20, 10);
		System.out.println("두 수의 차: "+minus);
		
		
	}


}
