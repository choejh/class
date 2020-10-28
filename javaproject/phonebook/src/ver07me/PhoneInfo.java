package ver07me;

public abstract class PhoneInfo implements Infor {	//extends Object
	// ģ���� �̸�,��ȭ��ȣ, �ּ�, �̸���
	// ĸ��ȭ : �������� (������ ���� ������ ���� - ���� ��ȣ)
	private String name;		//�̸�
	private String phoneNum;	//��ȭ��ȣ
	private String addr;		//�ּ�
	private String email;		//�̸���
	public PhoneInfo(String name, String phoneNum, String addr, String email) { //��+��+s
		super();	//Object Ŭ������ �����ڸ� ȣ�� //��������
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
		this.email = email;
	}
	
	//getter/setter �޼��� 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
 @Override
	//���� ��� ��� : ���� Ŭ�������� �������̵� �ϴ� ����
	public void showInfor() {
		System.out.println("�̸�:"+name);
		System.out.println("��ȭ:"+phoneNum);
		System.out.println("�ּ�:"+addr);
		System.out.println("�̸���:"+email);
	}

 	//�߻�޼��� void showBasicInfor()	����� ������. 
 
}
