package arr;

public class UserMain {

	public static void main(String[] args) {
	
	//�������� �����(User)�� �����ؼ� ó��
//	User u1 = new User(1,"king");
//	User u2 = new User(2,"king");
//	User u3 = new User(3,"king");
	
	//10���� �����(User)�� ������ �� �ִ� �迭�� ������
	//�迭�� �������� ������ ����� ��
	//	User user; //��������	: ��ü�� �ּ� �� ����
	User[] users = new User[10];
	// User Ÿ���� �������� 10���� ����� �������� ����
	users[0]= new User(1,"�����1"); //�������� users[0] �������� �����Ѵ�.
	users[1]= new User(2,"�����2"); 
	users[2]= new User(3,"�����3");
	users[3]= new User(4,"�����4");
	users[4]= new User(5,"�����5");
	users[5]= new User(6,"�����6");
	users[6]= new User(7,"�����7");
	users[7]= new User(8,"�����8");
	users[8]= new User(9,"�����9");
	users[9]= new User(10,"�����10");
	//users��� 10ĭ¥�� �迭��
	//0->��ü�� �ּ� -> ���󰡺��� (1, �����1�̳���)
	for(int i=0; i<users.length;i++){
		//users[i] -> ��������
		users[i].showData();
	}
	
	}

}
