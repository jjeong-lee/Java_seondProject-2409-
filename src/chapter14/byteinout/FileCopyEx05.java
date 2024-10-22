package chapter14.byteinout;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx05 {

	public static void main(String[] args) {

		String sourceFilePath = "source.txt"; // ������ ���� ���� ���
		String destFilePathWithoutBuffer = "dest_without_buffer.txt"; // ���� ���� ������ ���� ���
		String destFilePathWithBuffer = "dest_with_buffer.txt"; // ���۸� ����Ͽ� ������ ���� ���

		// ���� ���� ���� �ڵ�(10MB�� ������ ����)
		createTestFile(sourceFilePath, 1024 * 1024 * 10); // 10M ������ ����

		// ���۸� ������� �ʰ� ���� ����
		long startTime = System.nanoTime(); // ���� ����
		copyWithoutBuffer(sourceFilePath, destFilePathWithoutBuffer); // ������
		long endTime = System.nanoTime(); // ���� ��
		long durationWithoutBuffer = endTime - startTime;
		System.out.println("���۾��� ���� �ҿ� �ð� : " + durationWithoutBuffer / 1_000_000 + "ms");

		// ���۸� ����Ͽ� ���� ����
		startTime = System.nanoTime(); // ���� ����
		copyWithBuffer(sourceFilePath, destFilePathWithBuffer); // ������
		endTime = System.nanoTime(); // ���� ��
		long durationWithBuffer = endTime - startTime;
		System.out.println("���� ����Ͽ� ���� �ҿ� �ð� : " + durationWithBuffer / 1_000_000 + "ms");
	}

	// ���� ���� ����(createTestFile)�޼��� ����
	public static void createTestFile(String filePath, int sizeInByte) {

		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
			byte[] data = new byte[sizeInByte];
			bos.write(data);
		} catch (Exception e) {
			System.out.println("���� ���� �� ���� �߻�: " + e.getMessage());
		}
	}// createTestFile

	// ���� ���� ���� ����
	public static void copyWithoutBuffer(String source, String dest) {
		try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(dest)) {

			int bytesData;
			// �������Ͽ��� �����͸� �о� ���� ���Ͽ� ����
			while ((bytesData = fis.read()) != -1) {
				fos.write(bytesData);
			}
			System.out.println("������ ���������� ���� �Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("���� ���� �� ���� �߻�: " + e.getMessage());
		}
	}// copyWithoutBuffer

	// ���� ����Ͽ� ���� ����
	public static void copyWithBuffer(String source, String dest) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

			// BufferedInputStream ���� �뷮���� ����
			byte[] buffer = new byte[1024]; // 1kb ����
			int bytesData;
			// �������Ͽ��� �����͸� �о� ���� ���Ͽ� ����
			while ((bytesData = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesData);
			}
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("���� ���� �� ���� �߻�: " + e.getMessage());
		}
	}// copyWithBuffer

}// class
