package dept;

import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {

		DeptManager manager = new DeptManager();

		Scanner sc = new Scanner(System.in);

		// ������ ���̽� ����̹� �ε�
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			while(true) {

				System.out.println("�μ����� �޴��� �Է����ּ���.");
				System.out.println("1. �Է�, 2. ����, 3.����, 4. ��ü����Ʈ, 5. �˻�, 6. ����");
				System.out.println("__________________________________________________");

				String select = sc.nextLine();

				switch (select.charAt(0)) {
				case '1':
					manager.insertDept();
					break;
				case '2':
					manager.editDept();
					break;
				case '3':
					manager.delDept();
					break;
				case '4':
					manager.listDept();
					break;
				case '5':
					manager.searchDept();
					break;
				case '6':
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}