package io;

import java.io.File;

public class FileMove {

	public static void main(String[] args) {
		// File Ŭ������ ��θ� �����Ѵ�.
		// ������ ���, ������ ���
		// ���� �Ǵ� ������ �Ӽ��� �����ϰų� ���� ������ ����
		
		// ���� �����ϴ� ������ ��θ� ����
		File myFile = new File("c:"+File.separator+"myJava"+File.separator+"my.bin");
		
		if(!myFile.exists()) {
			System.out.println("���� ������ �غ�Ǿ� ���� �ʽ��ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}
		System.out.println("���� ����!!");
		
		File reDir = new File("c:"+File.separator+"yourJava");
		reDir.mkdir();	// �ش� ��ο� ������ �����ϸ� �״�� ����, ������ ���� ����
		System.out.println("���� ���� ����!");
		
		// ������ �̵��� ���ο� ��� ����
		File reFile = new File(reDir, "your.bin");
		
		System.out.println("���� ���� ���� : "+reFile.exists());
		// ���� �̵�
		myFile.renameTo(reFile);
		
		if(reFile.exists()) {
			System.out.println("���� �̵� ����!!");
		} else {
			System.out.println("���� �̵� ����!!");
		}
		
		
		
			

	}

}