//1027쓰래드 5-1
package thread;

public class AdderThread2 {
public static void main(String[] args) {
	
	Sum sum = new Sum();
	
	AdderThread1 t1 = new AdderThread1(sum, 1, 5000);
	AdderThread1 t2 = new AdderThread1(sum, 5001, 10000);
	
	t1.start();
	t2.start();
	
	try {
		t1.join();
		t2.join(); //이렇게 해도 값이 틀린데,, 동기화문제가 생긴거 sum에 동시접근 막는 syn~해줘야해 
//		Thread.sleep(1000); //제대로 안나와
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("1~100 까지의 합: "+sum.getNum());
	
}
}
