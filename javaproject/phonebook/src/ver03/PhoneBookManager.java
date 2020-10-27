package ver03;

import java.util.Scanner;



public class PhoneBookManager {

	//�迭 : ��ȭ��ȣ ����(�̸�, ��ȭ��ȣ, ����)�� �����ϴ� ����
	
	final PhoneInfor[] phoneBook; //���� ������ ���� �迭 ����
	int cnt; //����� ������ ���� : �ݺ��� Ƚ��, �迭�� ���ο� ������ �Է½� index�� ��밡��
	
//	Scanner sc;
	
	//�ʱ�ȭ
	PhoneBookManager(){
	//	phoneBook = new PhoneInfor[100]; //�迭�� ��������� 100�� ����
		this(100);
	}
	
	PhoneBookManager(int size){
		phoneBook = new PhoneInfor[size];
	//	sc = new Scanner(System.in);
		
	}
		
	// ��� : ����, �˻�, ����
	// ���� ���
	// ����ڷκ��� �����͸� �޾Ƽ� -> �ν��Ͻ��� ���� -> 
	// �迭�� ������ �ν��Ͻ��� �������� ���� : ���� index�� cnt�� �̿�,
	// �����Ŀ��� cnt++
	void insertMember() {
		System.out.println("ģ���� ������ �Է� �����մϴ�.");
		
		//�̸� �Է� �ޱ�
		System.out.println("�̸��� �Է����ּ���. : ");
		String name = Util.SC.nextLine();
		
		//��ȭ��ȣ �ޱ�
		System.out.println("��ȭ��ȣ�� �Է����ּ���. : ");
		String pNum = Util.SC.nextLine();
		
		//���� �ޱ�
		System.out.println("���� ������ �Է����ּ���. : ");
		String birthday = Util.SC.nextLine().trim(); //��������
		
		//�迭�� �����ϱ� ���� �ν��Ͻ��� �������� ����
		PhoneInfor infor = null;
		
		//������ �ԷµǾ����� ���ο� ���� �ν��Ͻ� ������ �ٸ��� ó�� 
		if(birthday !=null && birthday.length()>0) {
			infor = new PhoneInfor(name,pNum, birthday);
		} else {
			infor = new PhoneInfor(name, pNum);
		}
		
		phoneBook[cnt++] = infor; //phoneBook[0] +infor�� �ּ�
		 // cnt++; //�߰��� ������ ������ +1
		 
		 
		
		
		
	}
	
	// ���� �˻�
	// �˻��ϰ��� �ϴ� �̸��� ����ڷκ��� �ް� 
	// �迭�� ���(������->�ν��Ͻ� ����) PhoneInfor.name ������ ���� �˻� �̸��� ��(�����)
	// �ش� index�� ã�� �� �մ�.
	// �˻��� index�� ���� ���
	void searchMember () { 
		if(cnt==0) {
			System.out.println("����� ������ �����ϴ�. �ٽ� �޴��� �̵��մϴ�.");
			return;
		}
		//ã���� �ϴ� �̸��� �޴´�.
		System.out.println("���� �˻��� �����մϴ�.");
		System.out.println("ã���� �ϴ� �̸��� �Է����ּ���. : ");
		String name = Util.SC.nextLine();
		
		//�̸��� ��� index �˻�
		int index = searchIndex(name);
		
		
		
		//int index = -1;
		
		//�˻�: index�� ã�´�.
//		for(int i=0; i<=cnt;i++) {
//			if(phoneBook[i].name.equals(name)) {
//				index=i;
//				break;
//			}
//		}
//		
		if(index<0) {
		System.out.println("ã���ô� �̸��� ������ �������� �ʽ��ϴ�.");
		} else {
			//�������
			phoneBook[index].showInfor();
		}
	}
	//�̸� ���ڿ��� �޾Ƽ�, 
	//�迭�� ������ ���ϰ�,
	//index�� ã�Ƽ� ��ȯ�ϴ� �޼���
	int searchIndex(String name) {
		int result= -1;
		
		//�˻�: index�� ã�´�.
		for(int i=0; i<=cnt;i++) {
			if(phoneBook[i].name.equals(name)) {
				result=i;
				break;
			}
		}
		
		
		return result;
	}
	
	
	// ���� ����
		// �����ϰ��� �ϴ� �̸��� ����ڷκ��� �޴´� ->
		// �迭���� �̸����� �˻��ؼ� index�� ã�´�
		// �迭���� ã�� index�� �������� ���� : �ν��Ͻ��� �����ϴ� ���������� ������ ���� �ȴ�
		// �������� null�� �Է��ϰų�, �ٸ� �ּҰ��� �Է� -> ������ �ִ� �������� ��������.
		// ���� ����� index ���� �������� ���� ����Ʈ ó��
		// cnt-1
		void deleteMember() {

			if (cnt == 0) {
				System.out.println("��ϵ� ������ �����ϴ�.");
				return;
			}

			System.out.println("���� ������ �����մϴ�.");
			System.out.println("���� �ϰ��� �ϴ� ������ �̸��� �Է����ּ���.");
			String name = Util.SC.nextLine();

			// �̸��� ��� index �˻�
			int index = searchIndex(name);

			// �˻� : index�� ã�´�.
//			for (int i = 0; i < cnt; i++) {
//				if (phoneBook[i].name.equals(name)) {
//					index = i;
//					break;
//				}
//			}

			if (index < 0) {
				System.out.println("���� �ϰ��� �ϴ� ������ �������� �ʽ��ϴ�.");
			} else {
				// ���� ó�� : �����ؾ��ϴ� index ���� �������� ����Ʈ ó��
				// index = 3;
				// phoneBook[3] = phoneBook[4]
				// phoneBook[4] = phoneBook[5]
				for (int i = index; i < cnt - 1; i++) {
					phoneBook[i] = phoneBook[i + 1];
				}

				cnt--;

				System.out.println("������ ���� �߽��ϴ�.");
			}

		}

	
	//��ü ���� ���
	void displayAll() {
		
		if(cnt==0) {
			System.out.println("��ϵ� ������ �����ϴ�.");
			return;
		}
		
		System.out.println("��ü ������ ����մϴ�.("+cnt+")");
		System.out.println("----------------------");
		
		for(int i=0; i<cnt; i++) {
			phoneBook[i].showInfor();
			System.out.println("----------------------");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	



}