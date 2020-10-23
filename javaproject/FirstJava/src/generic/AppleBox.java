package generic;

public class AppleBox {

	Apple apple;
	
	public void store(Apple apple ) {
		this.apple = apple;	//박스에 넣는다?
	}
	
	public Apple pullOut() {
		return apple;
	}
	
}
