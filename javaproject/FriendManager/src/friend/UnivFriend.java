package friend;

public class UnivFriend extends Friend{

	private String major;	//ģ���� ����
	
//�����ڸ� �̿��ؼ� �ʱ�ȭ	
	public UnivFriend(String name, String pNum, String addr, String major) {
		super(name, pNum, addr);
		this.major = major;
	}
//�������̵�
	public void showData() {
		super.showData();
		System.out.println("���� : " + major);
	}
	
//�������̵�
	public void showBasicInfo() {
		System.out.println("�̸�: " + getName());
		System.out.println("��ȭ: " + getphoneNumber());
		System.out.println("����: " + major);
	}
		
}
	

