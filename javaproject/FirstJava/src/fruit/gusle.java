package fruit;

public class gusle {
	//변수정의
	int kid1=15;	//어린이 1이 원래 보유한 구슬 15개
	int kid2=9;		//어린이 2가 원래 보유한 구슬 9개

	//어린이의 구슬 이동
	void ggusle (int plus1,int plus2) {//plus1은 어린이 1이 딴 구슬 //plus2는 어린이2가 딴 구슬
	kid1+=plus1;
	kid2-=plus1;
	kid1-=plus2;
	kid2+=plus2;
	}

	void ggusleresult(){
		System.out.println("어린이1이 보유한 구슬 갯수"+kid1);
		System.out.println("어린이2가 보유한 구슬 갯수"+kid2);
	}
	
	public static void main(String[] args) {
		
		gusle g = new gusle();
	//1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다
		g.ggusle(2, 0);
	//2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다.	
		g.ggusle(0, 7);
	//어린이의 보유 구슬 개수 출력	
		g.ggusleresult();
	}
}
