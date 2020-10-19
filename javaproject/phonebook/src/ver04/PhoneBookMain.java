package ver04;

import java.util.Scanner;

import ver03.Util;


public class PhoneBookMain {
	public static void main(String[] args) {
		
	PhoneBookManager bookManager = new PhoneBookManager(10);
	
	Scanner sc = new Scanner(System.in);	
	
	
	while(true) {
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 연락처 입력하기");
		System.out.println("2. 전체보기");
		System.out.println("3. 정보 검색하기");
		System.out.println("4. 정보 삭제하기");
		System.out.println("5. EXIT");
		System.out.println("선택하세오>>");
		int choice = sc.nextInt();
		A:
		switch(choice) { 
		case 1:
			while(true) {
			System.out.println("1. 일반 연락처 입력하기");
			System.out.println("2. 대학 연락처 입력하기");
			System.out.println("3. 회사 연락처 입력하기");
			System.out.println("4. 가족 연락처 입력하기");
			System.out.println("5. 이전 메뉴로 가기.");
			System.out.println("선택하세요 >> ");
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
			System.out.println("프로그램을 종료합니다.");
			return; // return은 메인 메서드를 종료
		}
	}
	

	
}

}
