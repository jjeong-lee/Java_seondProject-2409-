package chapter14.standard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterEx03 {
	
	public static void main(String[] args) {

		String filePath = "buffered_output.txt";
		String[] data = {"Hello, world!", "This is a test." , "Java I/O is interesting!"};
		
		//BufferedWriter�� ����Ͽ� ���Ͽ� �� ������ ������ ����
		
		try (BufferedWriter w = new BufferedWriter(new FileWriter(filePath))){
			for(String line : data) {
				w.write(line);
				w.newLine(); //�ٹٲ�
			}
			System.out.println("���Ͽ� �����Ͱ� ���������� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻�"+ e.getMessage());
		}
		
		//BufferedReader�� ����Ͽ� ���Ͽ��� ������ �б�
		System.out.println("==================================================");
		try(BufferedReader r = new BufferedReader(new FileReader(filePath))) {
			
			System.out.println("���� ����: ");
			for(String line : data) {
				r.readLine(); //�ٹٲ�
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
