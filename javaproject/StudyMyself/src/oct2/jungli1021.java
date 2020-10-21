/*
예외처리
예외: 실행 중 발생하는 오류
- 문법이 틀려서 실행이 안되는 경우 해결이 가능하지만,
 실행 중 발생하는 오류는 신뢰도가 떨어지고 이런 경우 문제가 된다.
- try, catch, finally를 이용하여 예외처리를 해준다.
- 예외처리를 많이 할수록 안전한 프로그램이 된다.
- if문을 이용할 수도 있잖아요? if문을 이용하면 프로그램의 주 흐름인지 예외인지 구분이 안가는 게 문제다.
- try-catch 이용하여 예외 처리하기

///////////////////////////////////////////////////1

-예외처리의 장점?: 트랜젝션 구성이 용이하다.
예) ATM: 현금 지급기
1) 카드 확인 (정상여부확인)
2) 비밀번호 확인
3) 출금액 확인
4) 계좌 잔고 DOWN 처리

=> TRY문은 예외상황 발생처리 후 나머지 try문을 건너뛰고 try-catch 이후를 실행한다는 특징이 잇어
트랜젝션 구성이 용이하다.

그래서 적절한 try블록 구성이 중요하다.
예외클래스는 다음과 같다.
• 배열의 접근에 잘못된 인덱스 값을 사용하는 예외상황 
-> 예외 클래스 : ArrayIndexOutofBoundsException
• 허용할 수 없는 형변환 연산을 진행하는 예외상황 
-> 예외 클래스 : ClassCastException 
• 배열선언 과정에서 배열의 크기를 음수로 지정하는 예외상황  
-> 예외클래스 : NegativeArraySizeException 
• 참조변수가 null로 초기화 된 상황에서 메소드를 호출하는 예외상황 
-> 예외 클래스 : NullPointerException


finally블럭
예외의 발생여부와 관계없이 실행되어야 하는 코드를 넣는다.
try{
//예외 발생 가능성이 있는 문장
} catch (Exception1 e1) {
//예외처리를 위한 문장
} finally {
 //예외의 발생여부에 관계없이 항상 수행되어야하는 문장들을 넣는다.
 //finally블럭은 try-catch문의 맨 마지막에 위치해야한다.
 
 예외 발생시) try -> catch -> finally
 예외 미발생) try -> finally
 ////////////////////////////////////////3
 
프로그래머가 직접 정의하는 예외의 상황



////////////////////////////////////이해를 못하겠습니다.

예외클래스의 계층도
Throwable - Exception	- RuntimeException	:프로그래머의 실수로 발생, 예외처리 필수
						- Exception클래스		:사용자의 실수 등 외적 요인, 예외처리 선택
		  - Error	: 메모리 부족등이 원인, 신경 쓸 필요 없음.
 
 
 
예외 발생처리가 너무 귀찮아요!?
-
}catch (exception){

} 
이것만이라도 해주기!
 
*/


package oct2;

public class jungli1021 {

	public static void main(String[] args) {
		
///////////////////1	
int num1=0;
int num2=0;
		
try 
{ 
	System.out.println("나눗셈 결과의 몫: "+(num1/num2)); 
	System.out.println("나눗셈 결과의 나머지: "+(num1%num2));
} catch(ArithmeticException e) { 
	System.out.println("나눗셈 불가능"); 
	System.out.println(e.getMessage());
} 
 
System.out.println("프로그램을 종료합니다."); 


///////////////////3

try {			//예외가 없어도 finally이후 문장이 나옴.
	System.out.println("try 블록에 진입");
} catch (Exception e) {
	System.out.println("예외발생~!");
} finally {
	System.out.println("try 구문에 진입하면 무조건 실행하는 finally 블록");
}
//결과:try 블록에 진입
//    try 구문에 진입하면 무조건 실행하는 finally 블록

try {
	int num = 10/0;
} catch (Exception e) {
	System.out.println("예외발생~!");
} finally {
	System.out.println("try 구문에 진입하면 무조건 실행하는 finally 블록");
}
//예외발생~!
//try 구문에 진입하면 무조건 실행하는 finally 블록



}
}