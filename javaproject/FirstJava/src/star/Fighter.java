package star;

public class Fighter extends Unit implements Fightable{


	@Override
	public void move() {
		System.out.println("�̵��մϴ�.");
		x+=Num;
		y+=Num;
	}
	//public�� �ٿ�����.
	@Override
	public void attack() {
		System.out.println("�����մϴ�.");
		hp-=Num;
	}
	//public�� �ٿ�����.

	
	
}
