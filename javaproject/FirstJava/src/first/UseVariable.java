package first;

public class UseVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ������ Ÿ���� ���� num1������ ��������
			int num1;
		// 2. ���� num1�� ���� ������ 10�� ��������.    
			num1=10;
		// 3. ������ Ÿ���� ���� num2������ �����ϰ�  ���� 20�� ��������. 
		int num2 = 20;
		
		// 4. ������ Ÿ���� ���� num3�� �����ϰ� 
		// ���� num1�� num2�� ���ϴ� ������ ����� 
		// ���� num3�� �����Ѵ�. 
		int num3 = num1+num2;

		// 5. ������ ����� �������.
		System.out.println(num3);
	
	
		float n1 = 1.000001f;
		double n2 = 1.0000001;
		
		System.out.println((double)n1);
		
		System.out.println(n1+n2);
		
		
		char c1 = 'a';
		System.out.println((int)c1);
		
		//boolean : true/false
		
		boolean check = true;
		if(check) {
			System.out.println(true);
		}
		
		int i = 0;
		
		while(check) {
			if(i>5) {
				break;
			}
			System.out.println(i);
			i++; //Ż���� �����
		}
		
	//��� ����
		final int MAX = 100; //����� �ٲ��� - �� ���� ���� ������ �� �ִ� ����
		
		final double PI =3.141592;
		//PI=3.14 �Ұ���
		
	//LONGŸ��
		long a = 1234567L; //�ڿ� L�� ���̴°� ����.
		
	  //int num5 = 10000000000L; �Ұ�
      //int num5 = 10000000000; �Ұ�
		long num5 = 10000000000L;
		
	//����ÿ��� �ڷ����� ���缭 ���� 
		//byte+int => int
		//int+long => long 
		//�ڵ����� ��ȯ�ȴ�. 
	//�ڵ��� ��ȯ ��Ģ
//		byte -> short-> int	long float	double 
//			    char ->
//		---------------->�ڵ�����ȯ ��
	//�ݸ� �������� �ٲٷ��� ���� ����ȯ�� �ؾ��Ѵ�.
		long numm=2147483648L;
		int numm2=(int)num1;
		
		Long num6 = 10000000000L;
		char ch3 = 'A';
		int chNumber = ch3;
		System.out.println("A �����ڵ� ��=>"+chNumber);
		
		chNumber+= 1; //chNumber =chNumber+1
		System.out.println(chNumber);
		System.out.println((char)chNumber);
		
		int age =200;
		System.out.println((byte)age); //-56�� ���´�. ©��
		//������ ����ȯ�� �����ؾ��Ѵ�.
		
		
	
	}

}
