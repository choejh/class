package first;

public class loop1005 {

	public static void main(String[] args) {
		
/*	*반복문*
 		문장 또는 문장들을 반복 수행할 때 사용
 		게시판에서 제목, 작성자, 작성시간, 조회수, 좋아요 x 한페이지에 보여질 게시물 설정할때 사용됨
*/
		
/* 	#for
		반복의 횟수가 중요할 때
		배열을 사용할 때
		for(int i=0 (1) ;i<3 (2) ;i++ (4) )
		{
			System.out.println("~~") (3);
		}
*/
		System.out.println("-------for------");
	// 예시) 1~10까지 정수 더하기	
		int sum = 0;
		for(int j= 1; j<=10; j++) {
			sum += j; // sum = sum+j;
		}
			System.out.println("1~10까지의 합: "+sum);
/*	#for무한 반복
		for(;;) {
			System.out.println("반복할 문장");
		}
*/
		
		
		
/*	#while
		반복의 횟수를 모를 때
		무한반복
		DB, JDBC를 읽을 때 사용
		while(반복조건)
		{
		System.out.println("");  ---> 반복영역
		num++; 					 ---> 탈출을 위한 연산식
		}
		
	##while 반복문의 중첩
		while문 안에 또 while문을 중첩할 수 있다.
*/
		System.out.println("---------while---------");
		
		int i=0;
		while (i<5) {
			System.out.println("자바 안녕 - "+i);
			i++; //탈출을 위한 연산식
		}	
				
/*	#Do while
		do {
		System.out.println(""); ---> 최소 한번은 실행이 된다.
		num++;
		} while(num<5)
*/
		System.out.println("---------do while---------");
		
		i=0;
		do {
		System.out.println("자바 안녕 - "+i);	//---> 최소 한번은 실행
		i++;
		} while (i<0); 

		
		
//	*continue & break"
		
/*	#break
 		자신이 포함된 하나의 반복문 또는 switch문을 빠져나옴.
 */
		System.out.println("---------break문---------");

		// 0부터 몇까지 더해갔을때 합이 100이 넘어가는지 확인하는 프로그램
		sum = 0;
		i = 0;
		while(true) {
			//탈출의 조건
			if (sum>100) {		//if문의 위치는 상황에 따라.
				break;
			}
			i++;	//더하는 수의 증가
			sum+=i; //합을 구하는 연산	
		} //end of while
		System.out.println(i+"를 더했을 때 100이 넘어갑니다. 합이 100이 넘어가는 최초의 값은"+sum);
		System.out.println("-------break문 예시--------");
		//break문 예시
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
		 		System.out.println("찾는 정수 : " + num);  
		 	else    
		 		System.out.println("5의 배수이자 7의 배수를 찾지 못했습 니다.");
		
/*	#continue문
 		자신이 포함된 반복문의 끝으로 이동한다. (다음 반복으로 넘어간다)
 		continue문 이후의 문장들은 수행되지 않는다.
 */
		System.out.println("-------continue문--------");
		//1~10까지의 수 중 3의 배수를 생략하고 출력
		i=0;
		for(i=0; i<11;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("-------continue문 예시--------");
	
		//continue를 이용한 숫자 찾기
		//0~100까지 숫자 중 5의 배수이면서 7의 배수인 숫자 출력, 총 몇개가 존재하는지 갯수 출력
		num=0;
		int count = 0;
		while((num++)<100) {
			//num++;
			if (num%5!=0 || num%7!=0) {	 // !(num%5==0 and num%7==0)
				continue;
			}
			count++;
			
		}
		System.out.println("0~99 사이의 숫자 중 5의 배수이면서 7의 배수인 숫자는 모두"+count+"개가 있습니다.");
		
		//#이름 붙은 반복문 (넘어갔음)
		
		//#반복문의 중첩
		//#for문 중첩 구구단
		//#while문 중첩 구구단
		
		//#break 레이블 
		
 outerLoop: for(i=1; i<10; i++) {
		
			for(int j=1; j<10;j++) {
				System.out.println("["+i+", "+j+"]"); 
				if(i%2==0 && j%2==0) {
					break outerLoop; //많이 쓰면 성능에 안좋음
				}
			}
		}
	
		
		
	}
	
}

