package first;

public class MyMath {

	//���� ����
	int num=10;
	
	//���� 2���� �޾� ���� ������ �ϰ� �� ����� ��ȯ�ϴ� �޼���
	long add(long n1, long n2) {
		
		long result = n1 + n2;
		
		return result;
		
	}
	
	void sayHello() {
		System.out.println("�ȳ��ϼ��� ������");
	}
	
	//���� �ΰ��� �޾Ƽ� ������ ����� ����ϴ� �޼���
	void plus(int num1, int num2) {
		int result = num1 +num2;
		System.out.println(result);
	}
	
	boolean check() {
		
		boolean result = num>5;
		
		return result;
	}
	
	//���� �ΰ��� �޾Ƽ� �������� ����� ����ϴ� �޼���
	void div(int num1,int num2) {
		if(num2==0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return;
		}
		System.out.println("�������� ��� : " + num1/num2);
	
	}
	

	
}
