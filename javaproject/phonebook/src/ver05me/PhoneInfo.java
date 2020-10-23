package ver05me;

public abstract class PhoneInfo implements Info {
//���� ���� - �ٸ����� �������� ���ϰ� private
	private String name="";
	private String birth="";
	private String pNum="";
	private String addr="";
	
//������ ����� 	
	public PhoneInfo (String name, String birth, String pNum, String addr) {
		this.name=name;
		this.birth=birth;
		this.pNum=pNum;
		this.addr=addr;
	}

//getter/setter�����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public void showPBook() {
		System.out.println("�̸�:"+name);
		System.out.println("��ȭ��ȣ:"+pNum);
		System.out.println("�ּ�:"+addr);
		System.out.println("����:"+birth);
	}

	@Override
	public void showPBookBasic() {
		System.out.println("�̸�:"+name);
		System.out.println("��ȭ��ȣ:"+pNum);
	}
	
	
	
	
	
	
}
