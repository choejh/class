package homework;

public class work1006 {

	public static void main(String[] args) {
	//����1
			System.out.println("---------����1---------");
			int num=120;
			if(num>0) {
			if((num%2)==0)
			System.out.println("����̸鼭 ¦��");
			}
			if(num>0 && num%2==0) {
			 System.out.println("����̸鼭 ¦��");
		 }
		//����2
			System.out.println("---------����2---------");
			num=0;
			 if (num<0) {
				 System.out.println("0 �̸�");
			 }
			 else if (num>=0 && num<100 ) {
				 System.out.println("0�̻� 100�̸�");
			 }
			 else if (num>=100 && num<200) {
				 System.out.println("100�̻� 200�̸�");
			 }
			 else if (num>=200 && num<300) {
				 System.out.println("200�̻� 300�̸�");
			 }
			 else if (num>=300) {
				 System.out.println("300�̻�");
			 }
		//����3
			 System.out.println("---------����3---------");
			 int num1=50;
			 int num2=100;
			 int big = 0,diff=0;
			 if (num1>num2) {
					big = num1;
					diff = num1-num2;
				}
				else if  (num1<num2) {
					big = num2;
					diff = num2-num1;
				}
				System.out.println(big);
				System.out.println(diff);
				
		//����4
			System.out.println("---------����4---------");
			int n=3;
			if (n==1) {
				System.out.println("Simple Java");
			}
			else if (n==2) {
				System.out.println("Funny Java");
			}
			else if (n==3) {
				System.out.println("Fantastic Java");
			}
			else {
				System.out.println("The best programming language");
			}
			System.out.println("Do you like coffee?");
			
		//����5
			System.out.println("---------����5---------");
			num =400;
			int i = 1;
			switch(i) {
			case 1 : 
				if(num<0) {
				System.out.println("0 �̸�");
				}
				else if (num>=0&&num<100) {
					System.out.println("0�̻� 100�̸�");
				}
				else if (num>=100&&num<200) {
					System.out.println("100�̻� 200�̸�");
				}
				else if (num>=200&&num<300) {
					System.out.println("200�̻� 300�̸�");
				}
				else if (num>=300) {
					System.out.println("300�̻�");
				}
			
				
			}
			
		//����6
			System.out.println("---------����6---------");
			i=1;
			int sum=0;
			while (i<=99) {
			sum=sum+i;
			i++;
			}
			System.out.println("sum : "+sum);
			
		//����7
			System.out.println("---------����7---------");
			i=1;
			do {
				System.out.println(i);
			i++;
			} while (i<100);
			
			while (i>0) {
				System.out.println(i);
				i--;
				}
			
		//����8
			System.out.println("---------����8---------");
			i=0;
			sum=0;
			while (i<=1000) {
			if(i%2==0 && i%7==0) {
				sum+=i;
			}
			i++;
			}
			System.out.println(sum);
			
		//����9
			System.out.println("---------����9---------");
			i=0;
			sum=1;		
			for(i=1;i<=10;i++) {
				sum= sum*i;
			}
			System.out.println(sum);
			
		//����10
			System.out.println("---------����10---------");
			i=0;
			int five=5;		
			for(i=1;i<10;i++) {
				int odan=five*i;
				System.out.println(five+"x"+i+"="+odan);
			}
		//����11			
			System.out.println("---------����11---------");
			num=0;
			int count=0;
			while((num++)<100){
			if(num%5!=0 || num%7!=0)
			continue;
			count++;
			System.out.println(num);
			}
			System.out.println("count: " + count);
			
			count=0;
			for(num=1;num<100;num++) {
				if(num%5!=0||num%7!=0) {
					continue;
				}
				count++;
				System.out.println(num);
			}
			System.out.println("count: " + count);
		
		//����12
			System.out.println("---------����12---------");
			i=1;
			sum=0;
			while(true) {
				if(i%2!=0||(i%3==0 && i%2==0)) {
					sum+=i;
				}
				if(sum>=1000) {
					System.out.println("ó�� 1000�� �ѱ� ���� " + sum);
					System.out.println(i+"�� ������ �� 1000�� �Ѵ´�.");
					break;
				}
				i++;
			}
		//����13
			System.out.println("---------����13---------");
			i=0;
			num=1;
			int gugudan=0;
			for(i=1;i<9;i++) {
				if(i==2||i==4||i==8) {
					for(int j=1;j<=i;j++) {
						System.out.println(i+"x"+j+"="+i*j);
						}
					}
				}
		//����14
			System.out.println("---------����14---------");
			for(i=0;i<=9;i++){
				for(int j=0;j<=9;j++) {
					if((10*i+j)+(10*j+i)==99) {
						System.out.println(i+"��"+j);
					}
				}
			}
			
		//����15
			System.out.println("---------����15---------");
		n=7;
		switch(n) {
		case 1:
			System.out.println("���� �ο��� 1�� �Դϴ�.");
			break;
		case 2:
			System.out.println("���� �ο��� 2�� �Դϴ�.");
			break;
		case 3:
			System.out.println("���� �ο��� 3�� �Դϴ�.");
			break;
		default:
			System.out.println("���� ���� ������� �ֽ��ϴ�.");
			break;
		}
		n=0;
		if (n==1) {
			System.out.println("���� �ο��� 1�� �Դϴ�.");
		}
		else if (n==2) {
			System.out.println("���� �ο��� 2�� �Դϴ�.");
		}
		else if (n==3) {
			System.out.println("���� �ο��� 3�� �Դϴ�.");
		}
		else if (n>3) {
			System.out.println("���� ���� ������� �ֽ��ϴ�.");
		}
		
		//����16	
		System.out.println("---------����16---------");
		//while��
		i=1;
		sum=0;
		while(i<=99) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		//for��
		sum=0;
		i=0;
		for(i=1;i<=99;i++) {
			sum+=i;
		}
		System.out.println(sum);
		//do while��
		i=1;
		sum=0;
		do {
			sum+=i;
			i++;
		} while (i<=99); 
		System.out.println(sum);
		
		
		
}
}