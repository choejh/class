package friend;

import java.util.InputMismatchException;
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
		
		int choice = 0;
////////여기서 새로운 catch를 배웠다. 
		try {
			choice = sc.nextInt();
		if(!(choice>=Menu.INSERT_HIGH && choice<=Menu.EXIT)) {
			//예외
			BadMenuException e = new BadMenuException("잘못된 메뉴 입력");
			throw e;
		}
		} catch(InputMismatchException | BadMenuException e) {
			System.out.println("잘몬된 메뉴를 입력하셧습니다. \n다시 선택해주세요.");
		}
		
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
