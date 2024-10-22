package chapter08;

import java.util.Scanner;

public class Tour {
//이게되네 조 tour 파일 보면 메소드로 만들어서 바로 호출하는 예시가 있음. 참고.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int n = Integer.parseInt(scan.nextLine());// 3

		// 초기화를 통해서 메모리 확보 및 고객생성(Guide의 객체)
		Guide guide = new Guide(n);

		// 관광객 등록
		System.out.println("==============================");
		System.out.println("관광객 등록");

		for (int i = 0; i < n; i++) {

			System.out.print((i+1)+". 이름: ");
			guide.guest[i].setName(scan.nextLine());

			System.out.print((i+1)+". 성별 : ");
			guide.guest[i].setGender(scan.nextLine());
		}

		boolean run = true;
		while (run) {
			System.out.println("================================");
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int select = Integer.parseInt(scan.nextLine());

			switch (select) {
			case 1:
				for (int i = 0; i < n; i++) {
					System.out.println("===관광객 정보===");
					System.out.println((i+1)+". 이름: " + guide.guest[i].getName());
					System.out.println((i+1)+". 성별: " + guide.guest[i].getGender());
					System.out.println((i+1)+". 목적지: " + guide.getPoint());
				}
				break;
			case 2:
				System.out.println("어디로 변경하시겠습니까?");
				Guide.point = scan.nextLine();
				System.out.println(Guide.point + "로 목적지 변경");
				break;
			case 3:
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("잘못된 입력 값입니다. 다시 입력하세요.");
				break;
			}// switch

		} // while

	}

}
