package minigame;

import java.util.Scanner;

public class Lv3Start {
	
	Over o;
	public Lv3Start(Over o) {
		this.o=o;
	}
	
	public void playGame() {

	
		Scanner sc = new Scanner(System.in);
		
		int answer=0;
		int win = 0;
		int lose = 0;
		
		System.out.println("15�ʾȿ� �Է��� ���ּ���");
	
		for(int i=0; i<5; i++) {
	
			int A=(int)(Math.random()*10);
			int B=(int)(Math.random()*10);
			int C=(int)(Math.random()*10);
			int D=(int)(Math.random()*10);
			System.out.println((i+1)+"��° ���� �Դϴ�.");
		
			
			if(i==3) {
			System.out.println((10*A+B)+"+"+(10*C+D)+"=");
			}
			else if (i%2==0) {
				System.out.println((10*A+B)+"x"+C+"=");
			}
			else if (i!=3&&i%2!=0){ 
				System.out.println((10*A+B)+"-"+(10*C+D)+"=");
			}
			answer = sc.nextInt();
			
			//���俩�� Ȯ��
			if(i==3&&(10*A+B)+(10*C+D)==answer) {
				System.out.println("�����Դϴ�~!");
				win++;
				System.out.println("������ ���� Ƚ�� = "+win);
			}
			else if (i%2==0&&((10*A+B)*C)==answer) {
				System.out.println("�����Դϴ�~!");
				win++;
				System.out.println("������ ���� Ƚ�� = "+win);
			}
			else if (i%2!=0&&i!=3&&((10*A+B)-(10*C+D))==answer) {
				System.out.println("�����Դϴ�~!");
				win++;
				System.out.println("������ ���� Ƚ�� = "+win);
			}
			
			else {System.out.println("Ʋ�Ƚ��ϴ�~!");
				lose++;
				System.out.println("Ʋ�� Ƚ��="+lose);
			}
			
			
			if (o.timeOverCheck) {
				break;
			}

		
			} //�ݺ��� ����
			
			o.gameOverCheck=true;
			
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
				System.out.println("\t���ǵ� ��� ���� LV3�� ����ϼ̽��ϴ�.\t");
				System.out.println("\t    ~����� ����� �����Դϴ�~\t\n");
				System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO\n");
			}

		}
	}

