//1021
package first;

public class TryCatchFinally {

	public static void main(String[] args) {

		try {			//���ܰ� ��� finally���� ������ ����.
			System.out.println("try ��Ͽ� ����");
		} catch (Exception e) {
			System.out.println("���ܹ߻�~!");
		} finally {
			System.out.println("try ������ �����ϸ� ������ �����ϴ� finally ���");
		}

		
		try {
			int num = 10/0;
		} catch (Exception e) {
			System.out.println("���ܹ߻�~!");
		} finally {
			System.out.println("try ������ �����ϸ� ������ �����ϴ� finally ���");
		}

		
		
	}

}
