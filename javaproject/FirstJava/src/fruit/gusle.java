package fruit;

public class gusle {
	//��������
		int kid1=0;	//��� 1�� ������ ����
		int kid2=0;	//��� 2�� ������ ���� 

		//���� ������ ������ ��´�.
		void setData(int k1,int k2) {
			kid1 = k1;
			kid2 = k2;
		}
		
		//����ġ�� ������ �����Ѵ�. 
		//1�� ��̸� �������� ������ �ְ�޴� ������ �ִ´�. 
		void game (int gusleplus) { //1�� ��� ���� ������ ������ + ������ ������ -
		kid1+=gusleplus;
		kid2-=gusleplus;
		}

		//����ġ�� ������ ��� 
		
		 void ggusleresult(){ System.out.println("���1�� ������ ���� ����="+kid1);
		 System.out.println("���2�� ������ ���� ����="+kid2); }
		 
		//���� �Ѱ� ������ �̰� Ǯ��
		/*
		 * public static void main(String[] args) { // �޸𸮿� ��� gusle g = new gusle(); //
		 * �����ϰ� �ִ� ������ ����(���1,���2) g.setData(15, 9); //1�� ���ӿ��� ��� 1�� ��� 2�� ���� 2����
		 * ȹ���Ѵ� g.game(2); //2�� ���ӿ��� ��� 2�� ��� 1�� ���� 7���� ȹ���Ѵ�. g.game(-7); //����� ���� ����
		 * ���� ��� g.ggusleresult(); //���1�� ������ ���� ����=10 //���2�� ������ ���� ����=14 }
		 */
		
		 
		 
		//������ ���
		
		int numOfMarble;
		String name;
		
		//����� �̸��� ������ ������ �����ϴ� �޼���
		void setBoy(String boyName, int num) {
			name = boyName;
			numOfMarble = num;
		}
		
		//������ ����� ���� -> ������ ������ ����
		void lose(int num) {
			numOfMarble -= num;
			
		}
		//������ ����� ���� -> ������ ������ ����
		void win(int num) {
			numOfMarble +=num;
		}
		
		//���� �� �¸� �޼���: ���(Boy),������ ����
		void playWin(gusle boy, int num) {
			// ���� �¸� -> ���� ������ ������ ����
			win(num);
			//������ �й� -> ������ ����
			boy.lose(num);
			
		}
		
		//������ ������ ����ϴ� �޼���
		void showData() {
			System.out.println(name+"�� ������ ������ " + numOfMarble);
		}
		
		public static void main(String[] args) {
			
			gusle boy1 = new gusle();
			gusle boy2 = new gusle();
			
			//��̵� ��������
			boy1.setBoy("���1", 15);
			boy2.setBoy("���2", 9);
			
			System.out.println("������ �����Ҷ� ��̵��� ������ ���� ����");			
			boy1.showData();
			boy2.showData();
			//1������ ���1+����2
			boy1.playWin(boy2, 2);
			System.out.println("\n1������ ���1�¸� 2�� ȹ��");
			boy1.showData();
			boy2.showData();
			//2������ ���2+����7
			boy2.playWin(boy1, 7);
			System.out.println("\n2������ ���2�¸� 7�� ȹ��");
			boy1.showData();
			boy2.showData();
			//���� ���� ���
			System.out.println("\n���� ���� �� ���");
			boy1.showData();
			boy2.showData();
			
			
			
			
			
			
			
			
		}
			
		
}
