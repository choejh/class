package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StringReader {

	public static void main(String[] args) throws IOException {
		
		// ���ڱ�� �⺻ ��Ʈ�� �ν��Ͻ� ����
		Reader reader = new FileReader("timetable.txt");
		// ���� ��Ʈ�� BufferedReader�� �⺻ ��Ʈ�� �ʿ�
		BufferedReader in = new BufferedReader(reader);
		
		// ������ ���ڿ��� ���� ����
		String str = null;
		while(true) {
			// ������ �о� ���ڿ��� ��ȯ : ��ȯ�� ���ڿ��� ������ null ��ȯ
			str = in.readLine();
			if(str==null) {	// �����������̶�� : ���̻� ������ ���ڿ��� ����
				break;
			}
			str = str.replace(":", "��");
			System.out.println(str);
		}
		in.close();
	}
}