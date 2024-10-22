package chapter13.set;

public class SolDeskMemberEx02Main {

	public static void main(String[] args) {
		
		//SolDeskManager ��ü ����
		SolDeskMemberManager manager = new SolDeskMemberManager();
		
		//ȸ�� ��ü ����
		SolDeskMember member1 = new SolDeskMember(1001,"�̼���");
		SolDeskMember member2 = new SolDeskMember(1002,"������");
		SolDeskMember member3 = new SolDeskMember(1003,"���ϳ�");
		SolDeskMember member4 = new SolDeskMember(1004,"�����");
		
		
		//ȸ������
		manager.addMember(member1);
		manager.addMember(member2);
		manager.addMember(member3);
		manager.addMember(member4);
		System.out.println();
		
		//��ü ȸ�� ���
		System.out.println("===��ü ȸ�� ���===");
		manager.showAllMember();
		
		
		// �ߺ� ȸ�� �߰� �õ�
		SolDeskMember duplicateMember = new SolDeskMember(1003, "���ϳ�");
		manager.addMember(duplicateMember);

		// ��ü ȸ�� ��� //�ߺ��� �ȵǰ� �Ϸ��� hashcode�� equals�� 
		               //�������̵��ؼ� �ý��۰��� �ƴ� ������ ���ϰ� �ؾ���. 
					   //��ü�� Ŀ���͸���¡�߱� ������ �������. String�̳� Integer�� ���ص���.
		System.out.println("===��ü ȸ�� ���===");
		manager.showAllMember();
		
		

	}

}
