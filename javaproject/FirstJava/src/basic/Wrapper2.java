//1022
package basic;

public class Wrapper2 {

	public static void main(String[] args) {
		//Wrapper = primitive
		Integer iValue = 10; //AUTO BOXING
		// Integer iValue = new Integer(10)�� ����.
		// Integer iValue = Integer.valueof(10)�� ����.
		
		Double dValue = 3.14;
		// Double dValue = new Double(3.14);�� ����.
		// Double dValue = Double.valueOf(3.14);�� ����.
		Double dVal = Double.valueOf(3.14);
		
		
		System.out.println(iValue); //10��� 	//iValue.toString()
		System.out.println(dValue); //3.14	//dValue.toString()

		int num1 = iValue; 		// Integer -> int AUTO UNBOXING
		double num2 = dValue;
		System.out.println(num1); //10
		System.out.println(num2); //3.14
				
	}

}
