package ver05;

import ver03.Util;

public class PhoneBookManager {

	// ��ȭ��ȣ ������ ������ �迭�� ������,
	// �迭�� �̿��� ������ ����, ����, ����� �ϴ� ���
	
	// �迭 ���� : ��� �����̱⶧���� PhoneinfoŸ������ ����
	PhoneInfo[] pBook;	//��ȭ��ȣ ������ ������ �迭
	int cnt;			//�迭�� ����� ����� ����, �迭��  index
	
	// ������ : �̱��� ó�� -> �ܺο��� �ν��Ͻ� ������ ���� 
	private PhoneBookManager(int num) {
		pBook = new PhoneInfo[num]; //�������� �Ű������� ���ڸ� ���� �޾� �迭 ����
		cnt = 0;
	}
	
	//���ο��� �ν��Ͻ� ����
	private static PhoneBookManager manager = new PhoneBookManager(100);
	
	//�ܺο��� ���������� ���� �� �ִ� �޼��� 
	public static PhoneBookManager getInstance() {
		return manager;
	}
	
	//���� ����
//	1. �迭�� ���� �޼��� �������� �̿��ؼ� �ϳ��� �޼���� ���� addInfor(����Ŭ����Ÿ���� �Ű�����) 
//	2. ����ڿ��� ���� �����͸� �ν��Ͻ� ���� �޼���
//		�Է��� ���� -> ���п� ���� �ν��Ͻ� ������ ���� -> addInfor() �޼��带 �̿��ؼ� ���� ����

	// �迭�� ��ȭ��ȣ ������ �����ϴ� �޼��� 
	private void addInfor(PhoneInfo info) {
		pBook[cnt++] = info;
	}
	
	
	//��ȭ��ȣ ������ �ν��Ͻ� �����ϰ� �迭�� ����
	public void insertInfo() {
		//100�� �Է� 0<=index <=99, cnt =100
		//pBook[100] -> ����
		//�迭�� ������ �Էµ� ����� ������ ��
		if(pBook.length==cnt) {
			System.out.println("���̻� ������ ������ �� �����ϴ�.");
			System.out.println("�Ϻ� ������ �����ϰ� ���� ������ Ȯ�����ּ���");
		}
		System.out.println("� ������ �Է��Ͻðڽ��ϱ�?");
		//System.out.println("1. �⺻"); //�߻�Ŭ����-> �ν��Ͻ� �����Ұ�
		System.out.println(Menu.UNIV+". ����");
		System.out.println(Menu.COM+". ȸ��");
		System.out.println(Menu.CAFE+". ��ȣȸ");
		
		int select = Util.SC.nextInt();
		
		Util.SC.nextLine();
		if(!(select>0 && select<4)) {
			System.out.println("�޴� ������ �ùٸ��� �ʽ��ϴ�.");
		System.out.println("�ʱ� �޴��� ���ư��ϴ�..");
		return;
	}
	
		System.out.println("���� �Է��� �����մϴ�.");
		System.out.println("�̸� >> ");
		String name = Util.SC.nextLine();
		System.out.println("��ȭ��ȣ >> ");
		String PNum = Util.SC.nextLine();
		System.out.println("�ּ� >> ");
		String addr = Util.SC.nextLine();
		System.out.println("�̸���>> ");
		String email = Util.SC.nextLine();
		
		switch(select) {
//		case 1:
//			//�ν��Ͻ� ���� -> �迭�� ����
//			addInfor(new PhoneInfo(name, PNum, addr, email));
//		break;	
		case Menu.UNIV:
			//�߰� ���� �ް� -> �ν��Ͻ� ���� -> �迭�� ����
			//����, �г�
			System.out.println("����>> ");
			String major = Util.SC.nextLine();    
			System.out.println("�г�>> ");
			int grade = Util.SC.nextInt();
			addInfor(new univPhoneInfo(name, PNum, addr, email, major, grade));
			break;
		case Menu.COM:
			//�߰� ���� �ް� -> �ν��Ͻ� ���� -> �迭�� ����
			System.out.println("ȸ���̸�>> ");
			String company = Util.SC.nextLine();
			addInfor(new CompanyPhoneInfo(name, PNum, addr, email, company)); //������ ������ 
			break;
		case Menu.CAFE:
			//�߰� ���� �ް� -> �ν��Ͻ� ���� -> �迭�� ����
			//��ȣȸ �̸�, �г���
			System.out.println("��ȣȸ �̸�>> ");
			String cafeName = Util.SC.nextLine();
			System.out.println("�г���>>");
			String nickName = Util.SC.nextLine();
			addInfor(new cafePhoneInfo(name, PNum, addr, email, cafeName, nickName));
			break;
		}
		System.out.println("�Է��Ͻ� ������ ����Ǿ����ϴ�.(���尳��:"+cnt+")");
	}

	
	// ���� �˻�
	// �迭�� index �� ã�� �޼���
	public int searchIndex(String name) {
		int index = -1; //������ ���� ��
		
		for(int i = 0; i<cnt; i++) {
			//�̸����� ��
			if(pBook[i].getName().equals(name)) {
				index = i; 
			}
		}
		return index;
	}

	// �ش� index�� ���������� ���� ��� : ����ڰ� �Է��� �̸����� �˻�
	public void searchInfor() {
		Util.SC.nextLine();
		System.out.println("�˻��Ͻ� �̸��� �Է����ּ���.");
		
		String name = Util.SC.nextLine();
		
		int index = searchIndex(name);
		if(index<0) {
			System.out.println("ã���ô� �̸�'"+name+"'�� ������ �������� �ʽ��ϴ�");
			System.out.println("�޴��� ���ư��ϴ�.");
		} else {
			System.out.println("�˻� ��� =====================");
			pBook[index].showInfor();
		}
	}
	
	//����ڿ��� �̸��� �Է� �ް� �̸����� �˻� �� �� ������ ����
	public void deleteInfor() {
		if(cnt==0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		Util.SC.nextLine();
		System.out.println("�����ϰ����ϴ� ������ �̸��� �Է����ּ���.");
		String name = Util.SC.nextLine();
		///////////////////////////////////////////////////////�����ϳ� ��ħ
		int index = searchIndex(name);
		if(index<0) {
			System.out.println("ã���ô� �̸�'"+name+"'�� ������ �������� �ʽ��ϴ�.");
			System.out.println("�޴��� �̵��մϴ�.");
		} else {
			//�迭�� ��Ҹ� �������� ����Ʈ
			for(int i= index; i<cnt-1; i++) {
				pBook[i]=pBook[i+1];
			}
			cnt--;	//����� ������ ����
			System.out.println("��û�Ͻ� �̸��� ������ �����߽��ϴ�.");
		}
		
	}
	
	
	// ��ü ������ ����ϴ� �޼���
	public void showAllInfor() {
		if(cnt==0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		System.out.println("��ü ������ ��� �մϴ�.=================");
		for(int i=0; i<cnt; i++) {
			pBook[i].showInfor();
			System.out.println("============================");
		}
	}













}
