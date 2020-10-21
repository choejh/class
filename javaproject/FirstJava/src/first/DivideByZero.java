//1021 예외
package first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num1=0, num2=0; //해줘야 오류 안난대 
		
		while(true) {
		try {
			System.out.println("두 개의 정수를 입력해주세요");
			System.out.println("숫자1 >>");
		 num1 = sc.nextInt();
			sc.nextLine();
			System.out.println("숫자2 >>");
		 num2 = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("올바른 메뉴를 선택하지 않았습니다.");
			System.out.println("다시 선택해주세요.");
			sc.nextLine();
			continue;
		}
			break;
		}
		
		
		try {
		System.out.println("나눗셈의 몫:"+(num1/num2));
		System.out.println("나눗셈의 나머지:"+(num1%num2));
		} catch(ArithmeticException e) { //보통 ex나 e 를 쓴다햇나?
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage()); //Throwable
		} 
		System.out.println("프로그램을 종료합니다.");
		
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	//	at first.DivideByZero.main(DivideByZero.java:15)
	
		
		
		}
}	
