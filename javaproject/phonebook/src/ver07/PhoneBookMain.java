package ver07;

import java.util.InputMismatchException;

import ver03.Util;

public class PhoneBookMain implements Util , Menu{

	public static void main(String[] args) {
		
		//PhoneBookManager manager = new PhoneBookManager(10);
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		while(true) {
			System.out.println("�޴��� �Է����ּ���. ================");
			System.out.println(INSERT+". ����");
			System.out.println(SEARCH+". �˻�");
			System.out.println(DELETE+". ����");
			System.out.println(DISPLAY_ALL+". ��� ���� ���");
			System.out.println(SAVE+". ��� ���� ����(file ����)");
			System.out.println(EXIT+". EXIT");
			
			System.out.println("\n>> ");
			
			int select = 0;
			
			try {
			
				select = SC.nextInt();
			
				if(!(select>0 && select<7)) {
					//System.out.println("�޴��� ������ �ùٸ��� �ʽ��ϴ�.\n�ٽ� �������ּ���.");
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
			case INSERT:
				manager.insertInfo();
				break;
			case SEARCH:
				manager.searchInfor();
				break;
			case DELETE:
				manager.deleteInfor();
				break;
			case DISPLAY_ALL:
				manager.showAllInfor();
				break;
			case SAVE:
				manager.save();
				break;
			case EXIT:
				System.out.println("���α׷��� �����մϴ�. ");
				return;
			}
			
			
			
			
		}
		
		
		

	}

}