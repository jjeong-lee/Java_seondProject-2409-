package chapter13.list;

public class Member {

	
	private int memberId;
	private String memberName;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int memeberId, String memberName) {
		super();
		this.memberId = memeberId;
		this.memberName = memberName;
	}

	public int getMemeberId() {
		return memberId;
	}

	public void setMemeberId(int memeberId) {
		this.memberId = memeberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {

		return "¸â¹öÀÌ¸§ : "+memberName;
	}
	
	
	
	
	
}
