package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone���κ��� ��� ���� �ʵ�
		System.out.println("�� : "+dmbCellPhone.model);
		System.out.println("���� : "+dmbCellPhone.color);

		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : "+ dmbCellPhone.channel);
		
		//Cellphone���κ��� ��ӹ��� �޼��� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� �ֵ���ũ�Դϴ�.");
		dmbCellPhone.sendVoice("������Ʈ ��ǥ�� �����ΰ���?");
		dmbCellPhone.hangup();
		
		
		//DmbCellPhone�� �޼��� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(15);
		dmbCellPhone.turnOffDmb();
		
		
	}

}
