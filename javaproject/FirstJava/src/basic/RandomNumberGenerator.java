package basic;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt());
		System.out.println(r.nextLong());
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		
		System.out.println(r.nextInt(45)+1); //0~44(n�̸�) +1 
		
		System.out.println("�̹��� ��ȣ ����");
		for(int i=0; i<6; i++) {
			System.out.print(r.nextInt(45)+1+ "\t"); //0~44(n�̸�) +1 
		}

		Random r2 = new Random(10); //������ ���� ����, � ��ǻ�ͳ� �Ȱ���.
		
		System.out.println("�̹��� ��ȣ ����");
		for(int i=0; i<6; i++) {
			System.out.print(r2.nextInt(45)+1+ "\t"); //0~44(n�̸�) +1 
		}
		System.out.println("==============");
		Random r3 = new Random(System.currentTimeMillis());
		Random r4 = new Random(System.nanoTime());
		System.out.println("����Ÿ��");
		for(int i=0; i<6; i++) {
			System.out.print(r3.nextInt(45)+1+ "\t"); //0~44(n�̸�) +1 
			
	///////////////////////////////////////////////////////////������ �վ�~~	
			
			
	}
	}
}
