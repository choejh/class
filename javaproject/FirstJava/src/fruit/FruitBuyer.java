package fruit;

public class FruitBuyer {

	//������ �޼��� ����
	//�������� ���� �ݾ�, ������ ����� ����
	int myMoney = 5000;		//�������� ���� �ݾ�
	int numOfapple = 0;		//������ ����� ����
	
	//���: ��� ����, ���� ����(�ݾ�, ����� ����) ���� ���
	//����� ����
	//�Ǹ��� ����(��ü)�� �ݾ��� �޾�
	//�Ǹ����� �Ǹ� �޼��� ȣ�� > �����ϴ� ����� ������ ��´�. 
	//���� ����� ������ ����
	//���� ���� �ݾ��� ����
	
	//���������� ��ü�� �ּҸ� �����ϰ� �ִ� - ������ �������� �޵��� ���������� �Ű������� ����
	//FruifSeller seller-> FruifSellerŬ������ ���� ��ü�� �ּҸ� �����ϴ� ����
	void buyApple(FruitSeller seller, int money) {
		
	 //������ ����� ������ ���Ѵ�.
	int num = seller.saleApple(money);
	 //���� ����� ������ ����
	numOfapple += num;
	//���� ���� �ݾ��� ����
	myMoney -= money;
	}
	
	// ���� ����(�ݾ�, ����� ����) ���� ���
	void showBuyResult() {
		System.out.println("���� �ݾ�: " + myMoney);
		System.out.println("������ ����� ����: " + numOfapple);
	}
	
	//
	
	
	
}
