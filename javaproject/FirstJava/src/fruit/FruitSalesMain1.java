package fruit;

import first.MyMath;

public class FruitSalesMain1 {

	public static void main(String[] args) {
	
		//FruitSeller Ÿ���� ���Һ��� ����
		FruitSeller seller = null;
		//FruitSeller�� ��ü ����
		//��ü�� ������ Ŭ������ ���ǵ� ���(����,�޼���)���� �޸𸮿� ����ϴ� ��.
		seller = new FruitSeller();	//��ü ���� �� ��ü�� �ּҰ��� ��ȯ
	
		FruitSeller seller2 = new FruitSeller();
		
		//FruitBuyer Ÿ���� �������� ����� �ʱ�ȭ
		FruitBuyer buyer = new FruitBuyer();
		
		
		//����� ���� : 2000 ����
		buyer.buyApple(seller, 2000);
		
		System.out.println("�Ǹ����� ���� ��ǥ");
		seller.showSaleResult();
		System.out.println("==================");
		System.out.println("�������� ���� ��ǥ");
		buyer.showBuyResult();
		
//		String s = "FruitSeller";
//		seller = s;
		
		Triangle Tri = new Triangle();
		Tri.Tri(50, 12);
	}

}
