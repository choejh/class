package first;

public class CastingTest {

	public static void main(String[] args) {

		// ����Ŭ���� Ÿ���� ��������
		Car1 car = null;
		FireEngine fe = null;
		
		car = new FireEngine();
		fe = new FireEngine();
		
		// fe = new Car1();  // ����
		
		FireEngine fe2 = null;
		
		fe.water();
		
		// ����ȯ ���� ���� ����
		//car = (Car1)fe;  // Car1 = (Car1)FireEngine
		car = fe;
		
		//car.water();   // Ÿ���� Car1 �̱� ������ ����� �ƴ� water() ���Ұ�
		
		fe2 = (FireEngine)car;  // ����Ÿ�Կ��� �ڼ�Ÿ�������� ����ȯ�� ��������� �����ڸ� ����ؾ��Ѵ�.
		
		fe2.water();
		
		
		//car = new Ambulance();
		
		FireEngine f3= null;
		
		if(car instanceof FireEngine) {
			f3 = (FireEngine)car;
			f3.water();
		} else {
			System.out.println("���� ���� ����");
		}
		 
		
		
		
		
		
	}
}

class Car1{
	private String color;
	private int door;
	
	void drive() {
		System.out.println("�����Ѵ�.");
	}
	
	void stop() {
		System.out.println("�����.");
	}
}

class FireEngine extends Car1{
	void water() {
		System.out.println("���� �Ѹ���");
	}
}

class Ambulance extends Car1{
	
}




