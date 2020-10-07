package card;

public class CardMain {
	static int weight = 5;

	public static void main(String[] args) {

		System.out.println(CardMain.weight);	//5
		System.out.println("카드의 폭 사이즈: "+Card.width);
		
		Card c1 = new Card();
		Card c2 = new Card();
		System.out.println("카드의 폭 사이즈: " + c1.width);
		System.out.println("카드의 폭 사이즈: " + c2.width);
	
		Card.width = 120;
		System.out.println("파드의 폭 사이즈 변경");

		System.out.println("카드의 폭 사이즈: " + c1.width); //120
		System.out.println("카드의 폭 사이즈: " + c2.width); //120

	
	}

}
