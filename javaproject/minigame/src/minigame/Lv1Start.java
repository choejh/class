package minigame;

import java.util.Scanner;

public class Lv1Start {
	
	Over o;
	public Lv1Start(Over o) {
		this.o=o;
	}

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
			if (o.timeOverCheck) {
				break;
			}

		}
		o.gameOverCheck=true;

		if (lose + win < 5) {
			System.out.println("�ð��ʰ�~~");
		}
		if (lose >= 3) {
			System.out.println("����� Ż���ϼ̽��ϴ�.");

		}
		if (win >= 3) {
			System.out.println("Clear~!\n\n");
		}

	}
}
