package ver04;

import java.util.Scanner;

import ver03.Util;

public class PhoneBookManager {
//��ȭ��ȣ�� �����ϴ� �迭
	private PhoneInfor[] phoneInfor; //��ȭ��ȣ�� ���� ���� �迭
	private int num; //����� ������ ���� 
	
//�����ڷ�	�ʱ�ȭ
	public PhoneBookManager (int num) {
		phoneInfor = new PhoneInfor[num];
		num = 0;
	}
	
//�迭�� ģ�� ������ �����ϴ� ���: �������� �̿��� �Ű����� ����
	void addPhoneInfo(PhoneInfor p) {
		phoneInfor[num++] = p;
	}
	
//����:1 ȸ��:2 ����:3
void addPhone(int choice) {
		
		//����ڷκ��� �⺻ ������ �Է¹��� 
		Scanner sc = new Scanner(System.in); // ��Ʈ�� ����Ʈ o
		System.out.println("��ȭ��ȣ�� �Է��� �����մϴ�.");
		System.out.println("�̸��� �Է����ּ��� >> ");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է����ּ���>> ");
		String pNum = sc.nextLine();
		System.out.println("�ּҸ� �Է����ּ���>> ");
		String addr = sc.nextLine();
		System.out.println("�̸��ϸ� �Է����ּ���>> ");
		String email = sc.nextLine();

		//�ν��Ͻ� ����
		if (choice==1) {
			addPhoneInfo(new PhoneInfor(name, pNum, addr, email));
		}
		
		else if (choice==2) {
		//���� ģ�� ������ �ް� �ν��Ͻ� ���� -> �迭�� ����
			System.out.println("������ �Է����ּ��� >> ");
			String major = sc.nextLine();
			System.out.println("�г��� �Է����ּ��� >> ");
			String year = sc.nextLine();
			addPhoneInfo(new PhoneUniv(name, pNum, addr, email, major, year));
		}
		
		else if (choice==3){
		//ȸ�� ��� ������ �ް� �ν��Ͻ����� -> �迭�� ����
		System.out.println("ȸ�������� �Է����ּ��� >> ");
		String Company = sc.nextLine();
		addPhoneInfo(new PhoneCompany(name, pNum, addr, email, Company));
		}
		
		else if (choice==4) {
		//������ �����͸� �ް� �ν��Ͻ� ���� -> �迭�� ����	
			System.out.println("���̸� �Է����ּ��� >> ");
			String age = sc.nextLine();
			addPhoneInfo(new PhoneCompany(name, pNum, addr, email, age));
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.\n");
		}	
		
}		
		//��ü ������ ����ϴ� �޼��� : showInfor() -> �迭 �̿�
		void showInfor() {
			System.out.println("��ü �����͸� ����մϴ�.==============");
			for(int i=0; i<num;i++) {
				phoneInfor[i].showInfor();
				System.out.println("------------------");
			}
		}
		
		

		
// ���� �˻�

		void searchMember () { 
			if(num==0) {
				System.out.println("����� ������ �����ϴ�. �ٽ� �޴��� �̵��մϴ�.");
				return;
			}
			//ã���� �ϴ� �̸��� �޴´�.
			System.out.println("���� �˻��� �����մϴ�.");
			System.out.println("ã���� �ϴ� �̸��� �Է����ּ���. : ");
			String name = Util.sc.nextLine();
			
			//�̸��� ��� index �˻�
			int index = searchIndex(name);
			
			if(index<0) {
			System.out.println("ã���ô� �̸��� ������ �������� �ʽ��ϴ�.");
			} else {
				//�������
				phoneInfor[index].showInfor();
			}
		}
		//�̸� ���ڿ��� �޾Ƽ�, 
		//�迭�� ������ ���ϰ�,
		//index�� ã�Ƽ� ��ȯ�ϴ� �޼���
		int searchIndex(String name) {
			int result= -1;
			
			//�˻�: index�� ã�´�.
			for(int i=0; i<=num;i++) {
				if(phoneInfor[i].getName().equals(name)) {
					result=i;
					break;
				}
			}
			
			
			return result;
		}
		
	///////////////////////////////////////////////////
		
//���� ����

		void deleteMember() {
			
			if (num == 0) {
				System.out.println("��ϵ� ������ �����ϴ�.");
				return;
			}

			System.out.println("���� ������ �����մϴ�.");
			System.out.println("���� �ϰ��� �ϴ� ������ �̸��� �Է����ּ���.");
			String name = Util.sc.nextLine();

			// �̸��� ��� index �˻�
			int index = searchIndex(name);

			if (index < 0) {
				System.out.println("���� �ϰ��� �ϴ� ������ �������� �ʽ��ϴ�.");
			} else {

				for (int i = index; i < num - 1; i++) {
					phoneInfor[i] = phoneInfor[i + 1];
				}

				num--;

				System.out.println("������ ���� �߽��ϴ�.");
			}

		}
		
		
		
		
		
		
		
		
		
}

