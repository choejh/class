package card;

public class Number {

	int num;
	
	Number(int number){
		num = number;
		System.out.println("�����ڰ� ����Ǿ����ϴ�.");
	}
	
	Number(){
		num = 10;
		System.out.println("�����ڰ� ����Ǿ����ϴ�.");
	}
	
	int getNumber() {
		return num;
	}
	
	
}
