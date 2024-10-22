package chapter13.list;

import java.util.ArrayDeque;
import java.util.Deque;

public class CoinEx10Main {

	public static void main(String[] args) {


		//ArrayDeque ��ü ����(����ó�� ���)
		Deque<Coin> coinStack = new ArrayDeque<>(); //<Coin>���� �Ǿ�����.
		
		//�����߰�
		coinStack.push(new Coin(500));
		coinStack.push(new Coin(100));
		coinStack.push(new Coin(50));
		coinStack.push(new Coin(10));
		
		//������ ������� ������ Ȯ���ϰ� ���
		System.out.println("������ ������� ������?:"+!coinStack.isEmpty());
		
		//������ ������� ������ ���� �ϳ��� ������(pop)
		while(!coinStack.isEmpty()) {
			Coin coin = coinStack.pop();
			System.out.println("������ ����: "+coin.getValue());
		}
		
		
		
		
		
	}

}
