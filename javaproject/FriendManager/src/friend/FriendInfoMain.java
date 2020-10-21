package friend;

import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {
		
		FriendInforHandler handler = new FriendInforHandler(10);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("*** �޴� ���� ***");
			System.out.println(Menu.INSERT_HIGH+". ���� ģ�� ���� ����");
			System.out.println(Menu.INSERT_UNIV+". ���� ģ�� ���� ���� ");
			System.out.println(Menu.SHOW_ALL+". ��ü ���� ���");
			System.out.println(Menu.SHOW_BASIC+". �⺻ ���� ���");
			System.out.println(Menu.EXIT+". EXIT");
			System.out.println("�����ϼ���>>");
			int choice = sc.nextInt();
			switch(choice) { 
			case Menu.INSERT_HIGH: case Menu.INSERT_UNIV:	//10.20 ����
				handler.addFriend(choice);
				break;
			case Menu.SHOW_ALL: 
				handler.showAlldata();
				break;
			case Menu.SHOW_BASIC:
				handler.showAllSimpleData();
				break;
			case Menu.EXIT :	
				System.out.println("���α׷��� �����մϴ�.");
				return; // return�� ���� �޼��带 ����
			}
		}
		
	}

}