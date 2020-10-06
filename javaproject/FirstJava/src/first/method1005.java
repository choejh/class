package first;

public class method1005 {

	public static void main(String[] args) {

		
/*	#메서드
 		객체가 가지는 함수
 		함수: 특정 데이터를 받고 처리한 후 결과값을 반환하는 기능
 		자바: 객체 지향
 		자바: 함수라는 표현x 메서드를 만들어서 쓴다.
		
		메서드 이름: main
		메서드 중괄호 내에 존재하는 문장들이 위에서 아래로 순차적 실행
		
		class: 실행의 시작 위치
		
		매서드란:작업을 수행하기 위한 명령문의 집합
		어떤 값을 입력받아서 처리하고 그 결과를 돌려준다.
		1) 값을 받고 2) 처리하고 3) 반환한다. --> 1,3은 선택이다. 
		메서드의 장점:
		반복 코드를 줄이고 코드 관리가 용이하다.
		반복적으로 수행되는 여러 문장을 메서드로 작성한다.
		하나의 메서드는 하나의 기능만 수행하도록 작성하는 것이 좋음.
		관련된 여러 문장은 메서드로 작성.

//		ex)	숫자두개를 받고 더하기 연산 결과반환
 		int int	  int+int	 int
 		
		리턴타입  메서드이름 (타입 변수명, 타입 변수명, ...)
		int			   	숫자1		숫자2
						int n1	int n2
 		n1+n2
 		return n1+n2 (리턴타입과 같아야한다.)
 		
// 		int add(int a, int b)
 		{
 			int result = a+b;
 			return result;
 		}
 		
 		
 //		void power() {	//반환값이 없는 경우 리턴타입 대신 void를 사용한다.
 			power = !power;
 		}
 		  		
 */
	//만든 메소드 사용
		
		MyMath my = new MyMath(); //메모리에 올린다.
		System.out.println(my.add(1,5));
		
		my.sayHello();
		my.plus(10, 20);
		
		System.out.println(my.check());	
		
		my.div(10, 2);
		my.div(10, 0); //error
		
		
		
		
		
//		static void hiEveryone() {
//			System.out.println("안녕하세요");
//	}
	
/*	#메서드 종료
 		- 메서드 블럭{} 끝에 도달했을 때
 		- 메서드 블럭{} 수행 중 return문을 만났을때
 		-- return문의 개수는 최소화하는 것이 좋다.
 		-- 반환값이 있는 메서드는 모든 경우에 return문이 있어야 한다.
 			int max(int a, int b){
 			if(a>b)
 				return a;
 			else
 				return b;
 			}
 			
 		-- return은 값의 반환, 메서드의 종료 두 가지의 의미를 지님
 */

/*	#메서드 오버로딩
 		메소드 오버로딩이랑 동일한 이름의 메소드를 둘이상 동시에 정의하는 것
 		메소드 매개변수 선언(개수or자료형)이 다르면 메소드 오버로딩 가능
 		오버로딩 된 메소드 호출시 전달하는 인자를 통해서 구분됨
		매개변수는 같고 리턴타입이 다른 경우 오버로딩 성립x
		
		system.out.println(true );
		# 오버로딩의 예
		int add(int a, int b)
		int add(int x, int y)
		위의 사례는 오버로딩이 아니다. 
		long add(int a, long b)
		long add(long a, int b) 는 오버로딩이다.
		
	#자바의 이름 규칙
		클래스: 대문자로 시작, 둘 이상의 단어가 묶여서 하나의 이름 구성 시 새 단어는 대문자로 시작 
		class PersonName
		인스턴트 변수, 메소드 이름 : 소문자로 시작. 둘이상의 단어가 묶여서 하나의 이름 구성 시 새단어는 대문자로 시작 
		int addYourMoney(int money)
		int yourAge
		상수 이름: 전부 대문자, 둘이상의 단어가 묶여서 하나의 이름 구성시 두단어 사이에 _삽입.
		final int COLOR=7
		final int COLOR RAINBOW=7
		
*/		
	}

}
