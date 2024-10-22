package chapter14.charinout;

import java.io.Reader;
import java.io.StringReader;

public class ReaderEx01 {

	public static void main(String[] args) {
		
		String text = "Hello, this is a test string.";
        Reader reader = new StringReader(text);  //���ڿ��� �б� ���� Reader ����
        
        try {
        	int data;
        	
        	while((data = reader.read())!=-1) { //�ѹ��ھ� �б�
        		System.out.print((char)data); //�������� ���
        	}
			
		} catch (Exception e) {
			System.err.println("�б� �� ���� �߻�: " + e.getMessage());
		}finally {
			try {
				reader.close();
			} catch (Exception e) {
				System.err.println("�ݱ� �� ���� �߻�: " + e.getMessage());
			}
		}
        
	}
}
