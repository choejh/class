package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedByteFileCopy {

	public static void main(String[] args) throws IOException {
		
		// �о�� ��� ������ InputStream �ν��Ͻ� ����
		InputStream in = new FileInputStream("org.pdf");
		// ��� ��� ������ OutputStream �ν��Ͻ� ����
		OutputStream out = new FileOutputStream("org_copy.pdf"); 
		// �ش� ����� ������ �������� ������ ������ �����ؼ� write
		// �ش� ��ο� ������ �����ϸ� �����.
		
		// ���ͽ�Ʈ�� �ν��Ͻ� ����
		BufferedInputStream bin = new BufferedInputStream(in, 1024);
		BufferedOutputStream bout = new BufferedOutputStream(out, 1024);
		
		int copyByte=0;	// ������ ������ 
		int bData=0;	// �������� ������ byte �������� ������
		
		//byte[] buf = new byte[1024];	// 1kb ���� ����
		//int readLength = 0;
		
		System.out.println("���縦 �����մϴ�.");
		
		while(true) {
			bData = in.read();
			//readLength = in.read(buf);	// ���̻� ������ �����Ͱ� ������ -1�� ��ȯ
			
			if(bData==-1) {
			//if(readLength==-1) {	
				break;
			}
			out.write(bData);	// ��� : ���Ͽ� �����͸� �ڵ带 ����.
			//out.write(buf,0,readLength);
			//copyByte += readLength;
			copyByte++;
		}
		
		in.close();// ��Ʈ�� �ν��Ͻ� �Ҹ�
		out.close();
		
		System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");
		System.out.println("����� ������ : " + copyByte +"byte");

	}

}
