package product;

public class Buyer {  // �ڵ����� Object Ŭ������ ����Ѵ�.

	private int money;
	private int bonusPoint;
	
	// ������ ��ǰ�� ���� �迭�� ����
//	Tv[] tv;
//	Computer[] com;
//	Audio[] audio;
	Product[] cart = new Product[10];
	// ������ ��ǰ�� ����
	int cnt = 0;
	
	public Buyer() {
		this(1000);
	}
	
	public Buyer(int money) {
		this.money = money;
		this.bonusPoint = 0;
	}
	
//	void buy(Tv tv) {
//	}
//	void buy(Computer com) {
//	}
//	void buy(Audio audio) {
//	}
	
	void buy(Product p) {
		
		// ������ ���� ��ǰ�� ������ ���ؼ� ���ſ��� �Ǵ�
		if(money<p.price) {
			System.out.println("������ ���� �����ؼ� ������ �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		// īƮ�� ��ǰ�� �ִ´�.
		cart[cnt++] = p;
		
		System.out.println(p + "�� �����߽��ϴ�.");
		
	}
	
	void showData() {
		
		// ���Ÿ�� ���, ���� �Ѿ�
		int sum = 0;
		
		System.out.println("���� ��� ============");
		for(int i=0; i<cnt ; i++) {
			System.out.println(cart[i]);
			sum += cart[i].price;
		}
		System.out.println("===================");
		System.out.println("�� ���� �ݾ� : " + sum);
		System.out.println("��������Ʈ : " + bonusPoint);
		
		System.out.println("���� �� : " + money);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}