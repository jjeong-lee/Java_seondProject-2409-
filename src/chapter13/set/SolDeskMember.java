package chapter13.set;

public class SolDeskMember {

	private int memberId;
	private String memberName;
	
	public SolDeskMember() {

	}
	
	public SolDeskMember(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	//getter and setter
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	
	@Override
	public String toString() {
	
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	//�������� ��(�ý��� �ּ�)
	@Override
	public int hashCode() {
		return memberId;
	}

    //������ ��(����) 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SolDeskMember) {
			SolDeskMember member=(SolDeskMember)obj;
			return this.memberId == member.memberId || this.memberName.equals(member.memberName);
			}
		return false;
	}	
	
	
}
