package ver05;

import ver03.Util;

public class PhoneBookMain {

	public static void main(String[] args) {
		//�̱������� �ٲ�� ����
		//PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager = PhoneBookManager.getInstance();	//�������� �޴´ٰ�?? 
		
		
		
		while(true) {
			System.out.println("�޴��� �Է����ּ���.==============");
			System.out.println(Menu.INSERT+". ����");
			System.out.println(Menu.SEARCH+". �˻�");
			System.out.println(Menu.DELETE+". ����");
			System.out.println(Menu.DISPLAY_ALL+". ��� ���� ���");
			System.out.println(Menu.EXIT+". EXIT");
			
			System.out.println("\n>>");
			int select = Util.SC.nextInt();
			if(!(select>0 && select<6)) {
				System.out.println("�޴��� ������ �ùٸ��� �ʽ��ϴ�.\n �ٽ� �������ּ���.");
				continue;
			}
			switch (select) {
			case Menu.INSERT:
				manager.insertInfo();
				break;
			case Menu.SEARCH:
				manager.searchInfor();
				break;
			case Menu.DELETE:
				manager.deleteInfor();
				break;
			case Menu.DISPLAY_ALL:
				manager.showAllInfor();			
				break;
			case Menu.EXIT:
				System.out.println("���α׷��� �����մϴ�.");
				return;

			}
		}
		
		
	}

}
