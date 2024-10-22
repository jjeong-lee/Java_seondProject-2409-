package chapter13.map;

import chapter13.list.Member;

public class MemberHashMapEx01Main {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//입력할때 필요한 매개변수
		Member memberLee = new Member(1001,"이수정");
		Member memberPark = new Member(1002,"박진영");
		Member memberHong = new Member(1003,"홍길동");
		Member memberJung = new Member(1004,"정진영");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberJung);
		
		memberHashMap.addMember(new Member(1005,"이민정"));  //memberId가 중복되어 이민정이 사라짐
		memberHashMap.addMember(new Member(1005,"임민정"));  
		
		memberHashMap.showAllMemeber();
		
		//remove
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMemeber();
		
		
	}
	
	
	
	
}
