package first;

public class StringTest {

	public static void main(String[] args) {
	
		String str1 = "My String";
		String str2 = "My String";
		String str3 = "Yout String";
		String str4 = new String("My String");
		//�������� ���� ���� �� : ���� �ν��Ͻ��� �����Ѵ�.
		if(str1==str2) {
			System.out.println("���� �ν��Ͻ��� ����");
		} else {
			System.out.println("�ٸ� �ν��Ͻ��� ����");
		}
		if(str1==str3) {
			System.out.println("���� �ν��Ͻ��� ����");
		} else {
			System.out.println("�ٸ� �ν��Ͻ��� ����");
		}
		if(str1==str4) {
			System.out.println("���� �ν��Ͻ��� ����");
		} else {
			System.out.println("�ٸ� �ν��Ͻ��� ����");
		}
	
		System.out.println(str1.equals(str4)); //���ڿ� ���Ҷ� ������ equals���
		
		
	}

}
