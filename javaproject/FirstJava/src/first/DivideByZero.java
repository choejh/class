//1021 ����
package first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num1=0, num2=0; //����� ���� �ȳ��� 
		
		while(true) {
		try {
			System.out.println("�� ���� ������ �Է����ּ���");
			System.out.println("����1 >>");
		 num1 = sc.nextInt();
			sc.nextLine();
			System.out.println("����2 >>");
		 num2 = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("�ùٸ� �޴��� �������� �ʾҽ��ϴ�.");
			System.out.println("�ٽ� �������ּ���.");
			sc.nextLine();
			continue;
		}
			break;
		}
		
		
		try {
		System.out.println("�������� ��:"+(num1/num2));
		System.out.println("�������� ������:"+(num1%num2));
		} catch(ArithmeticException e) { //���� ex�� e �� �����޳�?
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage()); //Throwable
		} 
		System.out.println("���α׷��� �����մϴ�.");
		
	//Exception in thread "main" java.lang.ArithmeticException: / by zero
	//	at first.DivideByZero.main(DivideByZero.java:15)
	
		
		
		}
}	
