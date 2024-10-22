package chapter13.list;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	
	//�ʵ� ArrayList
	private ArrayList<Member> memberList;

	public MemberArrayList() {
		memberList = new ArrayList<Member>();
	}
	
	
	//����
	public void addMember(Member member) {
		memberList.add(member);
	}
	//��� ����
	
	public boolean removeMember(int memberId) {
		Iterator<Member> it = memberList.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemeberId();

			if (tempId == memberId) {
				memberList.remove(member);
				System.out.println("ID " + memberId + "�� �л������� �����մϴ�.");
				return true;
			}//if
		}//member
		System.out.println(memberId + "(��)�� �������� �ʴ� �л����� �Դϴ�.");
		return false;
	}//removeMember

	public void showMember() {
		for(Member member : memberList) {
		System.out.println(member);
		}
		
		
	}
	
}
