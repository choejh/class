package minigame;

import java.util.Scanner;

public class Level2CCGame {

	public void explainGame() {
		int select=0;
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= �ȳ��ϼ���? ���ǵ� ��� ���ӿ� �����Ͻ� ���� ȯ���մϴ�. =========");
		System.out.println("|                 normal������ ���Ӽ����� ������ �����ϴ�.           |");
		System.out.println("|         normal������ �� �ڸ����� �� �ڸ� ���� ���� Ȥ�� �����մϴ�.      |");
		System.out.println("|         ���� ���, 12-3= ��� ������ ������ '9'�� �Է��Ͻø� �˴ϴ�.    |");
		System.out.println("|        �� 5���� �߿� 3������ ���߸� ���! 3���� �̻��� Ʋ���� �����մϴ�!   |");
		System.out.println("============================================================");
		System.out.println("���θ޴��� ���ư���-1 �����Ѵ�-2");
		select= sc.nextInt();
		switch(select) {
		case 1 : return;
		case 2 : System.out.println("������ �����մϴ�.");
		Over o = new Over();
		Lv2Start lv2 = new Lv2Start(o);
		CountDownThread cdt = null;
		cdt = new CountDownThread(o);
		cdt.start();
		lv2.playGame();
			
				
		}
		}
	}
}
	