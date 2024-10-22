package chapter13.set;

import java.util.HashSet;

public class SolDeskMemberManager {

	//HashSet �� ����Ͽ� ȸ������ ����
	private HashSet<SolDeskMember> members;
	
	//�����ڸ� ���ؼ� ȸ�������� ���� ����(HashSet) Ȯ��
	public SolDeskMemberManager() {
		members = new HashSet<SolDeskMember>();
	} 
	
	//ȸ�� �߰� �޼���(�ߺ� ��� ����)
	public void addMember(SolDeskMember member) {
		if(members.add(member)) {
			System.out.println(member.getMemberId()+"ȸ���� ���������� �߰��Ǿ����ϴ�.");
		}else {
			System.out.println(member.getMemberId()+ "�̹� �����ϴ� ID�Դϴ�.");
		}
	}//addMember
	
	public void showAllMember() {
		for(SolDeskMember member : members) {
			System.out.println(member);
		}
	}
	


	
}
