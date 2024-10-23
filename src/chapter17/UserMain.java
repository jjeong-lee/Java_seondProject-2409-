package chapter17;

import java.util.Scanner;

public class UserMain {

	// ����� �Է��� �ޱ� ���� Scanner ����
	private Scanner sc = new Scanner(System.in);
	// �����ͺ��̽� �۾��� ���� �ν��Ͻ� ����
	private UserDAO dao = new UserDAO();

	public static void main(String[] args) {

		
		UserMain main = new UserMain();
		main.start();
		
	}
	
	public void start() {
		while (true) {

	         System.out.println();
	         System.out.println("[���θ޴�] User");
	         System.out.println("------------------------------------------------------");
	         System.out.println("1. Create | 2. Read | 3. Delete | 4. Update | 5. Exit");
	         System.out.println("------------------------------------------------------");
	         System.out.print("�޴� ���� >> ");
	         int menu = Integer.parseInt(sc.nextLine());

	         switch (menu) {
	         case 1 -> userCreate();
	         case 2 -> userRead();
	         case 3 -> userDelete();
	         case 4 -> userUpdate();
	         case 5 -> System.exit(0);
	         }
			}
		}

		public void userRead() {
			System.out.print("�˻��� ���̵� �Է� >> ");
			String userid = sc.nextLine();
			UserDTO user = dao.select(userid);

			System.out.println();
			System.out.println("��ȸ ���");
			System.out.println("==============");
			System.out.println("�� ���̵� : " + user.getUserid());
			System.out.println("�� ��й�ȣ : " + user.getPassword());
			System.out.println("�� �̸��� : " + user.getEmail());
			System.out.println("�� �̸� : " + user.getName());
			System.out.println("�� ���� : " + user.getAge());
		}

		public void userCreate() {
		      
		      System.out.println();
		      System.out.println("[user �߰�]");
		      System.out.println("==============");
		      
		      // �� user�� �߰��ϱ� ���� ���� �Է¹ޱ�
		      UserDTO insertDto = new UserDTO();
		      System.out.print("�� ���̵� : ");
		      insertDto.setUserid(sc.nextLine());
		      System.out.print("�� ��й�ȣ : ");
		      insertDto.setPassword(sc.nextLine());
		      System.out.print("�� �̸��� : ");
		      insertDto.setEmail(sc.nextLine());
		      System.out.print("�� �̸� : ");
		      insertDto.setName(sc.nextLine());
		      System.out.print("�� ���� : ");   
		      insertDto.setAge(Integer.parseInt(sc.nextLine()));
		      System.out.println();
		      
		      int row = dao.insert(insertDto);   
		      System.out.println("====================");
		      
		      if(row > 0) {
		         System.out.printf("%s �� ��ϿϷ�\n",insertDto.getName());
		      }else {
		         System.out.printf("%s �� ��Ͻ���\n",insertDto.getName());
		      }      
		   }

		   public void userUpdate() {
		      System.out.println();
		      System.out.println("[user ����]");
		      System.out.println("==============");
		      
		      // user ������ �����ϱ� ���� ���� �Է¹ޱ�
		      UserDTO updateDto = new UserDTO();
		      System.out.print("�� ���̵� : ");
		      updateDto.setUserid(sc.nextLine());      
		      System.out.print("�� ���� �̸��� : ");
		      updateDto.setEmail(sc.nextLine());      
		      System.out.println();
		      
		      int row = dao.update(updateDto);   
		      System.out.println("================================");
		      
		      if(row > 0) {
		         System.out.printf("%s �� �̸����� ����Ǿ����ϴ�.\n",updateDto.getEmail());
		      }else {
		         System.out.printf("%s �� �̸����� ����Ǿ����ϴ�.\n",updateDto.getEmail());
		      }      
		   }

		   public void userDelete() {
		      System.out.println();
		      System.out.println("[user ����]");
		      System.out.println("==============");
		      
		      // user ������ �����ϱ� ���� ���� �Է¹ޱ�      
		      System.out.print("�� ���̵� : ");
		      String userid = sc.nextLine();      
		      System.out.print("�� ��й�ȣ : ");
		      String password = sc.nextLine();
		      System.out.println();
		      
		      int row = dao.delete(userid,password);   
		      System.out.println("================================");
		      
		      if(row > 0) {
		         System.out.printf("%s ���� �Ϸ�\n",userid);
		      }else {
		         System.out.printf("%s ���� �Ϸ�\n",userid);
		      }      
		
		   }
}
