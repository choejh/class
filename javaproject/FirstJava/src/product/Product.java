package product;

public class Product {
	
	 int price;
	 int bonusPoint;
	
	// 생성자
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price*0.1f);
	}

	@Override
	public String toString() { //객체가 가지고 잇는 정보를 문자로 만들어 리턴
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

	
	
	
	
	
	

}