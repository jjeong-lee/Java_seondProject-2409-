package chapter14.byteinout;

import java.io.FileOutputStream;

public class FileOutputStreamEx01 {

	
	public static void main(String[] args) {

		// ���� ��� ����
		String filePath = "outputstream.txt";
		String data = "Hello, this is a test of FileOutputStream.";

		// FileOutputStream �� ����Ͽ� ���Ͽ� ������ ����
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			// ���ڿ� �����͸� ����Ʈ �迭�� ��ȯ�Ͽ� ���Ͽ� ����
			fos.write(data.getBytes());
			System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("������ ���� ���� ���� �߻�: " + e.getMessage());
		}

	}

}
