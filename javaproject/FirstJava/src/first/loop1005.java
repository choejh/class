package first;

public class loop1005 {

	public static void main(String[] args) {
		
/*	*�ݺ���*
 		���� �Ǵ� ������� �ݺ� ������ �� ���
 		�Խ��ǿ��� ����, �ۼ���, �ۼ��ð�, ��ȸ��, ���ƿ� x ���������� ������ �Խù� �����Ҷ� ����
*/
		
/* 	#for
		�ݺ��� Ƚ���� �߿��� ��
		�迭�� ����� ��
		for(int i=0 (1) ;i<3 (2) ;i++ (4) )
		{
			System.out.println("~~") (3);
		}
*/
		System.out.println("-------for------");
	// ����) 1~10���� ���� ���ϱ�	
		int sum = 0;
		for(int j= 1; j<=10; j++) {
			sum += j; // sum = sum+j;
		}
			System.out.println("1~10������ ��: "+sum);
/*	#for���� �ݺ�
		for(;;) {
			System.out.println("�ݺ��� ����");
		}
*/
		
		
		
/*	#while
		�ݺ��� Ƚ���� �� ��
		���ѹݺ�
		DB, JDBC�� ���� �� ���
		while(�ݺ�����)
		{
		System.out.println("");  ---> �ݺ�����
		num++; 					 ---> Ż���� ���� �����
		}
		
	##while �ݺ����� ��ø
		while�� �ȿ� �� while���� ��ø�� �� �ִ�.
*/
		System.out.println("---------while---------");
		
		int i=0;
		while (i<5) {
			System.out.println("�ڹ� �ȳ� - "+i);
			i++; //Ż���� ���� �����
		}	
				
/*	#Do while
		do {
		System.out.println(""); ---> �ּ� �ѹ��� ������ �ȴ�.
		num++;
		} while(num<5)
*/
		System.out.println("---------do while---------");
		
		i=0;
		do {
		System.out.println("�ڹ� �ȳ� - "+i);	//---> �ּ� �ѹ��� ����
		i++;
		} while (i<0); 

		
		
//	*continue & break"
		
/*	#break
 		�ڽ��� ���Ե� �ϳ��� �ݺ��� �Ǵ� switch���� ��������.
 */
		System.out.println("---------break��---------");

		// 0���� ����� ���ذ����� ���� 100�� �Ѿ���� Ȯ���ϴ� ���α׷�
		sum = 0;
		i = 0;
		while(true) {
			//Ż���� ����
			if (sum>100) {		//if���� ��ġ�� ��Ȳ�� ����.
				break;
			}
			i++;	//���ϴ� ���� ����
			sum+=i; //���� ���ϴ� ����	
		} //end of while
		System.out.println(i+"�� ������ �� 100�� �Ѿ�ϴ�. ���� 100�� �Ѿ�� ������ ����"+sum);
		System.out.println("-------break�� ����--------");
		//break�� ����
		 int num=1;  
		 boolean search=false;  
		 while(num<100) {
			 if(num%5==0 && num%7==0) { 
				 search=true; 
				 break; 
				 } 
			 num++;  
			 }  
		 	if(search) 
		 		System.out.println("ã�� ���� : " + num);  
		 	else    
		 		System.out.println("5�� ������� 7�� ����� ã�� ���߽� �ϴ�.");
		
/*	#continue��
 		�ڽ��� ���Ե� �ݺ����� ������ �̵��Ѵ�. (���� �ݺ����� �Ѿ��)
 		continue�� ������ ������� ������� �ʴ´�.
 */
		System.out.println("-------continue��--------");
		//1~10������ �� �� 3�� ����� �����ϰ� ���
		i=0;
		for(i=0; i<11;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("-------continue�� ����--------");
	
		//continue�� �̿��� ���� ã��
		//0~100���� ���� �� 5�� ����̸鼭 7�� ����� ���� ���, �� ��� �����ϴ��� ���� ���
		num=0;
		int count = 0;
		while((num++)<100) {
			//num++;
			if (num%5!=0 || num%7!=0) {	 // !(num%5==0 and num%7==0)
				continue;
			}
			count++;
			
		}
		System.out.println("0~99 ������ ���� �� 5�� ����̸鼭 7�� ����� ���ڴ� ���"+count+"���� �ֽ��ϴ�.");
		
		//#�̸� ���� �ݺ��� (�Ѿ��)
		
		//#�ݺ����� ��ø
		//#for�� ��ø ������
		//#while�� ��ø ������
		
		//#break ���̺� 
		
 outerLoop: for(i=1; i<10; i++) {
		
			for(int j=1; j<10;j++) {
				System.out.println("["+i+", "+j+"]"); 
				if(i%2==0 && j%2==0) {
					break outerLoop; //���� ���� ���ɿ� ������
				}
			}
		}
	
		
		
	}
	
}

