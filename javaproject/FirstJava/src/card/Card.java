package card;

public class Card {

	String kind;	// ī���� ����
	int number;		// ī���� ����
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	Card(){
		// �ٸ� �����ڸ� ȣ��
		this("spade", 1);
	}
	
	
	
	// Ŭ���� ���� ����
	static int width = 100;	// ī���� ��
	static int height = 250;	// ī���� ����
	
	static void play() {
		System.out.println("ī����̸� �մϴ�.");
	}
}