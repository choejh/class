package fruit;

public class gusle {
	//��������
	int kid1=15;	//��� 1�� ���� ������ ���� 15��
	int kid2=9;		//��� 2�� ���� ������ ���� 9��

	//����� ���� �̵�
	void ggusle (int plus1,int plus2) {//plus1�� ��� 1�� �� ���� //plus2�� ���2�� �� ����
	kid1+=plus1;
	kid2-=plus1;
	kid1-=plus2;
	kid2+=plus2;
	}

	void ggusleresult(){
		System.out.println("���1�� ������ ���� ����"+kid1);
		System.out.println("���2�� ������ ���� ����"+kid2);
	}
	
	public static void main(String[] args) {
		
		gusle g = new gusle();
	//1�� ���ӿ��� ��� 1�� ��� 2�� ���� 2���� ȹ���Ѵ�
		g.ggusle(2, 0);
	//2�� ���ӿ��� ��� 2�� ��� 1�� ���� 7���� ȹ���Ѵ�.	
		g.ggusle(0, 7);
	//����� ���� ���� ���� ���	
		g.ggusleresult();
	}
}
