package fruit.ver02;

import first.MyMath;

public class FruitSalesMain1 {

	public static void main(String[] args) {
	
		//FruitSeller Ÿ���� ���Һ��� ����
		FruitSeller seller = null;
		//FruitSeller�� ��ü ����
		//��ü�� ������ Ŭ������ ���ǵ� ���(����,�޼���)���� �޸𸮿� ����ϴ� ��.
		seller = new FruitSeller(0,30,1500);	//��ü ���� �� ��ü�� �ּҰ��� ��ȯ
	
		FruitSeller seller2 = new FruitSeller(0,10,2000);
		
		//���� 3
		FruitSeller seller3 = new FruitSeller(seller);
		
		//FruitBuyer Ÿ���� �������� ����� �ʱ�ȭ
		FruitBuyer buyer = new FruitBuyer(10000,0);
		
		//�̷��� �ϸ� �ȵȴٱ�10.15 -> �������� ������ private ó����
//		seller.myMoney +=500;
//		buyer.myMoney -=500;
//		seller.numOfApple -=20;
//		buyer.numOfapple =+ 20;
		
		//����� ���� : 2000 ����
		buyer.buyApple(seller, 3000);
		
		//����� ����: 4000 ����
		buyer.buyApple(seller2, 4000);
		
		buyer.buyApple(seller3, 1500);
		
		System.out.println("�Ǹ���1�� ���� ��ǥ");
		seller.showSaleResult();
		
		System.out.println("�Ǹ���2�� ���� ��ǥ");
		seller2.showSaleResult();
		
		System.out.println("�Ǹ���3�� ���� ��ǥ");
		seller3.showSaleResult();
		
		System.out.println("==================");
		System.out.println("�������� ���� ��ǥ");
		buyer.showBuyResult();
		
//		String s = "FruitSeller";
//		seller = s;
		
	}

}
