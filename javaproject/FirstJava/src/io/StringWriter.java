package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {

	public static void main(String[] args) throws IOException {
		
		// �⺻ ���� ��Ʈ�� 
		Writer writer = new FileWriter("String.txt");
		// ���� ��Ʈ�� : BufferedWriter �⺻ ��Ʈ�� Writer�� �ʿ�
		BufferedWriter out = new BufferedWriter(writer);
		
		out.write("����� - �޽ø� ���߰� �ϴµ� �����ϰڽ��ϴ�.");
		out.newLine();// ���ο� �࿡�� ���ڿ��� ���ڴ�.
		out.write("�ý����� ���� �ְ��.");
		out.newLine();
		out.newLine();
		out.write("����Է� �Ϸ�");
		
		// ��Ʈ�� �ݱ�
		out.close();
		
		System.out.println("����ۼ� �Ϸ�");

	}

}