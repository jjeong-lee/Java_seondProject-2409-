package chapter13.set;

import java.util.HashSet;

public class SolDeskMemberManager {

	//HashSet 을 사용하여 회원정보 관리
	private HashSet<SolDeskMember> members;
	
	//생성자를 통해서 회원정보를 담을 공간(HashSet) 확보
	public SolDeskMemberManager() {
		members = new HashSet<SolDeskMember>();
	} 
	
	//회원 추가 메서드(중복 허용 안함)
	public void addMember(SolDeskMember member) {
		if(members.add(member)) {
			System.out.println(member.getMemberId()+"회원이 성공적으로 추가되었습니다.");
		}else {
			System.out.println(member.getMemberId()+ "이미 존재하는 ID입니다.");
		}
	}//addMember
	
	public void showAllMember() {
		for(SolDeskMember member : members) {
			System.out.println(member);
		}
	}
	


	
}
