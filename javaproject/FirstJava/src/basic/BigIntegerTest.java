
package basic;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		
		System.out.println("�ִ� ���� ǥ�� : " + Long.MAX_VALUE); //longŸ���� 
		System.out.println("�ּ� ���� ǥ�� : " + Long.MIN_VALUE); //longŸ����

		BigInteger bigValue1 = new BigInteger("10000000000000000000");
		BigInteger bigValue2 = new BigInteger("-9999999999999999999");
		
		BigInteger addResult = bigValue1.add(bigValue2); //���ϱ� 
		BigInteger mulResult = bigValue2.multiply(bigValue2);
		
		
		System.out.println(addResult); //1�� ����
		System.out.println(mulResult);
		
		
	}

}
