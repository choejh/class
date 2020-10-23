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
		
		System.out.println(r.nextInt(45)+1); //0~44(n미만) +1 
		
		System.out.println("이번주 번호 예상");
		for(int i=0; i<6; i++) {
			System.out.print(r.nextInt(45)+1+ "\t"); //0~44(n미만) +1 
		}

		Random r2 = new Random(10); //씨드기반 난수 생성, 어떤 컴퓨터나 똑같음.
		
		System.out.println("이번주 번호 예상");
		for(int i=0; i<6; i++) {
			System.out.print(r2.nextInt(45)+1+ "\t"); //0~44(n미만) +1 
		}
		System.out.println("==============");
		Random r3 = new Random(System.currentTimeMillis());
		Random r4 = new Random(System.nanoTime());
		System.out.println("나노타입");
		for(int i=0; i<6; i++) {
			System.out.print(r3.nextInt(45)+1+ "\t"); //0~44(n미만) +1 
			
	///////////////////////////////////////////////////////////문제가 잇어~~	
			
			
	}
	}
}
