//1022

package basic;

public class Wrapper1 {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);	//�ν��Ͻ� ����
		Integer i2 = new Integer("100");	//�ν��Ͻ� ����
		
		System.out.println("���������� ��=> i1 == i2 : "+ (i1==i2));	//false
		System.out.println("�����ϴ� ���� �� => i1.equals(i2) :" + i1.equals(i2));
		System.out.println("il.toString() : "+i1.toString()); //100
		System.out.println("i2.toString() : "+i2.toString()); //100
		
		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE"+Integer.MIN_VALUE);

		System.out.println("Integer.SIZE"+Integer.SIZE);
		System.out.println("Integer.TYPE"+Integer.TYPE);
		
		//�迭���� �̰� �� ���ϴ� ��.

		//100�� ������
		int num = i2.intValue();
		System.out.println("int num = i2.intValue(); => "+ num);
	
		int num2 = Integer.parseInt("10"); //String -> int ���ڿ��� ������
		num2 +=1;
		System.out.println("num2 => " + num2);
		
		// String -> Integer, int -> Integer
		Integer i3 = Integer.valueOf("10");
		int num3 = i3.intValue();
		System.out.println("num3 => " + num3);
		
		
		
		
	}

}
