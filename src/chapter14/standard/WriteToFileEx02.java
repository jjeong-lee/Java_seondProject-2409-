package chapter14.standard;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteToFileEx02 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���Ͽ� ������ ������ �Է��ϼ��� : ");
		String content = scan.nextLine();
		
		try(BufferedWriter writer =  new BufferedWriter(new FileWriter("output.txt"))) {
			writer.write(content);
			System.out.println("������ ���Ͽ� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ ���� ���� ���� �߻�: "+e.getMessage());
		}finally {
			scan.close();
		}
		
	}
}
