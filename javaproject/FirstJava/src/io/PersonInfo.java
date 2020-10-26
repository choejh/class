package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersonInfo implements Serializable {

	String name;
	transient String secretInfo;
	int age;
	transient int secretNum;

	public PersonInfo(String name, String secretInfo, int age, int secretNum) {
		this.name = name;
		this.secretInfo = secretInfo;
		this.age = age;
		this.secretNum = secretNum;
	}
	
	public void showinfo() {
		System.out.println("name : " + name);
		System.out.println("secretInfo : " + secretInfo);
		System.out.println("age : " + age);
		System.out.println("secret Number : " + secretNum);
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// �ν��Ͻ� ���� ��Ʈ�� ����
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("PersonInfo.ser"));
		
		PersonInfo info = new PersonInfo("�����", "010-9999-8888", 30, 20);
		info.showinfo();
		
		// �ν��Ͻ� ����
		out.writeObject(info);
		out.close();
		
		// �ν��Ͻ� ���� ������ ���� ��Ʈ�� ����
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Personinfo.ser"));
		
		// ����
		PersonInfo reInfo = (PersonInfo) in.readObject();
		
		// ������ �ν��Ͻ��� ���� ���
		reInfo.showinfo();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}