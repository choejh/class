package fruit;

public class FruitSeller {
//Ŭ�������� ������ �޼��带 ����
//������ ����� ���� �޼��带 ����
	
	
	//����: �ν��Ͻ� ����, ��� ����
	//int applePrice = 1000; 		//����� ����
	final int APPLE_PRICE = 1000; 	//����� ����, ���� �Ұ�-�������
	int numOfApple = 20;			//����� ���� ����
	int myMoney = 0;				//���� �ݾ�
	
	//���: �Ǹ�, ���� ���
	//�Ǹ� �޼��� : 
	//		���� �ް� -> 
	//			��ȯ�ϴ� ����� ����, 
	//			���ͱ� ����, 
	//			������ ����� ������ ���� -> 
	//		��� ���� ��ȯ
	int saleApple(int money) {
		
		int num = 0;	//��ȯ�� ����� ����, ���������� �ݵ�� �ʱ�ȭ �ؾ��Ѵ�.
		
		// ��ȯ�� ����� ������ ���Ѵ�.
		num = money/APPLE_PRICE; // ���� �� / �������
		// ���ͱ� ����
		myMoney = myMoney+money;
		//����� ������ ����
		numOfApple = numOfApple - num;
		
		return num;
	}
	// ���� ���: ������ ����� ���� ���, ������ �ݾ� ���, 
	// �޴� �����Ͱ� �������� �Ű����� �������� �ʴ´�.
	// ��ȯ�ϴ� �����Ͱ� �����Ƿ� ��ȯŸ���� void�� �޼��� ����
	void showSaleResult() {
		System.out.println("���� ������ ����� ����: " + numOfApple);
		System.out.println("�Ǹ� ���� �ݾ�: " + myMoney);
	}

	
	
	
	
	
	
	
	
}

