package product;

public class Audio extends Product {

	public Audio(int price) {
		super(price); //price�� �ҷ��Գ� 
	}

	@Override
	public String toString() {
		return "Audio ["+price+"]";
	}
	
	

}