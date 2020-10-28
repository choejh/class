package ver07me;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import ver03.Util;

public class PhoneBookManager implements Util {
	
	List<PhoneInfo> pBook;
	
	// ������ : �̱��� ó�� -> �ܺο��� �ν��Ͻ� ������ ���� 
	private PhoneBookManager(int num){
		pBook = new ArrayList<PhoneInfo>();
		load();
	}
	
	// ���ο��� �ν��Ͻ� ���� 
	private static PhoneBookManager manager = new PhoneBookManager(100);
	
	// �ܺο��� ���������� ���� �� �ִ� �޼���  //getinstance�� �ϳ��� �ν��Ͻ��� ������ �����ؼ� ����.
	//�����ڸ� private�� ������ �ٸ� Ŭ�������� �ش� Ŭ������ �ν��Ͻ��� new�� �������� ���ϰ� �ϰ�, getinstance�Լ��� ���ؼ��� �ν��Ͻ��� ������ �Ѵ�.
	public static PhoneBookManager getInstance() {
		return manager;
	}
	
	// ���� ����
	//   1. �迭�� ���� �޼��� �������� �̿��ؼ� �ϳ��� �޼���� ����  addInfor(����Ŭ����Ÿ���� �Ű�����)
	//   2. ����ڿ��� ���� �����͸� �ν��Ͻ� ���� �޼���
	//      �Է��� ���� -> ���п� ���� �ν��Ͻ� ������ ���� -> addInfor()�޼��带 �̿��ؼ� ���� ����
	
	// �迭�� ��ȭ��ȣ ������ �����ϴ� �޼���
	private void addInfor(PhoneInfo info) {
		//pBook[cnt++] = info;
		
		//List�� ���� ����
		pBook.add(info);
	}
	
	// ��ȭ��ȣ ������ �ν��Ͻ� �����ϰ� �迭�� ����
	public void insertInfo() {
		
		int select =0;
		
		while(true) {
			System.out.println("� ������ �Է��Ͻðڽ��ϱ�?");
			System.out.println(Menu.UNIV+". ����");
			System.out.println(Menu.COM+". ȸ��");
			System.out.println(Menu.CAFE+". ��ȣȸ");
			
			
			try {
			
				select = SC.nextInt();
				
				//
				
				if( !(select>0 && select<4) ) {
					BadInputException e = new BadInputException(String.valueOf(select));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("�߸��� �޴��Է��Դϴ�. �ٽ� �������ּ���");
				SC.nextLine();
				continue;
			}
			break;
		}
		
		SC.nextLine();
		
		System.out.println("���� �Է��� �����մϴ�.");
		System.out.println("�̸� >> ");
		String name = SC.nextLine();
		System.out.println("��ȭ��ȣ >> ");
		String pNum = SC.nextLine();
		System.out.println("�ּ� >> ");
		String addr = SC.nextLine();
		System.out.println("�̸��� >> ");
		String email = SC.nextLine();

		switch(select) {
		
		case Menu.UNIV :
			// �߰� ���� �ް� -> �ν��Ͻ� ���� -> �迭�� ����
			// ����, �г�
			System.out.println("���� >> ");
			String major = SC.nextLine();
			System.out.println("�г� >> ");
			int grade = SC.nextInt();
			addInfor(new univPhoneInfo(name, pNum, addr, email, major, grade));
			
			break;
		case Menu.COM :
			// �߰� ���� �ް� -> �ν��Ͻ� ���� -> �迭�� ����
			// ȸ���̸�
			System.out.println("ȸ�� �̸� >> ");
			String company = SC.nextLine();
			
			addInfor(new CompanyPhoneInfo(name, pNum, addr, email, company));
			
			break;
		case Menu.CAFE :
			System.out.println("��ȣȸ �̸� >> ");
			String cafeName = SC.nextLine();
			System.out.println("�г��� >> ");
			String nickName = SC.nextLine();
			
			addInfor(new cafePhoneInfo(name, pNum, addr, email, cafeName, nickName));
			
			break;
		}
		
		System.out.println("�Է��Ͻ� ������ ����Ǿ����ϴ�. (���� ����: "+pBook.size()+")");
		
	}
	
	
	// ���� �˻�
	// �迭�� index �� ã�� �޼���
	// List�� index ã��
	private int searchIndex(String name) {
		int index = -1;	// ������ ���� ��
		for(int i=0; i<pBook.size() ; i++) {
			// �̸����� ��
			if(pBook.get(i).getName().equals(name)) {   // pBook.get(i) List�� ��� ����
				index = i;
			}
		}
		return index;
	}
	
	// �ش� index�� ���������� ���� ��� : ����ڰ� �Է��� �̸����� �˻�
	public void searchInfor() {
		
		if(pBook.size()==0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		
		SC.nextLine();
		System.out.println("�˻��Ͻ� �̸��� �Է����ּ���.");
		String name = SC.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("�˻��Ͻ� �̸� "+name+"�� ������ �������� �ʽ��ϴ�.");
			System.out.println("�޴��� ���ư��ϴ�.");
		} else {
			System.out.println("�˻� ��� =============");
			pBook.get(index).showInfor();
		}
	}

	
	
	// ����ڿ��� �̸��� �Է� �ް� �̸����� �˻� �� �� ���� ����
	public void deleteInfor() {
		
		if(pBook.size()==0) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		
		SC.nextLine();
		
		System.out.println("�����ϰ��� �ϴ� ������ �̸��� �Է����ּ���. ");
		String name = SC.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("ã���ô� �̸� "+name+"�� ������ �������� �ʽ��ϴ�.");
			System.out.println("�޴��� �̵��մϴ�.");
		} else {
			// List �� ��� ������ �ε����� ����Ʈ�� �̷������.
			pBook.remove(index);
			System.out.println("��û�� �̸��� ������ �����߽��ϴ�.");
		}
		
	}
	
	
	
	
	// ��ü ������ ����ϴ� �޼���
	public void showAllInfor() {
		
		if(pBook.size()==0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
			return;
		}
		
		System.out.println("��ü ��������� �մϴ�. ======================");
		for(int i=0; i<pBook.size() ; i++) {
			pBook.get(i).showInfor();
			System.out.println("--------------------");
		}
	}
	
	
	//List:pBook�� ����Ǿ� �ִ� �ν��Ͻ��� ����
	public void save() {
		if(pBook.size()==0) {
			System.out.println("����� �����Ͱ� ���� ������ ������� �ʽ��ϴ�.");
			return;
		}
	//�ν��Ͻ� ����� ��� ��Ʈ��	
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("phonebookme.ser"));	
		out.writeObject(pBook);
		out.close();
		System.out.println("����Ǿ����ϴ�.");
		} catch (IOException e) {
			System.out.println("����������� ������ �߻��߽��ϴ�. �ٽ� �õ��ϼ���. "+e.getMessage());
		}
	}
	//���α׷����� ������ ���� ������ �ε�
		void load() {
			File file = new File("phonebookme.ser");
			if(file.exists()==false){
		System.out.println("������ �������� �ʽ��ϴ�.");
		return;
	}
			
	try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("phonebookme.ser"));
		pBook = (List<PhoneInfo>) in.readObject();
		System.out.println("������ �ε� �Ϸ�");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("������ �ε� �������� ���� �߻�!");
		}

	
	
      catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("������ �ε� �������� ���� �߻�!");
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("������ �ε� �������� ���� �߻�!");
	}
	
	
	
	
	
}
}