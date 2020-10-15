package fruit.ver02;

/*
 	�����̸� : FruitSeller.java
 	���� : ��� ����� ��ü�� ����
 	�ۼ��Ͻ� : 2020.10.08
 	�������� : fruit.FruitSeller.java�� ������� �����ڸ� �߰�
  
 */

public class FruitSeller {
//Ŭ�������� ������ �޼��带 ����
//������ ����� ���� �޼��带 ����
	
	//����:2020.10.08
	//	  ������ �ʱ�ȭ�� �����ڿ��� ó��, ���� ����ÿ� �ʱ�ȭ �ڵ� ����
	//����: �ν��Ͻ� ����, ��� ����
	//int applePrice = 1000; 		//����� ����
	final int APPLE_PRICE; 	//����� ����, ���� �Ұ�-�������
	private int numOfApple;			//����� ���� ����
	private int myMoney;				//���� �ݾ�
	
	//2020.10.08 ������ �߰�
	FruitSeller() {
		this(0,20,1000); //Ǫ���� ȣ�� ��Ʈ��Ű+���콺
	}
	
	FruitSeller(int money, int num, int price) {
		APPLE_PRICE=price;
		numOfApple=num;
		myMoney=money;
	}
	
	FruitSeller(FruitSeller seller){ //������
		//APPLE_PRICE = seller.APPLE_PRICE;
		//numOfApple = seller.numOfApple;
		//myMoney = seller.myMoney;
		this(seller.myMoney,seller.numOfApple, seller.APPLE_PRICE);
	}
	
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

	
	//�� ������ int�� ������ seller(�ν��Ͻ�). ���� �� �ȳ�����
	//void�� ������ seller. ���� �� ���´�.
	
	
	
	
	
	
	
}

