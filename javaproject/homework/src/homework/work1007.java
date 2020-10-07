package homework;

public class work1007 {
/*
 문제1
두 개의 정수를 전달받아서, 두수의 사칙연산 결과를 출력하는 메서드와 이 메서드를 호출하는 main메서드를 정의해보자.
단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.

문제2.
두 개의 정수를 전달 받아서, 두수의 절대값을 계산하여 출력하는 메서드와 이 메서드를 호출하는 main메서드를 정의해 보자.
 단 메서드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되어서 출력되어야 한다.

문제3
원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메서드와 원의 둘레를 계산해서 반환하는 메서드를 각각 정의하고,
 이를 호출하는 main메서드를 정의하자. (2*π*r), (π*r∧2)

​문제4.
전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 소수인경우 true를, 소수가 아닌 경우 false를 반환하는
 메서드를 정의하고, 이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.
 */

//문제1
	//변수를 정의한다.
	int a=0,b=0;
	//데이터를 전달받는다.
	void setData(int aa,int bb) {
		a = aa;
		b = bb;
	}
	//두수의 사칙연산 결과 출력
	int plus() {
		int resultPlus = a+b;
		return resultPlus;
	}
	int minus() {
		int resultMinus = a-b;
		return resultMinus;
	}
	int multiply() {
		int resultMultiply = a*b;
		return resultMultiply;
	}
	int division() {
		int resultDivision = a/b;
		return resultDivision;
	}
	double  remainder( ) {
		int pre = a/b;
		double resultRemainder = (double)a/b-pre;
		return resultRemainder;
	}

 public static void main(String[] args) {
		work1007 w = new work1007();
		w.setData(15, 7);
		int plus = w.plus();
		int minus= w.minus();
		int multi= w.multiply();
		int divide= w.division();
		double remain= w.remainder();

		System.out.println("a+b="+plus);
		System.out.println("a-b="+minus);
		System.out.println("axb="+multi);
		System.out.println("a/b="+divide);
		System.out.println("a/b의 나머지="+remain);
		
		
	}
	
	
}
