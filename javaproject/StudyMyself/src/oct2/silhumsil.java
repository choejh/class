package oct2;

import java.util.Scanner;

class silhumsil{ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("입력하실 메뉴를 고르세요.");
			System.out.println(".대학");
			System.out.println(".회사");
			System.out.println(".동호회");
			int select = sc.nextInt();
			
		if(!(select>0 && select<4)) {
			System.out.println("메뉴 선택이 올바르지 않습니다.");
			System.out.println("초기 메뉴로 돌아갑니다.");
			return;
	}
}
}	
