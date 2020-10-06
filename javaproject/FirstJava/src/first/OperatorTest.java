package first;
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
		
		
//		# 관계 비교 연산자		
		
		System.out.println('a' < 'b');		
//		-> 65 < 66		true
		System.out.println('0' == 0	);	
//		-> 48 == 0		false
		System.out.println('A' != 65);	
//		-> 65 != 65		false
		System.out.println(10.0d == 10.0f);	
//		->10.0d == 10.0d true
		System.out.println(0.1d == 0.1f);
//		->0.1d == 0.1d	false 소수점은 점 그럼
		double d = (double) 0.1f;
		System.out.println("d => "+ d);
		
		System.out.println("(float)d==0.1f->"+ ((float)d==0.1f));
		
//		# 논리연산자
		
		num1=10; 
		num2=20;
		boolean result1= num1==10 && num2==20; // t && t -> t
		boolean result2= num1<=12 || num2>=30; // t ||f -> t
		
		System.out.println(result1);
		System.out.println(result2);		
		
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 같지않다.");
		} else {
			System.out.println("num1과 num2는 같다");
		}
		
//		# 이항연산자
		float pi = 3.141592f;
		float sPi = (int)(pi*100);	//314.0
		System.out.println(sPi);
		
		float sPi1 = (int)(pi*100)/100f;	//3.14
		System.out.println(sPi1);
		
		int price = 11234;
		int price2=price/1000;
		System.out.println(price2);
		int price3=price/1000*1000;
		System.out.println(price3); //절사
		
		float sPi2 = Math.round(pi); //소수점 첫째자리에서 반올림
		System.out.println(sPi2);
		float sPi3 = Math.round(pi*100)/100f; 
		System.out.println(sPi3);
	
		
//		#증가 감소 연산
		int numm1=7;
		int numm2, numm3;
		
		numm2 = ++numm1;	//8
		numm3 = --numm1;	//7
		System.out.println("앞="+numm2);
		System.out.println("앞="+numm3);
		
		int nummm1=7;
		int nummm2, nummm3;
		
		nummm2 = nummm1++;
		nummm3 = nummm1--;
		System.out.println("뒤="+nummm2);
		System.out.println("뒤="+nummm3);
	
		
		int i=5;
		int j=5;  
		System.out.println(i++);  	//출력: 5 i= 6
		System.out.println(++j); 	//출력: 6 j=6
		System.out.println("i = " + i + ", j = " +j); //i = 6, j = 6
		
//		#문자열처리 : string 클래스 이용 -> 객체 생성 -> 클래스가 가지는 변수와 메서드를 메모리에 로드
		
		//참조변수 : 객체의 메모리 주소값을 저장
		String str = null;	//null -> 참조변수가 객체의 주소값을 저장하고 있지 않는다.
		
		str = "abc"; // "" 공백 문자열을 이용한 객체를 생성하고 주소값을 반환함
		
		System.out.println(str.toString()); //문자열을 반환해준다. 
		System.out.println(str.equals("abc")); //문자열 비교
		System.out.println(str.equals("ㅇ"));
		
		if(str != null && !str.equals("")) {
			System.out.println(str.charAt(1)); // 0~3 -1 => 0,1,2만 가능
		}
		int num=120; 
		if(num>0) {
			if((num%2)==0) { 
				System.out.println("양수이면서 짝수");
			}
		}
//		# 조건문과 반복문		
		int num11=50;
		int num22=100;  
		int big, diff; //큰수, 두 수의 차이
		big = (num1>num2)? num1:num2;   
		System.out.println(big); 
		diff = (num1>num2)? num1-num2: num2-num1; 
		System.out.println(diff);  
//		# 삼항 연산자 이용	
		big = num11>num22? num11:num22;
		diff = num11>num22? num11-num22: num22-num11;
		System.out.println("큰수:"+big+" ,큰수와 작은수의 차이는"+diff+" 입니다.");
		
