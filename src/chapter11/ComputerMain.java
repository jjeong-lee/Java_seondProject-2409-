package chapter11;

public class ComputerMain {

	public static void main(String[] args) {

		//Computer c1 = new Computer(); //�߻�Ŭ������ ��ü�� ���� ������ �� ����.
		Computer c2 = new DeskTop();
		Computer c3 = new MyNoteBook(); //NoteBook Ŭ���� ���� ����
		
		c2.typing();
		c2.display();
		c3.typing();
		c3.display();
		
	}

}
