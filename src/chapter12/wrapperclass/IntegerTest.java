package chapter12.wrapperclass;

public class IntegerTest {

	public static void main(String[] args) {
		
		//Integer i= new Integer(100);
		//����ڽ�: �Ϲ��ڷ�(int) => Ŭ����(Integer)�� ����
		Integer num = 100;
		
		int iNum=num.intValue();//��ڽ�: Ŭ����(Integer) =>�Ϲ��ڷ�(int)
		int jNum =200;
		
		int sum=iNum+jNum;
		System.out.println(sum);
	
		System.out.println();
		//��ڽ�(Integer => int)
		int total = num + jNum; //num.intValue()+jNum
		System.out.println(total);
		//����ڽ�(int => Integer)
		Integer i = jNum;
		System.out.println(i);
		
	
	
	}
	
}
