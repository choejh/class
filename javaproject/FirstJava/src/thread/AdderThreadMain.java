//1027쓰래드 3-3
package thread;

public class AdderThreadMain {

	public static void main(String[] args) {
		
		Adderthread at1 = new Adderthread(1,50);
		Adderthread at2 = new Adderthread(50,100);
		
		//쓰레드 만들기
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		
		//
		try {
			t1.join();	//t1이 끝날때 까지 메인쓰레드와 t2쓰레드 (다른 쓰래드)를 대기시키는 메소드 
			t2.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
//		//잠깐 멈춰줘
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
		System.out.println("1~100 합은 : " + (at1.getNum() + at2.getNum()));
		
		

	}

}
