package first;
import java.lang.Math;
import java.util.Scanner;
public class OperatorTest {

	public static void main(String[] args) {
/*
		int num1 = 10;
		int num2 = 8;
		
		System.out.println("10/8 = "+num1/num2);	//1
		System.out.println("10/-8 = "+num1/-num2);	//-1
		System.out.println("10%-8 = "+num1%-num2);	//2 ****
		System.out.println("10f/8f = " + 10f/8f);	//1.25
		System.out.println("10f/8 = "+10f/num2);	//1.25
		System.out.println("10/8 = "+num1/(float)num2); //1.25
		
		
//		# ���� �� ������		
		
		System.out.println('a' < 'b');		
//		-> 65 < 66		true
		System.out.println('0' == 0	);	
//		-> 48 == 0		false
		System.out.println('A' != 65);	
//		-> 65 != 65		false
		System.out.println(10.0d == 10.0f);	
//		->10.0d == 10.0d true
		System.out.println(0.1d == 0.1f);
//		->0.1d == 0.1d	false �Ҽ����� �� �׷�
		double d = (double) 0.1f;
		System.out.println("d => "+ d);
		
		System.out.println("(float)d==0.1f->"+ ((float)d==0.1f));
		
//		# ��������
		
		num1=10; 
		num2=20;
		boolean result1= num1==10 && num2==20; // t && t -> t
		boolean result2= num1<=12 || num2>=30; // t ||f -> t
		
		System.out.println(result1);
		System.out.println(result2);		
		
		if(!(num1==num2)) {
			System.out.println("num1�� num2�� �����ʴ�.");
		} else {
			System.out.println("num1�� num2�� ����");
		}
		
//		# ���׿�����
		float pi = 3.141592f;
		float sPi = (int)(pi*100);	//314.0
		System.out.println(sPi);
		
		float sPi1 = (int)(pi*100)/100f;	//3.14
		System.out.println(sPi1);
		
		int price = 11234;
		int price2=price/1000;
		System.out.println(price2);
		int price3=price/1000*1000;
		System.out.println(price3); //����
		
		float sPi2 = Math.round(pi); //�Ҽ��� ù°�ڸ����� �ݿø�
		System.out.println(sPi2);
		float sPi3 = Math.round(pi*100)/100f; 
		System.out.println(sPi3);
	
		
//		#���� ���� ����
		int numm1=7;
		int numm2, numm3;
		
		numm2 = ++numm1;	//8
		numm3 = --numm1;	//7
		System.out.println("��="+numm2);
		System.out.println("��="+numm3);
		
		int nummm1=7;
		int nummm2, nummm3;
		
		nummm2 = nummm1++;
		nummm3 = nummm1--;
		System.out.println("��="+nummm2);
		System.out.println("��="+nummm3);
	
		
		int i=5;
		int j=5;  
		System.out.println(i++);  	//���: 5 i= 6
		System.out.println(++j); 	//���: 6 j=6
		System.out.println("i = " + i + ", j = " +j); //i = 6, j = 6
		
//		#���ڿ�ó�� : string Ŭ���� �̿� -> ��ü ���� -> Ŭ������ ������ ������ �޼��带 �޸𸮿� �ε�
		
		//�������� : ��ü�� �޸� �ּҰ��� ����
		String str = null;	//null -> ���������� ��ü�� �ּҰ��� �����ϰ� ���� �ʴ´�.
		
		str = "abc"; // "" ���� ���ڿ��� �̿��� ��ü�� �����ϰ� �ּҰ��� ��ȯ��
		
		System.out.println(str.toString()); //���ڿ��� ��ȯ���ش�. 
		System.out.println(str.equals("abc")); //���ڿ� ��
		System.out.println(str.equals("��"));
		
		if(str != null && !str.equals("")) {
			System.out.println(str.charAt(1)); // 0~3 -1 => 0,1,2�� ����
		}
		int num=120; 
		if(num>0) {
			if((num%2)==0) { 
				System.out.println("����̸鼭 ¦��");
			}
		}

//		# ���ǹ��� �ݺ���		
		int num11=50;
		int num22=100;  
		int big, diff; //ū��, �� ���� ����
		big = (num1>num2)? num1:num2;   
		System.out.println(big); 
		diff = (num1>num2)? num1-num2: num2-num1; 
		System.out.println(diff);  

//		# ���� ������ �̿�	
		big = num11>num22? num11:num22;
		diff = num11>num22? num11-num22: num22-num11;
		System.out.println("ū��:"+big+" ,ū���� �������� ���̴�"+diff+" �Դϴ�.");
		
//		#if else�� ����ϴ� ����.
		if(num11>num22) {
			big = num11;
			diff = num11 - num22;
		} else {
			big = num22;
			diff = num22 - num11;
		}
		System.out.println("ū��:"+big+" ,ū���� �������� ���̴�"+diff+" �Դϴ�.");
		System.out.println("------------");
//		#switch
		
		int n=0;
		
		System.out.println("�޴��� �����ϼ���\n 1.�Է� 2.���� 3.���� 4.����");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		switch (n) {
			case 1:
				System.out.println("�Է� �մϴ�.");
				System.out.println("simple JAVA");
				break;
			case 2:
				System.out.println("�����͸� �����մϴ�.");
				System.out.println("Funny JAVA");
				break;
			case 3:
				System.out.println("������ �����մϴ�.");
				System.out.println("Fantastic JAVA");
				break;
			case 4:
				System.out.println("�����͸� �����մϴ�.");
				break;
						
		/*
			default:
				System.out.println("Best JAVA");
		*/
		
//		}
		
/*		����1)
		int i=5;
		int j=0; 
		j = i++;	    
		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);  //���� ���� �� ����
		// ����� ���ϱ� ����, i�� j�� ���� �ٽ� 5�� 0���� ����  
		i=5;                  
		j=0;
		j = ++i;   
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j); //���� ���� �� ����
/**/
		
//		����2
/*		int num1 = 7;
		int num2, num3; 
		num2 = ++num1; //���� ���� �� ����
		num3 = --num1; //���� ���� �� ����
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);  
/**/
//		����3
/*		 int i=5, j=5; 
		 System.out.println(i++); //���� ���� �� ����
		 System.out.println(++j); //���� ���� �� ����
		 System.out.println("i = " + i + ", j = " +j); 
 */
/**/		
//		����4
	//	int i = -10; 
/*		i = +i;  
		System.out.println(i); //-10 	+1*-10
		i=-10;  
		i = -i; 
		System.out.println(i); //+10	-1*-10
*/
//		����5
/*		byte b = 10;    
		System.out.println("b = " + b ); 
		System.out.println("~b = " + ~b); // ~b�� -(b+1)
		System.out.println("~b+1 = " + (~b+1)); //-(b+1)+1
*/
//		����6		
/*		  byte b = 10; 
//		  byte result = ~b;				//*************************
		  byte result = (byte)~b; 	
		  System.out.println("b = " + b ); 
		  System.out.println("~b = " + result );
*/
//		 ����7
/*		 boolean power = false; 
		 System.out.println(power); 
		 power = !power;     
		 // power�� ���� false���� true�� �ٲ��.
		 System.out.println(power);
		 power = !power;    
		 // power�� ���� true���� false�� �ٲ��.   
		 System.out.println(power);
	*/	 
//		����8
/*		 byte a = 10;    
		 byte b = 20;           
	//	 byte c = a + b;  //int+int�� �ȴ�. ********************
		 byte c = (byte)(a+b);          
		 System.out.println(c); 
*/		 
		 
//		����9
/*		 byte a = 10;  
		 byte b = 30;  
		 byte c = (byte)(a * b);   
		 System.out.println(c); //byte�� �ʰ� -128~127
*/
/*		 
//		����10
		 int a = 1000000;
		 // 1,000,000   1�鸸         
		 int b = 2000000;
		 // 2,000,000   2�鸸 
		 long c = a*b;
		 // 2,000,000,000,000 int * int ������ �ʰ� (long)a*b
		 System.out.println(c);	
*/		 
//		����11		 
/*		 long a = 1000000 * 1000000;
		 long b = 1000000 * 1000000L;  // long�� ���ͷ�         
		 System.out.println(a); //int * int ������ �ʰ�     
		 System.out.println(b); //int * long = long
*/		 
//		����12
/*		 
		 int a = 1000000 * 100000 / 1000000; //-->������ ���Ǵµ� �鸸*�鸸�� �����ʰ�
		 int b = 1000000 / 100000 * 1000000; //��������� ���Ǿ� ������ ���ʰ�
		 System.out.println(a);            
		 System.out.println(b); 

*/	 
//		����13
         char c1 = 'a';  // c1���� ���� 'a'�� �ڵ� ���� 97�� ����ȴ�.    
         char c2 = c1;  // c1�� ����Ǿ� �ִ� ���� c2�� ����ȴ�.   
         char c3 =' ';   // c3�� �������� �ʱ�ȭ �Ѵ�.        
         int  i = c1 + 1;       // 'a'+1 �� 97+1 �� 98    
         c3 = (char)(c1 + 1);          
         c2++;     
         c2++;      
         System.out.println("i=" + i);    
         System.out.println("c2=" + c2);       
         System.out.println("c3=" + c3); 
		 
		 
}
}
	
	
