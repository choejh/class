package first;

public class ExceptionThrow {

	public static void main(String[] args) {

		try {
			// 프로그래머가 강제로 예외를 발생시킨다.
			// 1. 예외 클래스의 인스턴스를 생성한다.
			Exception e = new Exception("강제로 발생한 예외~!~!~!");
			// 2. 예외 발생 : throw 예외타입의 인스턴스 참조값
			throw e; //던진다.
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); //예외처리하지 않았을때 메시지를 알려줌

		}
		System.out.println("프로그램 종료입니다 정상적으로 처리되면 이 메시지가 나옵니다");
	}

}
