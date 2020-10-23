package ver05me;

import java.util.Scanner;

import ver03.Util;

public class PBManager implements Menu {
	
	Scanner sc = new Scanner(System.in);
//�⺻����
	
	PhoneInfo[] pBook;
	int cnt;
	
	//�����ڸ� �̱��� ó���ؼ� �ܺο��� �ν��Ͻ� ���� ����	
	private PBManager (int num) {
		pBook = new PhoneInfo[num];
		cnt=0;		
	}
	private static PBManager manager = new PBManager(100);
	
	//?
	public static PBManager getInstance() {
		return manager;
	}
	
//����
	//�迭�� ��ȭ��ȣ ����
	private void addInfor(PhoneInfo info) {
		pBook[cnt++] = info;
	}
	
	//��ȭ��ȣ ���� �ν��Ͻ� ���� �迭 ����
	public void insertInfo() {
		System.out.println("�Է��Ͻ� �޴��� ������.");
		System.out.println(Menu.UNIV+".����");
		System.out.println(Menu.COM+".ȸ��");
		System.out.println(Menu.Cafe+".��ȣȸ");
		int select = sc.nextInt();
	//1~3�ܿ� �ٸ� ��ȣ�� �����Ѵٸ�?	
	if(!(select>0 && select<4)) {
		System.out.println("�޴� ������ �ùٸ��� �ʽ��ϴ�.");
		System.out.println("�ʱ� �޴��� ���ư��ϴ�.");
		return;
	}
	//�������� ����
		System.out.println("������ �Է��մϴ�.");
		sc.nextLine();
		System.out.println("�̸�: ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ: ");
		String pNum = sc.nextLine();
		System.out.println("�ּ�: ");
		String addr = sc.nextLine();
		System.out.println("����: ");
		String birth = sc.nextLine();
	//�׷캰 ���� ����
	switch(select) {
	case Menu.UNIV:
		System.out.println("����: ");
		String major = sc.nextLine();
		addInfor(new UnivPhoneInfo(name, birth, pNum, addr, major));
		break;
	
	case Menu.COM:
		System.out.println("ȸ���̸�: ");
		String company = sc.nextLine();
		addInfor(new CompanyPhoneInfo(name, birth, pNum, addr, company));
		break;
	case Menu.Cafe:
		System.out.println("��ȣȸ�̸�: ");
		String cafeName = sc.nextLine();
		addInfor(new cafePhoneInfo(name, birth, pNum, addr, cafeName));
		break;
	}
		System.out.println("���� ������ �Ϸ� �Ǿ����ϴ�.");
	}
	
	
	
//���
	public void showAllInfor() {
		if(cnt==0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		System.out.println("��ü ������ ����մϴ�.");
		for(int i=0; i<cnt; i++) {
			pBook[i].showPBook();
			System.out.println("=============");
		}
		
		
	}
//�̴Ϲ��� ���
	public void showBasic() {
		if(cnt==0) {
			System.out.println("�Էµ� ������ �����ϴ�");
			return;
		}
		System.out.println("�⺻ ������ ����մϴ�.");
		for(int i=0; i<cnt; i++) {
			pBook[i].showPBookBasic();
			System.out.println("================");
		}
	}
	
//�˻�
	//�迭�� index�� ã��
	public int searchIndex(String name) {
		int index = -1;
		for(int i =0; i<cnt; i++) {
			if(pBook[i].getName().equals(name)) {
				index = i;
			}
		}
		return index;
	}
	//index ���� ���
	public void searchInfor() {
		System.out.println("�˻��� �̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("'"+name+"'�� �������� �ʽ��ϴ�.");
			System.out.println("�޴��� ���ư��ϴ�.");
		} else {
			System.out.println("�˻����======");
			pBook[index].showPBook();
		}
	
	
	
	}
	
	
	
//����
	public void deleteInfor() {
		if(cnt==0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
	System.out.println("������ �̸��� �Է��ϼ���.");	
	String name = sc.nextLine();
	int index = searchIndex(name);
	if(index<0) {
		System.out.println("'"+name+"'�� �������� �ʽ��ϴ�.");
		System.out.println("�޴��� ���ư��ϴ�.");
	}else {
		for(int i=index; i<cnt-1; i++) {
			pBook[i]=pBook[i+1];
		}
		cnt--;
		System.out.println("'"+name+"'�� ������ �����߽��ϴ�.");
	}
	}
	
	
	
}
