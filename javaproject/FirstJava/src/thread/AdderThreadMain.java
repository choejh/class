//1027������ 3-3
package thread;

public class AdderThreadMain {

	public static void main(String[] args) {
		
		Adderthread at1 = new Adderthread(1,50);
		Adderthread at2 = new Adderthread(50,100);
		
		//������ �����
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		
		//
		try {
			t1.join();	//t1�� ������ ���� ���ξ������ t2������ (�ٸ� ������)�� ����Ű�� �޼ҵ� 
			t2.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
//		//��� ������
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
		System.out.println("1~100 ���� : " + (at1.getNum() + at2.getNum()));
		
		

	}

}
