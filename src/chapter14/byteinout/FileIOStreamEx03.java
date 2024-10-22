package chapter14.byteinout;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStreamEx03 {

	public static void main(String[] args) {

		String data = "Hello, this is a test of FileInputStream and FileOutputStream.";
		String filePath = "IOStream.txt";
		
		
		//FileOutputStream�� ����Ͽ� ���Ͽ� ������ ����
		try (FileOutputStream out = new FileOutputStream(new File(filePath))){
			out.write(data.getBytes());
			System.out.println("���� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
			
		} catch (Exception e) {
			System.out.println("���� �Է� ����: "+e.getMessage());
		}
		System.out.println("=============================================");
		
		// FileInputStream�� ����Ͽ� ���Ͽ��� ������ �б�
		try (FileInputStream in = new FileInputStream(filePath)){
			System.out.println("���� �о����");
			int dataread;
	
			while((dataread=in.read()) != -1) {
				System.out.print((char)dataread);
			}
		} catch (Exception e) {
			System.out.println("���� �Է� ����: "+e.getMessage());
		}
		
		
	}
}
