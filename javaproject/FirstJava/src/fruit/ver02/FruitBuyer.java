package fruit.ver02;
/*
	�����̸� : Fruitbuyer.java
	���� : �������� ��ü�� ����
	�ۼ��Ͻ� : 2020.10.08
	�������� : fruit.FruitBuyer.java�� ������� �����ڸ� �߰�
*/

public class FruitBuyer {

	//������ �޼��� ����

	//����: 2020.10.08, ������ �ʱ�ȭ �ڵ� ����
	//�������� ���� �ݾ�, ������ ����� ����
	int myMoney;		//�������� ���� �ݾ�
	int numOfapple;		//������ ����� ����
	
	//���: ��� ����, ���� ����(�ݾ�, ����� ����) ���� ���
	//����� ����
	//�Ǹ��� ����(��ü)�� �ݾ��� �޾�
	//�Ǹ����� �Ǹ� �޼��� ȣ�� > �����ϴ� ����� ������ ��´�. 
	//���� ����� ������ ����
	//���� ���� �ݾ��� ����
	
	//2020.10.08 : ������ ����, ������ �ʱ�ȭ ����
	public FruitBuyer() {
		this(5000,0);
	}
	
	public FruitBuyer(int myMoney, int numOfapple) {
		this.myMoney = myMoney;		//this �ڱ� �ڽ��� ����Ű�� �������� 

		this.numOfapple = numOfapple;
	}
	
	
	
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
