package friend;

public class Friend {
	
//���� ���� (������ ���������� ���� ���� private)
	private String name;		//ģ���� �̸� 
	private String phoneNumber;	//��ȭ��ȣ
	private String addr;		//�ּ�


//�����ڸ� ���ؼ� �ν��Ͻ� �������� �ʱ�ȭ	
	Friend(String name, String pNum, String addr) {
		this.name = name;
		this.phoneNumber = pNum;
		this.addr = addr;
	}
	
//private������ ����Ŭ�������� ������ �ҷ��� ���� ��� ����	
	public String getName() {
		return name;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	public String getaddr() {
		return addr;
	}
	
	
//�޼��� �������̵� ó��: ����ϴ� Ŭ������ �߰� �Ӽ��� ���	
	public void showData() {
		System.out.println("�̸�: "+ name);
		System.out.println("��ȭ��ȣ: " + phoneNumber);
		System.out.println("�ּ�: " + addr);
	}
	
//�������̵�: ����ִ� ó���θ� ����� �߰�
	public void showBasicInfo() {}
	
	
}
