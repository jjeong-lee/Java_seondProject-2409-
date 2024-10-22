package chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//실습 문제 , 혼자 해보기 , 선생님꺼랑 비교해서 보기
public class BugHuntersEX03 {

	public static void main(String[] args) {
		
		Map<Integer, String> hunters = new HashMap<Integer, String>();
		
		hunters.put(1, "우희민");
		hunters.put(2, "이은정");
		hunters.put(3, "강자성");
		hunters.put(4, "김원기");
		hunters.put(5, "강서연");
		System.out.println("총 팀원 수 : "+ hunters.size()+"명");
		
		//찾기
		System.out.println("2번 팀원 찾기: "+hunters.get(2));
		System.out.println();
		
		//팀원 모두 출력
		Set<Integer> member = hunters.keySet();
		
		Iterator<Integer> ir = member.iterator();
		System.out.println("===버그헌터즈 팀원===");
		while(ir.hasNext()) {
			Integer memberNum = ir.next();
			String memberName = hunters.get(memberNum);
			System.out.println("No."+memberNum + ", "+memberName);
		}
		System.out.println();
		
		
		//팀원 모두 삭제
		hunters.clear();
		System.out.println("전체 삭제 후 현재 팀원 수 : "+hunters.size());
		
		
	}
}
