//�����ver
package first;

public class ExamMethod {

	public static void main(String[] args) {
	//1�� ���� �޼��� ȣ��
		cal(10,3);
	//2�� ���� �޼��� ȣ��
		abs(-3,-7);
	//3�� ���� �޼��� ȣ��
	//���� ���� ���ϱ�
		System.out.println("���� ����: "+cirArea(5));
		System.out.println("���� �ѷ�: "+circu(5));
	
	//4�� ���� �޼��� ȣ��
		System.out.println(isPrimeNumber(2));
	//1~100���� �Ҽ� ã��
		for(int i=1; i<101; i++){
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	
	
//	����4.
//	���޵Ǵ� ���� �Ҽ�(prime number)���� �ƴ����� �Ǵ��Ͽ�, �Ҽ��ΰ�� true��, �Ҽ��� �ƴ� ��� false�� ��ȯ�ϴ� 
//	�޼��带 �����ϰ�, �̸� �̿��ؼ� 1�̻� 100 ������ �Ҽ��� ���� ����� �� �ֵ��� main �޼��带 ��������.	
	static boolean isPrimeNumber (int num) {
		boolean result = true;
		
		int cnt = 0;
		//�Ҽ����� �Ǻ� 
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		
		
		return cnt>2?false:true;
	}
	
//����3
//���� ������ ������ �����ϸ�, ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼���� ���� �ѷ��� ����ؼ� ��ȯ�ϴ� �޼��带 ���� �����ϰ�,
//�̸� ȣ���ϴ� main�޼��带 ��������. (2*��*r), (��*r��2)
	static double cirArea(double radius) {
		return Math.PI*radius*radius;
	}
	
	static double circu(double radius) {
		return 2*Math.PI*radius;
	}
	
	
//	����2.
//	�� ���� ������ ���� �޾Ƽ�, �μ��� ���밪�� ����Ͽ� ����ϴ� �޼���� �� �޼��带 ȣ���ϴ� main�޼��带 ������ ����. 
//	�� �޼��� ȣ�� �� ���޵Ǵ� ���� ������ ������� ���밪�� ���Ǿ ��µǾ�� �Ѵ�.
	static void abs(int num1, int num2) {
		System.out.println("num1�� ���밪: " + (num1>0?num1:-num1));
		System.out.println("num2�� ���밪: " + (num2>0?num2:-num2));		
	}
	
	
	
//����1
//�� ���� ������ ���޹޾Ƽ�, 
//�μ��� ��Ģ���� ����� ����ϴ� �޼���� 
//�� �޼��带 ȣ���ϴ� main�޼��带 �����غ���.
//��, �������� ��� �������� ���� ����ؾ� �Ѵ�.
	
	
	 static void cal(int num1, int num2) {
		//��Ģ����: + , - , * , / , %
	System.out.println(num1+"+"+num2+"="+(num1+num2));
	System.out.println(num1+"-"+num2+"="+(num1-num2)); //��ȣ�� �־�ߵ�
	System.out.println(num1+"*"+num2+"="+(num1*num2));
	System.out.println(num1+"/"+num2+"="+(num1/num2));
	System.out.println(num1+"%"+num2+"="+(num1%num2)); 
	
	 }
}