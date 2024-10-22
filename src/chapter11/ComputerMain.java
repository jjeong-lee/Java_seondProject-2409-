package chapter11;

public class ComputerMain {

	public static void main(String[] args) {

		//Computer c1 = new Computer(); //추상클래스는 객체를 직접 생성할 수 없음.
		Computer c2 = new DeskTop();
		Computer c3 = new MyNoteBook(); //NoteBook 클래스 참조 가능
		
		c2.typing();
		c2.display();
		c3.typing();
		c3.display();
		
	}

}
