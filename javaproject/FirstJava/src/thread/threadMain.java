//1027 ������1-1�� / ������1-2��
package thread;

public class threadMain {
public static void main(String[] args) {
	

	//Thread ����
	ShowThread st1 = new ShowThread("1�� ������");
	ShowThread st2 = new ShowThread("2�� ������");
	
	
	// Runnable �������̽� �̿��� Thread
	Runnable target = new ShowRunnable ();
	Thread st3 = new Thread(target);

	//�켱 ���� ���� 1~10 : �⺻ 5
	System.out.println(Thread.MAX_PRIORITY);
	System.out.println(Thread.MIN_PRIORITY);
	st1.setPriority(Thread.MAX_PRIORITY);
	st2.setPriority(Thread.MIN_PRIORITY);
	
	
	st1.start();
	st2.start();
	st3.start();

//	for(int i=0; i<100; i++) {
//		System.out.println("�ȳ��ϼ��� ���ξ����� �Դϴ�.");
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}//100/1000��
//	}
//
//	System.out.println("���ξ����尡 ����Ǿ����ϴ�.");
}
}