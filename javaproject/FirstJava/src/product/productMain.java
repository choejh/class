package product;

public class productMain {

	public static void main(String[] args) {
		
//		System.out.println(new Product(100).toString());
//		System.out.println(new Tv(100).toString());
		
		// ������ �ν��Ͻ� ����
		Buyer b = new Buyer();
		
		String str = "";
		
		
		// ��ǰ �ν��Ͻ��� ����
		Tv tv = new Tv(200);
		Computer com = new Computer(180);
		Audio audio = new Audio(150);
		
		b.buy(tv);		// Product p = new Tv();
		b.buy(com);		// Product p = new Computer();
		b.buy(audio);	// Product p = new Audio();
		
		b.showData();
		

	}

}



