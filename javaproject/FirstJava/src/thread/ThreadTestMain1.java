//1027 ������4
package thread;

import javax.swing.JOptionPane;

public class ThreadTestMain1 {
	
	//�ٸ� �����忡�� ������ ������ Ŭ���� ����
	public static boolean check = false;
	

	public static void main(String[] args) {
		
		InputAgeThread iat = new InputAgeThread();
		CountDownThread cdt = new CountDownThread();
		
		iat.start();
		cdt.start();
	
	
	}

}

class InputAgeThread extends Thread{

	@Override
	public void run() {
		System.out.println("10�ʾȿ� �Է��� ���ּ���");
		String age = JOptionPane.showInputDialog("���̸� �Է����ּ���");
		System.out.println("���� ���̴� "+age+"�� �Դϴ�.");
		ThreadTestMain1.check=true;
	}
	
}

class CountDownThread extends Thread{
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			if(ThreadTestMain1.check) {
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
