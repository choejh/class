//1020 쓰레드2
package thread;

public class ShowRunnable implements Runnable {
//쓰레드 클래스 정의할 때 상속이 필요한 경우  Runnable 인터페이스를 구현해서 쓰래드를 생성할 수 있다.
	@Override
	public void run() {
		// 새로운 실행 환경에서 처리할 코드를 작성
		for(int i=0; i<100; i++) {
			System.out.println("안녕하세요.Runnable입니다.");
			try {
				//Object 클래스의 sleep(ms)메서드 : 현재 쓰래드를 1/1000 간격으로 멈춤 ->100/1000 10분의1초 //잠금  
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 

		}
		System.out.println("Runnable 쓰래드가 종료되었습니다.");
			
	}
	

}
