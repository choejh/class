package first;

public class ExceptionThrow {

	public static void main(String[] args) {

		try {
			// ���α׷��Ӱ� ������ ���ܸ� �߻���Ų��.
			// 1. ���� Ŭ������ �ν��Ͻ��� �����Ѵ�.
			Exception e = new Exception("������ �߻��� ����~!~!~!");
			// 2. ���� �߻� : throw ����Ÿ���� �ν��Ͻ� ������
			throw e; //������.
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); //����ó������ �ʾ����� �޽����� �˷���

		}
		System.out.println("���α׷� �����Դϴ� ���������� ó���Ǹ� �� �޽����� ���ɴϴ�");
	}

}
