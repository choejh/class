//1020 ������2
package thread;

public class ShowRunnable implements Runnable {
//������ Ŭ���� ������ �� ����� �ʿ��� ���  Runnable �������̽��� �����ؼ� �����带 ������ �� �ִ�.
	@Override
	public void run() {
		// ���ο� ���� ȯ�濡�� ó���� �ڵ带 �ۼ�
		for(int i=0; i<100; i++) {
			System.out.println("�ȳ��ϼ���.Runnable�Դϴ�.");
			try {
				//Object Ŭ������ sleep(ms)�޼��� : ���� �����带 1/1000 �������� ���� ->100/1000 10����1�� //���  
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 

		}
		System.out.println("Runnable �����尡 ����Ǿ����ϴ�.");
			
	}
	

}
