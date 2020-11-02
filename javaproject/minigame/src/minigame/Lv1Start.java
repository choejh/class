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
		System.out.println("15초안에 입력을 해주세요");

		for (int i = 0; i < 5; i++) {

			int A = (int) (Math.random() * 10);
			int B = (int) (Math.random() * 10);
			int C = (int) (Math.random() * 10);
			System.out.println((i + 1) + "번째 문제 입니다.");
			System.out.println(10 * A + B + "+" + C + "=");
			answer = sc.nextInt();
			
			if (10 * A + B + C == answer) {
				System.out.println("정답");
				win++;
				System.out.println("정답을 맞춘 횟수 = " + win);
			}

			else {
				System.out.println("틀렸습니다");
				lose++;
				System.out.println("틀린 횟수 = " + lose);

			}
			if (o.timeOverCheck) {
				break;
			}

		}
		o.gameOverCheck=true;

		if (lose + win < 5) {
			System.out.println("시간초과~~");
		}
		if (lose >= 3) {
			System.out.println("당신은 탈락하셨습니다.");

		}
		if (win >= 3) {
			System.out.println("Clear~!\n\n");
		}

	}
}
