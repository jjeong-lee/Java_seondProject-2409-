package chapter13.set;

import java.util.HashSet;

public class HashSetLottoEx03 {

	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(true) {
			
			int v= (int)(Math.random()*45+1);
			//int v=new Random().nextInt(45)+1;
			
			lotto.add(v);
			
			if(lotto.size()>=6) {
				break;
			}//if
			
		}//while
		System.out.println("∑Œ∂« 1µÓ ¥Á√∑: "+lotto);

	}

}
