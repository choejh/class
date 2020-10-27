//1027 ������1
package thread;

//������ Ŭ���� ���Ǵ� Thread Ŭ������ ����ؼ� ����
public class ShowThread extends Thread {

	String threadName;
	
	public ShowThread(String name) {
		threadName = name;
	}
	
	@Override
	public void run() {
		// ���ο� ���� ȯ�濡�� ó���� �ڵ带 �ۼ�
		for(int i=0; i<100; i++) {
			System.out.println("�ȳ��ϼ���."+threadName+"�Դϴ�.");
			try {
				//Object Ŭ������ sleep(ms)�޼��� : ���� �����带 1/1000 �������� ���� ->100/1000 10����1�� //���  
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 

		}
		System.out.println(threadName+"�����尡 ����Ǿ����ϴ�.");
		
	}

}
