package chapter08;

import java.util.Scanner;

public class Tour {
//�̰Եǳ� �� tour ���� ���� �޼ҵ�� ���� �ٷ� ȣ���ϴ� ���ð� ����. ����.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �� : ");
		int n = Integer.parseInt(scan.nextLine());// 3

		// �ʱ�ȭ�� ���ؼ� �޸� Ȯ�� �� ������(Guide�� ��ü)
		Guide guide = new Guide(n);

		// ������ ���
		System.out.println("==============================");
		System.out.println("������ ���");

		for (int i = 0; i < n; i++) {

			System.out.print((i+1)+". �̸�: ");
			guide.guest[i].setName(scan.nextLine());

			System.out.print((i+1)+". ���� : ");
			guide.guest[i].setGender(scan.nextLine());
		}

		boolean run = true;
		while (run) {
			System.out.println("================================");
			System.out.println("1. ������ ����");
			System.out.println("2. ������ ����");
			System.out.println("3. ����");
			System.out.print("���� >> ");
			int select = Integer.parseInt(scan.nextLine());

			switch (select) {
			case 1:
				for (int i = 0; i < n; i++) {
					System.out.println("===������ ����===");
					System.out.println((i+1)+". �̸�: " + guide.guest[i].getName());
					System.out.println((i+1)+". ����: " + guide.guest[i].getGender());
					System.out.println((i+1)+". ������: " + guide.getPoint());
				}
				break;
			case 2:
				System.out.println("���� �����Ͻðڽ��ϱ�?");
				Guide.point = scan.nextLine();
				System.out.println(Guide.point + "�� ������ ����");
				break;
			case 3:
				System.out.println("����");
				run = false;
				break;
			default:
				System.out.println("�߸��� �Է� ���Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			}// switch

		} // while

	}

}
