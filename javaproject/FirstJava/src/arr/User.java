package arr;

public class User {
	
	// "�����"�� �����͸� ���� : �̸� , ���̵�(����)
	// �����(1), ������(2) 
	int id;			//������� ���̵�
	String name;	//������� �̸�

	//������
	User(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void showData() {
		System.out.println(name+"("+id+")"); 
		
		
	}
	
}