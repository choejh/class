package friend;

import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {
		
		FriendInforHandler handler = new FriendInforHandler(10);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. �� ģ�� ���� ����");
			System.out.println("2. ���� ģ�� ���� ���� ");
			System.out.println("3. ��ü ���� ���");
			System.out.println("4. �⺻ ���� ���");
			System.out.println("5. EXIT");
			System.out.println("�����ϼ���>>");
			int choice = sc.nextInt();
			switch(choice) { 
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3: 
				handler.showAlldata();
				break;
			case 4:
				handler.showAllSimpleData();
				break;
			case 5 :	
				System.out.println("���α׷��� �����մϴ�.");
				return; // return�� ���� �޼��带 ����
			}
		}
		
	}

}
