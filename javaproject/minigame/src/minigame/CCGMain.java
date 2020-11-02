package minigame;

import java.util.Scanner;

public class CCGMain {
	public static void main(String[] args) {
		int select=0;
		while(true) {

		Scanner sc = new Scanner(System.in);
		System.out.println("게임 난이도를 선택하세요.");
		System.out.println("1.easy  ★ \n2.normal★★ \n3.hard  ★★★");
		select=sc.nextInt();
			switch(select) {
			case 1 :	Level1CCGame lv1 = new Level1CCGame();
						lv1.explainGame();
						break;
					
			case 2 :  	Level2CCGame lv2 = new Level2CCGame();
						lv2.explainGame();
						break;
				
			case 3 :	Level3CCGame lv3 = new Level3CCGame();
						lv3.explainGame();
						break;
			
		}
	}
}
}