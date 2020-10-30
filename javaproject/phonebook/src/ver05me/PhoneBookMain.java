package ver05me;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PBManager manager = PBManager.getInstance();
		
		while(true) {
			System.out.println("�޴��� �Է��ϼ���.");
			System.out.println(Menu.INSERT+".����");
			System.out.println(Menu.SEARCH+".����");		
			System.out.println(Menu.DELETE+".����");		
			System.out.println(Menu.DISPLAY_ALL+".��κ���");
			System.out.println(Menu.DISPLAY_BASIC+".�⺻����");
			System.out.println(Menu.EXIT+".����");		
			
			
			int select = sc.nextInt();
			
		if(!(select>0&&select<6)) {
			System.out.println("�޴� ������ �ùٸ��� �ʽ��ϴ�.");
			continue;
		}
		switch(select){
			case Menu.INSERT:
				manager.insertInfo();
				break;
				
			case Menu.DISPLAY_ALL:
				manager.showAllInfor();
				
			case Menu.DISPLAY_BASIC:
				manager.showBasic();
				
			case Menu.DELETE:
				manager.deleteInfor();
				
			case Menu.SEARCH:
				manager.searchInfor();
			case Menu.EXIT:
				System.out.println("���α׷��� �����մϴ�.");
				return;
				
		}
		
		}
		
		
	}

}
