package first;

public class CarMain {

	public static void main(String[] args) {
		// Ŭ��������� ����� ����̴�. Ŭ��������� �ѹ��� ���� , �ڼ�Ŭ������ �̸��ε� ����,ȣ���� ����
		System.out.println(Car.name);
		System.out.println(HybridCar.name);

		Car car1 = new Car(100);
		HybridCar car2 = new HybridCar(100, 50);
		HybridWaterCar car3 = new HybridWaterCar(100, 50, 40);

		car3.showCurrentGauge();

	}

}

class Car {
	static String name= "CAR";
	int gasolinegauge;

	Car(int gasolinegauge) {
		this.gasolinegauge = gasolinegauge;
	}

}

class HybridCar extends Car {

	int electronicGauge;

	// HybridCar(){
	// super();
	// }

	HybridCar(int gasolinegauge, int electronicGauge) {
		// ���� Ŭ������ ����� �ʱ�ȭ �ϴ� ������ ȣ��
		super(gasolinegauge);
		
		// ���Ӱ� ������ Ŭ������ ����� �ʱ�ȭ
		this.electronicGauge = electronicGauge;
	}

}

class HybridWaterCar extends HybridCar {
	
	int waterGauge;

	// HybridWaterCar(){
	// super();
	// }

	HybridWaterCar(int gasolinegauge, int electronicGauge, int waterGauge) {
		super(gasolinegauge, electronicGauge);
		this.waterGauge = waterGauge;
	}

	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ� : " + gasolinegauge);
		System.out.println("�ܿ� ���� : " + electronicGauge);
		System.out.println("�ܿ� water : " + waterGauge);
	}
}