package ver04tr;

import ver03.Util;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager(100);
		
		while(true) {
			System.out.println("�޴��� �Է����ּ���.==============");
			System.out.println("1. ����");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			System.out.println("4. ��� ���� ���");
			System.out.println("5. EXIT");
			
			System.out.println("\n>>");
			int select = Util.sc.nextInt();
			if(!(select>0 && select<6)) {
				System.out.println("�޴��� ������ �ùٸ��� �ʽ��ϴ�.\n �ٽ� �������ּ���.");
				continue;
			}
			switch (select) {
			case 1:
				manager.insertInfo();
				break;
			case 2:
				manager.searchInfor();
				break;
			case 3:
				manager.deleteInfor();
				break;
			case 4:
				manager.showAllInfor();			
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;

			}
		}
		
		
	}

}
