package first;

public class operator0929 {

	public static void main(String[] args) {
	
/* 연산자
 
 a+b
 연산자 : + - / *
 
 피연산자 : a, b
 
 단항 : 피연산자가 1개
 이항 : 피연산자가 2개
 삼항 : ? :(비교, 참 거짓)
 
 연산자들은 순서를 갖는다.
 
 ex) int num3 (2) = num1+num2 (1)
 
 비교연산-> boolean
 산술연산-> 숫자
 논리연산-> true/false
 
알고리즘	 -> 특정 패턴 		-> 연산식
ex)			짝수 판별			n%2==0(true, false)

=> 내가 원하는 패턴을 연산식으로 만드는 것이 목적


#연산자의 종류
단항 연산자 ++ -- + - ~ !
(long)num

boolean check = true ;
!check = false ; 

산술 연산자 & / %
		+ -
		<< >> >>> (쉬프트연산)(사용빈도 적음) 

비교 연산자 < > <= >= instanceof (클래스 객체-> 상속 다형성)
		== != (같지 않니?)

논리 연산자 & ^ |
		&& 
		|| 

삼항 연산자 ?:
대입 연산자 = *= /= %= += -= <<= >>= >>>= &= ^= |=



#연산자의 우선순위
- 괄호
- 산술 > 비교 > 논리 > 대입
- 단항 > 이항 >삼항
- 연산자의 연산 진행방향은 왼쪽에서 오른쪽
    단, 단항 대입 연산자만 오른쪽에서 왼쪽

7 + 1 - 5 ( 7 -> 1 -> -5 )
a = b = 3 ( 3->b->a )


#연산자의 결과

ex1) -x + 3 단항 > 이항
ex2) x + 3 * y 곱셈,나눗셈 > 덧셈, 뺄셈
ex3) x +3 > y - 2 산술 > 비교	 	x+3 -> y-2 -> >
ex4) x>3 && x<5 비교> 논리 			x>3 -> x<5 -> &&
ex5) int result = x + y * 3  	y*3 -> x+ y*3 -> int result = ~



#주의점

1. <<, >>, >>> 는 덧셈 연산자보다 우선순위가 낮다.
2. ||, |(or) 은 &&, &(and)보다 우선순위가 낮다.
x < -1 || x > 3 && < 5
x < -1 || (x > 3 && x < 5) 와 같다.


#나눗셈 연산자
int share = 10/8; --> 1
10%-8 -> 2
-10% 8 -> -2
-10%-8 -> -2

(float)7/3
(float)int/int
(float)/int
float/float => float

int -> long -> float -> double
 		
 		
#복합대입

a = a+b		a += b
a = a-b		a -= b
a = a*b		a *= b
a = a/b		a /= b
a = a%b		a %= b


# 관계 비교 연산자
'a' < 'b'		-> 65 < 66		true
'0' == 0		-> 48 == 0		false
'A' != 65		-> 65 != 65		false
10.0d == 10.0f	->10.0d == 10.0d true
0.1d == 0.1f	->0.1d == 0.1d	false	*****


#논리연산자

논리값 ______ 논리값
	   &&	and -> 교집합
	   ||	or	-> 합집합

ex) id pw => && 로 표현됨
ex2) i > 3 && i <5	=>	<3~<5
ex3) i > 3 || i <0		
ex4) !( i>3 || i<0 ) => 3~5 

#이항연산자
이항연산자는 연산 수행 전 피연산자의 타입을 일치시킨다.
byte + short -> int + int
char + int -> int + int

byte a=10;
byte b=20;
byte c = a+b;
byte+byte => int +int -> int

byte c = (byte)a + b; //error
byte c = (byte)(a+b); //ok

#이항연산자의 특징
math.round(): 소수점 첫째자리에서 반올림한 값을 반환
float pi = 3.141592f;

Math.round(pi*1000)/1000f;

#증가 감소연산자
val = ++n; 	val = val+1; 먼저 증가됨
val = --n;	val = val-1;

val = n++; n값을 먼저 대입하고 증가시킴
val = n--; 


#조건문과 반복문
프로그램의 흐름 컨트롤
id __________
pw __________
id와 pw가 같은지 확인


#if문

#Switch와 break
-조건식의 계산결과와 일치하는 case문으로 이동 후 break문을 만날때까지 문장들을 수행한다.
 (break문이 없으면 switch문의 끝까지 진행한다.)
-일치하는 case문의 값이 없는 경우 default문으로 이동한다.
 (default문 생략가능)
-case문의 값으로 변수를 사용할 수 없다.
 (리터럴, 상수만 가능)
 
 switch(조건식) {
 	case 1: 조건식=1이면 수항할 문장.
 	break;
 	
 	case 2:
 	break;
 	
 	default:
 	break;
 	
 	권한 1-> 읽기
 	권한 2-> 쓰기
 	권한 3-> 수정
 	권한 4-> 삭제
 	=> 무슨말인지?


 */

		
		

	}

}
