package first;

public class Singleton {

	
	//�̱��� ����: �ν��Ͻ��� ������ �ѹ��� �ϵ��� ó���ϴ� �ڵ� �ۼ� ��Ÿ��
	//�̱����� �ʿ��� Ŭ����: ��ɸ� �ִ� �޼����� ��� �������� �ν��Ͻ��� ������ �ʿ䰡 ����.
	//		��ɸ� ���� Ŭ������ ��� �̱��� ������ ���
	
	//1. �ܺ� �ν��Ͻ����� �ν��Ͻ��� �������� ���ϵ��� ó�� : �����ڿ� private ���������� ���
	private Singleton () {
		
	}
	//2. ����� �ν��Ͻ��� Ŭ���� ���ο��� ����
	private static Singleton s = new Singleton(); //Singleton.s=null;
	
	//3. �ܺο��� ������� �������� ����� �� �ֵ��� �������� �����ϴ� �޼��� �ʿ�
	public static Singleton getInstance () {
		if(s==null) {
			s= new Singleton();
		}
		return s;

	}
	
}
