package card;

public class CardMain {
	static int weight = 5;

	public static void main(String[] args) {

		System.out.println(CardMain.weight);	//5
		System.out.println("ī���� �� ������: "+Card.width);
		
		Card c1 = new Card();
		Card c2 = new Card();
		System.out.println("ī���� �� ������: " + c1.width);
		System.out.println("ī���� �� ������: " + c2.width);
	
		Card.width = 120;
		System.out.println("�ĵ��� �� ������ ����");

		System.out.println("ī���� �� ������: " + c1.width); //120
		System.out.println("ī���� �� ������: " + c2.width); //120

	
	}

}
