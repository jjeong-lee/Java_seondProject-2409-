package chapter13.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	
	//필드 ArrayList
	private ArrayList<Member> memberList;

	public MemberArrayList() {
		memberList = new ArrayList<Member>();
	}
	
	
	//저장
	public void addMember(Member member) {
		memberList.add(member);
	}
	//멤버 삭제
	
	public boolean removeMember(int memberId) {
		Iterator<Member> it = memberList.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemeberId();

			if (tempId == memberId) {
				memberList.remove(member);
				System.out.println("ID " + memberId + "번 학생정보를 삭제합니다.");
				return true;
			}//if
		}//member
		System.out.println(memberId + "(은)는 존재하지 않는 학생정보 입니다.");
		return false;
	}//removeMember

	public void showMember() {
		for(Member member : memberList) {
		System.out.println(member);
		}
		
		
	}
	
}
