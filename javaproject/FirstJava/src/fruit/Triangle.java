package fruit;

public class Triangle {

	//�ﰢ�� ���� = �غ�x����/2
	//��Ǯ�̹�
	int mit =0;
	int height =0;
	
	int Tri(int mit, int height) {
	
		int result = mit*height/2;
		System.out.println("�ﰢ���� ����= "+result);
		return result;
	}
	//������ ���
	
	float width; //�ﰢ���� �غ�
	float height2; //�ﰢ���� ����
	
	//�޼��� : ������ ���� �����ϴ� �޼���, �ﰢ���� ���̸� ���ϰ� ����� ��ȯ�ϴ� �޼���
	//������ ���� �����ϴ� �޼���
	
	void setData(float w,float h) {
		width = w;
		height2=h;
	}
	//�ﰢ���� ���̸� ���ϰ� ����� ��ȯ�ϴ� �޼��� : �غ�*����/2 => ����� �Ǽ� Ÿ������
	float area() {
		float resultt = 0.0f;
		resultt = width * height2 /2;
		return resultt;
	}

	
//	float area() {
//		return width * height / 2;
//	}								���߿� �̷���
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		
		//�غ��� ���� ���� ����
		t.setData(10, 3);
		
		// ���̸� ���ϰ� ������ ��´�.
		float resultt =t.area();
		
		System.out.println(resultt);
		
	}
	
}
