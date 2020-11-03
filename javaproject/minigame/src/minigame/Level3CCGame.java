package minigame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Level3CCGame {

	public void explainGame() {
		int select=0;
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= �ȳ��ϼ���? ���ǵ� ��� ���ӿ� �����Ͻ� ���� ȯ���մϴ�. =========");
		System.out.println("                  hard������ ���Ӽ����� ������ �����ϴ�.            ");
		System.out.println("   hard������ �� �ڸ����� �� �ڸ��� Ȥ�� �� �ڸ����� ���� Ȥ�� ����,�����մϴ�    ");
		System.out.println("         ���� ���, 12*3= ��� ������ ������ '36'�� �Է��Ͻø� �˴ϴ�.   ");
		System.out.println("        �� 5���� �߿� 3������ ���߸� ���! 3���� �̻��� Ʋ���� Ż���մϴ�!   ");
		System.out.println("============================================================");
		System.out.println("���θ޴��� ���ư���-1 �����Ѵ�-2");
		
		try {
			select= sc.nextInt();
			if(!(select>0 && select<3)) {
				BadInputException e = new BadInputException(String.valueOf(select));
				throw e;
				}
			} catch(InputMismatchException | BadInputException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
				sc.nextLine();
				continue;
			}
		
		switch(select) {
		case 1 : return;
		case 2 : System.out.println("������ �����մϴ�.");
				Over o = new Over();
				Lv3Start lv3 = new Lv3Start(o);
				CountDownThread cdt = null;
				cdt = new CountDownThread(o);
				cdt.start();
				lv3.playGame();
			
			
	
		}
		}
	}
}