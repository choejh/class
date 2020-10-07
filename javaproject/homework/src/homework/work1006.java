package homework;

public class work1006 {

	public static void main(String[] args) {
	//문제1
			System.out.println("---------문제1---------");
			int num=120;
			if(num>0) {
			if((num%2)==0)
			System.out.println("양수이면서 짝수");
			}
			if(num>0 && num%2==0) {
			 System.out.println("양수이면서 짝수");
		 }
		//문제2
			System.out.println("---------문제2---------");
			num=0;
			 if (num<0) {
				 System.out.println("0 미만");
			 }
			 else if (num>=0 && num<100 ) {
				 System.out.println("0이상 100미만");
			 }
			 else if (num>=100 && num<200) {
				 System.out.println("100이상 200미만");
			 }
			 else if (num>=200 && num<300) {
				 System.out.println("200이상 300미만");
			 }
			 else if (num>=300) {
				 System.out.println("300이상");
			 }
		//문제3
			 System.out.println("---------문제3---------");
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
				
		//문제4
			System.out.println("---------문제4---------");
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
			
		//문제5
			System.out.println("---------문제5---------");
			num =400;
			int i = 1;
			switch(i) {
			case 1 : 
				if(num<0) {
				System.out.println("0 미만");
				}
				else if (num>=0&&num<100) {
					System.out.println("0이상 100미만");
				}
				else if (num>=100&&num<200) {
					System.out.println("100이상 200미만");
				}
				else if (num>=200&&num<300) {
					System.out.println("200이상 300미만");
				}
				else if (num>=300) {
					System.out.println("300이상");
				}
			
				
			}
			
		//문제6
			System.out.println("---------문제6---------");
			i=1;
			int sum=0;
			while (i<=99) {
			sum=sum+i;
			i++;
			}
			System.out.println("sum : "+sum);
			
		//문제7
			System.out.println("---------문제7---------");
			i=1;
			do {
				System.out.println(i);
			i++;
			} while (i<100);
			
			while (i>0) {
				System.out.println(i);
				i--;
				}
			
		//문제8
			System.out.println("---------문제8---------");
			i=0;
			sum=0;
			while (i<=1000) {
			if(i%2==0 && i%7==0) {
				sum+=i;
			}
			i++;
			}
			System.out.println(sum);
			
		//문제9
			System.out.println("---------문제9---------");
			i=0;
			sum=1;		
			for(i=1;i<=10;i++) {
				sum= sum*i;
			}
			System.out.println(sum);
			
		//문제10
			System.out.println("---------문제10---------");
			i=0;
			int five=5;		
			for(i=1;i<10;i++) {
				int odan=five*i;
				System.out.println(five+"x"+i+"="+odan);
			}
		//문제11			
			System.out.println("---------문제11---------");
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
		
		//문제12
			System.out.println("---------문제12---------");
			i=1;
			sum=0;
			while(true) {
				if(i%2!=0||(i%3==0 && i%2==0)) {
					sum+=i;
				}
				if(sum>=1000) {
					System.out.println("처음 1000을 넘긴 값은 " + sum);
					System.out.println(i+"을 더했을 때 1000이 넘는다.");
					break;
				}
				i++;
			}
		//문제13
			System.out.println("---------문제13---------");
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
		//문제14
			System.out.println("---------문제14---------");
			for(i=0;i<=9;i++){
				for(int j=0;j<=9;j++) {
					if((10*i+j)+(10*j+i)==99) {
						System.out.println(i+"과"+j);
					}
				}
			}
			
		//문제15
			System.out.println("---------문제15---------");
		n=7;
		switch(n) {
		case 1:
			System.out.println("현재 인원은 1명 입니다.");
			break;
		case 2:
			System.out.println("현재 인원은 2명 입니다.");
			break;
		case 3:
			System.out.println("현재 인원은 3명 입니다.");
			break;
		default:
			System.out.println("현재 많은 사람들이 있습니다.");
			break;
		}
		n=0;
		if (n==1) {
			System.out.println("현재 인원은 1명 입니다.");
		}
		else if (n==2) {
			System.out.println("현재 인원은 2명 입니다.");
		}
		else if (n==3) {
			System.out.println("현재 인원은 3명 입니다.");
		}
		else if (n>3) {
			System.out.println("현재 많은 사람들이 있습니다.");
		}
		
		//문제16	
		System.out.println("---------문제16---------");
		//while문
		i=1;
		sum=0;
		while(i<=99) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		//for문
		sum=0;
		i=0;
		for(i=1;i<=99;i++) {
			sum+=i;
		}
		System.out.println(sum);
		//do while문
		i=1;
		sum=0;
		do {
			sum+=i;
			i++;
		} while (i<=99); 
		System.out.println(sum);
		
		
		
}
}