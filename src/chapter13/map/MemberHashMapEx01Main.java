package chapter13.map;

import chapter13.list.Member;

public class MemberHashMapEx01Main {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//�Է��Ҷ� �ʿ��� �Ű�����
		Member memberLee = new Member(1001,"�̼���");
		Member memberPark = new Member(1002,"������");
		Member memberHong = new Member(1003,"ȫ�浿");
		Member memberJung = new Member(1004,"������");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberJung);
		
		memberHashMap.addMember(new Member(1005,"�̹���"));  //memberId�� �ߺ��Ǿ� �̹����� �����
		memberHashMap.addMember(new Member(1005,"�ӹ���"));  
		
		memberHashMap.showAllMemeber();
		
		//remove
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMemeber();
		
		
	}
	
	
	
	
}
