package fruit.ver02;

/*
 	파일이름 : FruitSeller.java
 	설명 : 사과 장수의 객체를 정의
 	작성일시 : 2020.10.08
 	수정내용 : fruit.FruitSeller.java를 기반으로 생성자를 추가
  
 */

public class FruitSeller {
//클래스에는 변수와 메서드를 정의
//성격이 비슷한 변수 메서드를 정의
	
	//수정:2020.10.08
	//	  변수의 초기화를 생성자에서 처리, 변수 선언시에 초기화 코드 삭제
	//변수: 인스턴스 변수, 멤버 변수
	//int applePrice = 1000; 		//사과의 가격
	final int APPLE_PRICE; 	//사과의 가격, 변경 불가-상수선언
	private int numOfApple;			//사과의 보유 개수
	private int myMoney;				//수익 금액
	
	//2020.10.08 생성자 추가
	FruitSeller() {
		this(0,20,1000); //푸룻셀러 호출 컨트롤키+마우스
	}
	
	FruitSeller(int money, int num, int price) {
		APPLE_PRICE=price;
		numOfApple=num;
		myMoney=money;
	}
	
	FruitSeller(FruitSeller seller){ //생성자
		//APPLE_PRICE = seller.APPLE_PRICE;
		//numOfApple = seller.numOfApple;
		//myMoney = seller.myMoney;
		this(seller.myMoney,seller.numOfApple, seller.APPLE_PRICE);
	}
	
	//기능: 판매, 정산 출력
	//판매 메서드 : 
	//		돈을 받고 -> 
	//			반환하는 사과의 개수, 
	//			수익금 증가, 
	//			보유한 사과의 개수가 감소 -> 
	//		사과 개수 반환
	int saleApple(int money) {
		
		int num = 0;	//반환할 사과의 개수, 지역변수는 반드시 초기화 해야한다.
		
		// 반환할 사과의 개수를 구한다.
		num = money/APPLE_PRICE; // 받은 돈 / 사과가격
		// 수익금 증가
		myMoney = myMoney+money;
		//사과의 개수를 감소
		numOfApple = numOfApple - num;
		
		return num;
	}
	// 정산 출력: 보유한 사과의 개수 출력, 보유한 금액 출력, 
	// 받는 데이터가 없음으로 매개변수 정의하지 않는다.
	// 반환하는 데이터가 없으므로 반환타입을 void로 메서드 정의
	void showSaleResult() {
		System.out.println("현재 보유한 사과의 개수: " + numOfApple);
		System.out.println("판매 수익 금액: " + myMoney);
	}

	
	//내 생각에 int가 붙으면 seller(인스턴스). 했을 때 안나오고
	//void가 붙으면 seller. 했을 때 나온다.
	
	
	
	
	
	
	
}

