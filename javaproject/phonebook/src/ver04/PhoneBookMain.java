package ver04;

import java.util.Scanner;

import ver03.Util;


public class PhoneBookMain {
	public static void main(String[] args) {
		
	PhoneBookManager bookManager = new PhoneBookManager(10);
	
	Scanner sc = new Scanner(System.in);	
	
	
	while(true) {
		System.out.println("*** �޴� ���� ***");
		System.out.println("1. ����ó �Է��ϱ�");
		System.out.println("2. ��ü����");
		System.out.println("3. ���� �˻��ϱ�");
		System.out.println("4. ���� �����ϱ�");
		System.out.println("5. EXIT");
		System.out.println("�����ϼ���>>");
		int choice = sc.nextInt();
		A:
		switch(choice) { 
		case 1:
			while(true) {
			System.out.println("1. �Ϲ� ����ó �Է��ϱ�");
			System.out.println("2. ���� ����ó �Է��ϱ�");
			System.out.println("3. ȸ�� ����ó �Է��ϱ�");
			System.out.println("4. ���� ����ó �Է��ϱ�");
			System.out.println("5. ���� �޴��� ����.");
			System.out.println("�����ϼ��� >> ");
			int choice2 = sc.nextInt();
				switch(choice2) { 
				case 1: case 2: case 3: case 4:
					bookManager.addPhone(choice2);
					break;
				case 5:
					break A;
				}
			}
		case 2:
			bookManager.showInfor();
			break;
		case 3:
			bookManager.searchMember();
			break;
		case 4:
			bookManager.deleteMember();
			break;
		case 5:	
			System.out.println("���α׷��� �����մϴ�.");
			return; // return�� ���� �޼��带 ����
		}
	}
	

	
}

}
