package ver03;

import java.util.Scanner;

public class PhoneBookMain {
	public static void main(String[] args) {
	//���ϸŴ��� �ν��Ͻ� ����, �迭�� �޼��� ���
	PhoneBookManager manager = new PhoneBookManager()	;
	System.out.println("���� ����� ����������:"+manager.cnt);
	System.out.println("������ ������ ������ �� ����: "+manager.phoneBook.length);
//0,100��
	
	//Scanner sc = new Scanner(System.in);
	
	while(true) {
		
		System.out.println("��ȭ��ȣ ���� ���α׷�==========");
		System.out.println("�޴��� �Է��ϼ���");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� �˻�");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� ��ü����");
		System.out.println("5. ���α׷� ����");
		System.out.println("========================");
		
		char insertMenu = Util.SC.nextLine().charAt(0);
		
		switch(insertMenu) {
			case '1':
				manager.insertMember();
				break;
			case '2':
				manager.searchMember();
				break;
			case '3':
				manager.deleteMember();
				break;
			case '4':
				manager.displayAll();
				break;
			case '5':
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;
		}
		
		//���� ���� ��� �޼��� ȣ��
		//manager.insertMember();
		
		//System.out.println("������ ������ ������ �� ����: "+manager.cnt);
		//manager.phoneBook[0].showInfor();

		//���� �˻� �޼��� ȣ��
		//manager.searchMember();		
	}
	

	}
}
