package product;

public class Audio extends Product {

	public Audio(int price) {
		super(price); //price만 불러왔네 
	}

	@Override
	public String toString() {
		return "Audio ["+price+"]";
	}
	
	

}