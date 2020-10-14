package ver02;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		// ����ڿ��� �����͸� �޴´�.
		Scanner s = new Scanner(System.in);
		
		while(true) {
			// �ν��Ͻ� ������ ���ؼ��� �̸�, ��ȭ��ȣ, ���� �����͸� �޴´�.
			System.out.println("������ ���� �����͸� �Է����ּ���.");
			System.out.println("�̸��� �Է����ּ���");
			String name = s.nextLine();
			
			System.out.println("��ȭ��ȣ�� �Է����ּ���.");
			String phoneNumber = s.nextLine();
			
			System.out.println("������ �Է����ּ���.");
			String birthday = s.nextLine();  // "   "
			
			// �ν��Ͻ� ����
			PhoneInfor infor = null;
			
			// trim() -> "    12 3       ".trim() -> "12 3" 
			
			// �Է°� ���� enter �ΰ�� ���� ���ڿ��� ��ȯ
			// ���ڿ��� ���̰� 0 �̸�
			//if(birthday.length()==0) { // "     ".trim() -> ""
			if(birthday.trim().isEmpty()) {  // length() == 0 => true
				infor = new PhoneInfor(name, phoneNumber, null);
			} else {
				infor = new PhoneInfor(name, phoneNumber, birthday);
			}
			
			// �޼��� ȣ��
			infor.showInfor();
		}
		
		
		
		
		

	}

}