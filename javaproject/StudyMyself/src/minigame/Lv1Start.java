package minigame;

import java.util.Scanner;

public class Lv1Start {
//	public static boolean timeover=false;
//	public static boolean gameover=false;
	
//	Over o;
//	public Lv1Start(Over o) {
//		this.o=o;
//	}
	CountDownThread CDT = new CountDownThread ();
	public void playGame() {
		
		
		Scanner sc = new Scanner(System.in);

		int answer = 0;
		int win = 0;
		int lose = 0;
		System.out.println("15�ʾȿ� �Է��� ���ּ���");

		for (int i = 0; i < 5; i++) {
			
			int A = (int) (Math.random() * 10);
			int B = (int) (Math.random() * 10);
			int C = (int) (Math.random() * 10);
			System.out.println((i + 1) + "��° ���� �Դϴ�.");
			System.out.println(10 * A + B + "+" + C + "=");

			answer = sc.nextInt();
			
			if (10 * A + B + C == answer) {
				System.out.println("����");
				win++;
				System.out.println("������ ���� Ƚ�� = " + win);
			}

			else {
				System.out.println("Ʋ�Ƚ��ϴ�");
				lose++;
				System.out.println("Ʋ�� Ƚ�� = " + lose);

			}
			if(CDT.timeOver) {
				break;
			}
//			if (o.timeOverCheck) {
//				break;
//			}
		}
		CDT.gameOver=true;
//		o.gameOverCheck=true;

		if (lose + win < 5&&win<3) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("\n\n\t    �ð��ʰ��� Ż���ϼ̽��ϴ�\t\n\n");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
		}
		else if (lose >= 3) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("\n\n\t3�� �̻� Ʋ�ȳ׿� ����� Ż���Դϴ�\t\n\n");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");

		}
		else if (win >= 3) {
			System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
			System.out.println("\n\t\t~Clear~\t\t");
			System.out.println("\t���ǵ� ��� ���� LV1�� ����ϼ̽��ϴ�.\t");
			System.out.println("\t���ǵ� ��� ���� LV2�� �����غ�����^^.\t\n");
			System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO\n");
		}

	}
}
