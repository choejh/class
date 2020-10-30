package ver05me;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PBManager manager = PBManager.getInstance();
		
		while(true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println(Menu.INSERT+".저장");
			System.out.println(Menu.SEARCH+".저장");		
			System.out.println(Menu.DELETE+".삭제");		
			System.out.println(Menu.DISPLAY_ALL+".모두보기");
			System.out.println(Menu.DISPLAY_BASIC+".기본보기");
			System.out.println(Menu.EXIT+".종료");		
			
			
			int select = sc.nextInt();
			
		if(!(select>0&&select<6)) {
			System.out.println("메뉴 선택이 올바르지 않습니다.");
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
				System.out.println("프로그램을 종료합니다.");
				return;
				
		}
		
		}
		
		
	}

}
