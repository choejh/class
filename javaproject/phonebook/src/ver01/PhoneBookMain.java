package ver01;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneInfor pi1 = new PhoneInfor("�����", "010-0000-0000", "1990.10.12");
		pi1.showInfor(); // �������� pi1�� ����Ű�� PhoneInfor Ÿ�� ��ü�� �޼��� ȣ��
		
		PhoneInfor pi2 = new PhoneInfor("������", "010-1111-1111");
		pi2.showInfor();
		

	}

}