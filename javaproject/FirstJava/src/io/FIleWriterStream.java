package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FIleWriterStream {

	public static void main(String[] args) throws IOException {
		
		Writer out = new FileWriter ("paper.txt");

		//out.write('A');  // char -> int �ڵ�����ȯ
		//out.write('B');
		out.append('C');
		out.append('D');
		
		out.close();
		System.out.println("������ �����Ǿ����ϴ�.");
	}

}