package fruit;

public class gusle {
	//변수정의
		int kid1=0;	//어린이 1가 보유한 구슬
		int kid2=0;	//어린이 2가 보유한 구슬 

		//구슬 갯수의 정보를 담는다.
		void setData(int k1,int k2) {
			kid1 = k1;
			kid2 = k2;
		}
		
		//구슬치기 게임을 시작한다. 
		//1번 어린이를 기준으로 구슬을 주고받는 정보를 넣는다. 
		void game (int gusleplus) { //1번 어린이 기준 구슬을 얻으면 + 구슬을 잃으면 -
		kid1+=gusleplus;
		kid2-=gusleplus;
		}

		//구슬치기 게임의 결과 
		
		 void ggusleresult(){ System.out.println("어린이1이 보유한 구슬 갯수="+kid1);
		 System.out.println("어린이2가 보유한 구슬 갯수="+kid2); }
		 
		//내가 한거 보려면 이거 풀어
		/*
		 * public static void main(String[] args) { // 메모리에 등록 gusle g = new gusle(); //
		 * 보유하고 있던 구슬의 갯수(어린이1,어린이2) g.setData(15, 9); //1차 게임에서 어린이 1은 어린이 2의 구슬 2개를
		 * 획득한다 g.game(2); //2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다. g.game(-7); //어린이의 보유 구슬
		 * 개수 출력 g.ggusleresult(); //어린이1이 보유한 구슬 갯수=10 //어린이2가 보유한 구슬 갯수=14 }
		 */
		
		 
		 
		//선생님 방식
		
		int numOfMarble;
		String name;
		
		//어린이의 이름과 구슬의 개수를 설정하는 메서드
		void setBoy(String boyName, int num) {
			name = boyName;
			numOfMarble = num;
		}
		
		//게임의 결과가 실패 -> 구슬의 개수를 감소
		void lose(int num) {
			numOfMarble -= num;
			
		}
		//게임의 결과가 성공 -> 구슬의 개수를 증가
		void win(int num) {
			numOfMarble +=num;
		}
		
		//게임 후 승리 메서드: 대상(Boy),구슬의 개수
		void playWin(gusle boy, int num) {
			// 나는 승리 -> 나의 구슬의 개수는 증가
			win(num);
			//상대방은 패배 -> 구슬을 감소
			boy.lose(num);
			
		}
		
		//구슬의 개수를 출력하는 메서드
		void showData() {
			System.out.println(name+"의 구슬의 개수는 " + numOfMarble);
		}
		
		public static void main(String[] args) {
			
			gusle boy1 = new gusle();
			gusle boy2 = new gusle();
			
			//어린이들 보유구슬
			boy1.setBoy("어린이1", 15);
			boy2.setBoy("어린이2", 9);
			
			System.out.println("게임을 시작할때 어린이들이 보유한 구슬 정보");			
			boy1.showData();
			boy2.showData();
			//1차게임 어린이1+구슬2
			boy1.playWin(boy2, 2);
			System.out.println("\n1차게임 어린이1승리 2개 획득");
			boy1.showData();
			boy2.showData();
			//2차게임 어린이2+구슬7
			boy2.playWin(boy1, 7);
			System.out.println("\n2차게임 어린이2승리 7개 획득");
			boy1.showData();
			boy2.showData();
			//보유 구술 출력
			System.out.println("\n게임 종료 후 결과");
			boy1.showData();
			boy2.showData();
			
			
			
			
			
			
			
			
		}
			
		
}
