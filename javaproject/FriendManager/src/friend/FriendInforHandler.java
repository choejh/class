package friend;

import java.util.Scanner;

public class FriendInforHandler {

// ģ�������� �����ϴ� �迭
	private Friend[] friends;	//ģ���� ������ �����ϴ� �迭
	private int numOfFriends;	//����� ģ���� ���� ����, �迭�� ��� �߰��� index�� ���
	
// �����ڷ� �ʱ�ȭ
	public FriendInforHandler(int num) {
		friends =new Friend[num];
		numOfFriends =0;
	}
		
// �迭�� ģ�� ������ �����ϴ� ���: �������� �̿��� �Ű����� ����
	void addFriendInfo(Friend f) {
		friends[numOfFriends++] = f;
	}

// �� ģ�� : 1 , ����ģ�� : 2
	void addFriend(int choice) {
		
		//����ڷκ��� �⺻ ������ �Է¹��� : �̸�, ��ȭ��ȣ, �ּ�
		Scanner sc = new Scanner(System.in); // ��Ʈ�� ����Ʈ o
		System.out.println("ģ�� ������ �Է��� �����մϴ�.");
		System.out.println("�̸��� �Է����ּ��� >> ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է����ּ���>> ");
		String pNum = sc.nextLine();
		System.out.println("�ּҸ� �Է����ּ���>> ");
		String addr = sc.nextLine();
		
// �ν��Ͻ��� �����ؼ� ����
// �ν��Ͻ� ���� : �� ģ���� ���� ģ���� �ٸ���. 
		if(choice==1) {
		//�� ģ�� ������ �ް� �ν��Ͻ� ���� -> �迭�� ����
		System.out.println("������ �Է����ּ��� >> ");
		String work = sc.nextLine();
		//Friend f = new HighFriend(name, pNum, addr, work);
		addFriendInfo(new HighFriend(name, pNum, addr, work));
		}
		else {
		//���� ģ�� ������ �ް� �ν��Ͻ����� -> �迭�� ����
		System.out.println("������ �Է����ּ���>>");	
		String major = sc.nextLine();
		//���� ģ���� �ν��Ͻ��� �迭�� ����
		addFriendInfo(new UnivFriend(name, pNum, addr, major));
		}
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.\n");
	}	
//��ü ������ ����ϴ� �޼��� : showData() -> �迭 �̿�
	public void showAlldata() {
		System.out.println("��ü �����͸� ����մϴ�.==============");
		for(int i=0; i<numOfFriends;i++) {
			friends[i].showData(); //friends[0] -> Friend Ÿ���� �������� = ����Ŭ������ �ν��Ͻ����� ����
			System.out.println("------------------");
		}
	}
	
	
//��ü �⺻ ������ ����ϴ� �޼��� : showBasicInfo()
	public void showAllSimpleData() {
		System.out.println("������ �����͸� ����մϴ�.===========");
		for(int i=0; i<numOfFriends; i++) {
			friends[i].showBasicInfo();
			System.out.println("-----------------");
		}
		

	}
	
	
	
	
	
	
	
}
