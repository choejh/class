//1021
package first;

public class TryCatchFinally {

	public static void main(String[] args) {

		try {			//예외가 없어도 finally이후 문장이 나옴.
			System.out.println("try 블록에 진입");
		} catch (Exception e) {
			System.out.println("예외발생~!");
		} finally {
			System.out.println("try 구문에 진입하면 무조건 실행하는 finally 블록");
		}

		
		try {
			int num = 10/0;
		} catch (Exception e) {
			System.out.println("예외발생~!");
		} finally {
			System.out.println("try 구문에 진입하면 무조건 실행하는 finally 블록");
		}

		
		
	}

}
