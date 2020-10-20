package friend;

import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {
		
		FriendInforHandler handler = new FriendInforHandler(10);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println(Menu.INSERT_HIGH+". 고교 친구 정보 저장");
			System.out.println(Menu.INSERT_UNIV+". 대학 친구 정보 저장 ");
			System.out.println(Menu.SHOW_ALL+". 전체 정보 출력");
			System.out.println(Menu.SHOW_BASIC+". 기본 정보 출력");
			System.out.println(Menu.EXIT+". EXIT");
			System.out.println("선택하세오>>");
			int choice = sc.nextInt();
			switch(choice) { 
			case Menu.INSERT_HIGH: case Menu.INSERT_UNIV:	//10.20 수정
				handler.addFriend(choice);
				break;
			case Menu.SHOW_ALL: 
				handler.showAlldata();
				break;
			case Menu.SHOW_BASIC:
				handler.showAllSimpleData();
				break;
			case Menu.EXIT :	
				System.out.println("프로그램을 종료합니다.");
				return; // return은 메인 메서드를 종료
			}
		}
		
	}

}