//		#if else를 사용하는 형태.
		if(num11>num22) {
			big = num11;
			diff = num11 - num22;
		} else {
			big = num22;
			diff = num22 - num11;
		}
		System.out.println("큰수:"+big+" ,큰수와 작은수의 차이는"+diff+" 입니다.");
		System.out.println("------------");
//		#switch
		
		int n=0;
		
		System.out.println("메뉴를 선택하세요\n 1.입력 2.보기 3.수정 4.삭제");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		switch (n) {
			case 1:
				System.out.println("입력 합니다.");
				System.out.println("simple JAVA");
				break;
			case 2:
				System.out.println("데이터를 열람합니다.");
				System.out.println("Funny JAVA");
				break;
			case 3:
				System.out.println("정보를 수정합니다.");
				System.out.println("Fantastic JAVA");
				break;
			case 4:
				System.out.println("데이터를 삭제합니다.");
				break;
						
		/*
			default:
				System.out.println("Best JAVA");
		*/
		
//		}
		
/*		예제1)
		int i=5;
		int j=0; 
		j = i++;	    
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);  //증가 이전 값 대입
		// 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경  
		i=5;                  
		j=0;
		j = ++i;   
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j); //증가 이후 값 대입
/**/
		
//		예제2
/*		int num1 = 7;
		int num2, num3; 
		num2 = ++num1; //증가 이후 값 대입
		num3 = --num1; //감소 이후 값 대입
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);  
/**/
//		예제3
/*		 int i=5, j=5; 
		 System.out.println(i++); //증가 이전 값 대입
		 System.out.println(++j); //증가 이후 값 대입
		 System.out.println("i = " + i + ", j = " +j); 
 */
/**/		
//		예제4
	//	int i = -10; 
/*		i = +i;  
		System.out.println(i); //-10 	+1*-10
		i=-10;  
		i = -i; 
		System.out.println(i); //+10	-1*-10
*/
//		예제5
/*		byte b = 10;    
		System.out.println("b = " + b ); 
		System.out.println("~b = " + ~b); // ~b는 -(b+1)
		System.out.println("~b+1 = " + (~b+1)); //-(b+1)+1
*/
//		예제6		
/*		  byte b = 10; 
//		  byte result = ~b;				//*************************
		  byte result = (byte)~b; 	
		  System.out.println("b = " + b ); 
		  System.out.println("~b = " + result );
*/
//		 예제7
/*		 boolean power = false; 
		 System.out.println(power); 
		 power = !power;     
		 // power의 값이 false에서 true로 바뀐다.
		 System.out.println(power);
		 power = !power;    
		 // power의 값이 true에서 false로 바뀐다.   
		 System.out.println(power);
	*/	 
//		예제8
/*		 byte a = 10;    
		 byte b = 20;           
	//	 byte c = a + b;  //int+int가 된다. ********************
		 byte c = (byte)(a+b);          
		 System.out.println(c); 
*/		 
		 
//		예제9
/*		 byte a = 10;  
		 byte b = 30;  
		 byte c = (byte)(a * b);   
		 System.out.println(c); //byte값 초과 -128~127
*/
/*		 
//		예제10
		 int a = 1000000;
		 // 1,000,000   1백만         
		 int b = 2000000;
		 // 2,000,000   2백만 
		 long c = a*b;
		 // 2,000,000,000,000 int * int 계산범위 초과 (long)a*b
		 System.out.println(c);	
*/		 
//		예제11		 
/*		 long a = 1000000 * 1000000;
		 long b = 1000000 * 1000000L;  // long형 리터럴         
		 System.out.println(a); //int * int 계산범위 초과     
		 System.out.println(b); //int * long = long
*/		 
//		예제12
/*		 
		 int a = 1000000 * 100000 / 1000000; //-->순으로 계산되는데 백만*백만이 범위초과
		 int b = 1000000 / 100000 * 1000000; //나누기부터 계산되어 계산범위 안초과
		 System.out.println(a);            
		 System.out.println(b); 
*/	 
//		예제13
/*       char c1 = 'a';  // c1에는 문자 'a'의 코드 값인 97이 저장된다.    
         char c2 = c1;  // c1에 저장되어 있는 값이 c2에 저장된다.   
         char c3 =' ';   // c3를 공백으로 초기화 한다.        
         int  i = c1 + 1;       // 'a'+1 → 97+1 → 98    
         c3 = (char)(c1 + 1);   // 'a'는 97, 97+1=98 98은 'b'       
         c2++;     //a+1=b
         c2++;     //a+2=c
         System.out.println("i=" + i);    
         System.out.println("c2=" + c2);       
         System.out.println("c3=" + c3); //b
 */
		
//		예제14
/*		
		char c1 = 'a';
		char c2 = c1 + 1;
		char c2 = 'a'+1; // 라인 6 : 컴파일 에러 없음.
		System.out.println(c2);
*/		
		
/*		
		문제1.
		int 형 변수 num1, num2, num3가 각각 10,20,30 으로 초기화 되어 있다.
		다음문장을 실행하면 각각 변수에는 어떠한 값이 저장되겠는가?
		num1=num2=num3 ;
		 확인 하는 코드를 작성하고, 그 결과에 대해 설명.
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		num1=num2=num3;
		System.out.println(num1);
		//num3->num2->num1
		
		문제2.
		수학식 {{(25x5)+(36-4)}-72}/5 의 계산결과를 출력하는 프로그램 작성.
		double num4 = (((25*5)+(36-4))-72)/5;
		System.out.println(num4);
		
		문제3.
		3+6, 3+6+9, 3+6+9+12 의 연산을 하는 프로그램 작성.
		단. 덧셈 연산의 횟수 최소화
	
		int sum=3;
		for(int i=2;i<5;i++) {
			sum = sum+(i*3);
			System.out.println(sum);
		}
		
		
		
		문제4.
		a= {{(25+5)+(36/4)}-72}*5, b= {{(25x5)+(36-4)}-71}/4, c=(128/4)*2 일 때
		a>b>c 가 참이면 true 아니면 false를 출력하는 프로그램 작성     
		int a = (((25+5)+(36/4))-72)*5;
		int b = (((25*5)+(36-4))-71)/4;
		int c = (128/4)*2;
		if (a>b && b>c) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
//		문제1 - if 한개 써
		int num=120;
		if(num>0) {
		if((num%2)==0)
		System.out.println("양수이면서 짝수");
		}
	 if(num>0 && num%2==0) {
		 System.out.println("양수이면서 짝수");
	 }
		문제2 - 다음과 같이 출력이 이루어지도록 작성해보자.
	 num < 0 이라면 “0 미만” 출력 
	 0 ≤ num <100 이라면 “0이상 100 미만“ 출력
	 100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
	 200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
	 300 ≤ num 이라면 “300이상 “ 출력
	 
	Scanner scan = new Scanner(System.in);
	int num;
	System.out.print("숫자 = ");
	num = scan.nextInt();
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
	 
		//문제3- if 문으로 고쳐라
		int num1=50, num2=100;
		int big, diff;
		big = (num1>num2)? num1:num2;
		System.out.println(big);
		diff = (num1>num2)? num1-num2: num2-num1;
		System.out.println(diff);	
		
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
//		문제4
		int n=3;
		switch(n) {
		case 1:
		System.out.println("Simple Java");
		break;
		case 2:
		System.out.println("Funny Java");
		break;
		case 3:
		System.out.println("Fantastic Java");
		break;
		default:
		System.out.println("The best programming language");
		}
		System.out.println("Do you like coffee?");
//		문제4- switch문을 if else 문으로
		
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
//		문제5- 문제2를 switch로
		 num < 0 이라면 “0 미만” 출력 
		 0 ≤ num <100 이라면 “0이상 100 미만“ 출력
		 100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
		 200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
		 300 ≤ num 이라면 “300이상 “ 출력
		 
		 switch는 부등호 사용 불가
*/
		 

}
}
	
	
