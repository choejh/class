package card;

public class CardMain {

	static int weight = 5;
	
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		
		System.out.println(Math.random());
		
		System.out.println(CardMain.weight);
		
		System.out.println("ī���� �� ������:"+Card.width);
		
		Card.play();
		
		Card c1 = new Card("hart", 10);
		Card c2 = new Card();
		
		System.out.println("============================");
		System.out.println("ī�� 1�� ����");
		System.out.println("��� : " + c1.kind + ", ���ڴ� " + c1.number);
		System.out.println("ī�� 2�� ����");
		System.out.println("��� : " + c2.kind + ", ���ڴ� " + c2.number);
		System.out.println("============================");
		
		
		c1.play();
		
		System.out.println("ī���� �� ������ : " + c1.width);
		System.out.println("ī���� �� ������ : " + c2.width);
		
		Card.width = 120;
		System.out.println("ī���� ��  ������ ����");

		System.out.println("ī���� �� ������ : " + c1.width);
		System.out.println("ī���� �� ������ : " + c2.width);
		

	}

}
