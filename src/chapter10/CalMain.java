package chapter10;

public class CalMain {
	//�����Բ� �����ؼ� �ٽ� Ȯ���ϱ�
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
		System.out.println("�� ���� ��: "+plus);
		
		int minus = calcul(new CalMinus(), 20, 10);
		System.out.println("�� ���� ��: "+minus);
		
		
	}


}
