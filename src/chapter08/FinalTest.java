package chapter08;

import javax.swing.JOptionPane;

public class FinalTest {

	//�������
	//final: �缱���� �ȵ� �б⸸ ����
	private static final int MAX=3; 
	
	public static void main(String[] args) {
		//��������
		int num=0;
		num=1;
		
		for(int i=0; i<MAX; i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("�� �Է�"));
			if(num>MAX) {
				System.out.println("3���� Ů�ϴ�.");
			}else {
				System.out.println("3���� �۽��ϴ�.");
			}
		}//for
	
	

	}//main

}
