
package basic;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		
		System.out.println("최대 정수 표현 : " + Long.MAX_VALUE); //long타입의 
		System.out.println("최소 정수 표현 : " + Long.MIN_VALUE); //long타입의

		BigInteger bigValue1 = new BigInteger("10000000000000000000");
		BigInteger bigValue2 = new BigInteger("-9999999999999999999");
		
		BigInteger addResult = bigValue1.add(bigValue2); //더하기 
		BigInteger mulResult = bigValue2.multiply(bigValue2);
		
		
		System.out.println(addResult); //1이 나옴
		System.out.println(mulResult);
		
		
	}

}
