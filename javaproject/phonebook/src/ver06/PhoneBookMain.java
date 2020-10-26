package ver06;

import java.util.InputMismatchException;

import ver03.Util;

public class PhoneBookMain implements Util {

	public static void main(String[] args) {
		
		//PhoneBookManager manager = new PhoneBookManager(10);
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		while(true) {
			System.out.println("�޴��� �Է����ּ���. ================");
			System.out.println(Menu.INSERT+". ����");
			System.out.println(Menu.SEARCH+". �˻�");
			System.out.println(Menu.DELETE+". ����");
			System.out.println(Menu.DISPLAY_ALL+". ��� ���� ���");
			System.out.println(Menu.EXIT+". EXIT");
			
			System.out.println("\n>> ");
			
			int select = 0;
			
			try {
			
				select = SC.nextInt();
			
				if(!(select>0 && select<6)) {
					//System.out.println("�޴��� ������ �ǹٸ��� �ʽ��ϴ�.\n�ٽ� �������ּ���.");
					//Exception e = new Exception("�߸��� �޴� �Է�");
					BadInputException e = new BadInputException(String.valueOf(select));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("�޴��Է��� �߸��Ǿ����ϴ�.");
				SC.nextLine();
				continue;
			} catch (Exception e1) {
				System.out.println("�޴��Է��� �߸��Ǿ����ϴ�.");
				SC.nextLine();
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
				System.out.println("���α׷��� �����մϴ�. ");
				return;
			}
			
			
			
			
		}
		
		
		

	}

}