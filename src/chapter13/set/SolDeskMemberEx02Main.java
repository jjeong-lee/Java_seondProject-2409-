package chapter13.set;

public class SolDeskMemberEx02Main {

	public static void main(String[] args) {
		
		//SolDeskManager 객체 생성
		SolDeskMemberManager manager = new SolDeskMemberManager();
		
		//회원 객체 생성
		SolDeskMember member1 = new SolDeskMember(1001,"이수정");
		SolDeskMember member2 = new SolDeskMember(1002,"박진영");
		SolDeskMember member3 = new SolDeskMember(1003,"정하나");
		SolDeskMember member4 = new SolDeskMember(1004,"김우진");
		
		
		//회원가입
		manager.addMember(member1);
		manager.addMember(member2);
		manager.addMember(member3);
		manager.addMember(member4);
		System.out.println();
		
		//전체 회원 목록
		System.out.println("===전체 회원 목록===");
		manager.showAllMember();
		
		
		// 중복 회원 추가 시도
		SolDeskMember duplicateMember = new SolDeskMember(1003, "정하나");
		manager.addMember(duplicateMember);

		// 전체 회원 목록 //중복이 안되게 하려면 hashcode와 equals를 
		               //오버라이딩해서 시스템값이 아닌 내용을 비교하게 해야함. 
					   //객체를 커스터마이징했기 때문에 해줘야함. String이나 Integer면 안해도됨.
		System.out.println("===전체 회원 목록===");
		manager.showAllMember();
		
		

	}

}
