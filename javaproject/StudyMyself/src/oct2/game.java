package oct2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class game {
	
	public static boolean check = false;
	
	public static void main(String[] args) {
		
		CountDownThread cdt = new CountDownThread();
		cdt.start();
		
		Scanner sc = new Scanner(System.in);
		int answer=0;
		int dab = 0;
		for(int i=0; i<10; i++) {
		System.out.println("10�ʾȿ� �Է��� ���ּ���");

		int A=(int)(Math.random()*10);
		int B=(int)(Math.random()*10);
		int C=(int)(Math.random()*10);
		System.out.println(10*A+B+"+"+C+"=");
		answer = sc.nextInt();
		dab=(10*A+B+C);
		if(10*A+B+C==answer) {
			System.out.println("����");	
			}
	
		else {
			System.out.println("����� Ż���Դϴ�.");
		}
		
		}
		for(int i=5; i>0; i--) {
			
		if(dab==answer) {
			break;
			}
		System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

		System.exit(0);
		
		
		
	}
	
}


class CountDownThread extends Thread{
	
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			if(game.check) {
				break;
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.exit(0);
		
	}
}

