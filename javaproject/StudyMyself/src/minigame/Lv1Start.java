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
			System.out.println("\n\n\t    시간초과로 탈락하셨습니다\t\n\n");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
		}
		else if (lose >= 3) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("\n\n\t3개 이상 틀렸네요 당신은 탈락입니다\t\n\n");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");

		}
		else if (win >= 3) {
			System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
			System.out.println("\n\t\t~Clear~\t\t");
			System.out.println("\t스피드 계산 게임 LV1을 통과하셨습니다.\t");
			System.out.println("\t스피드 계산 게임 LV2에 도전해보세요^^.\t\n");
			System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO\n");
		}

	}
}
