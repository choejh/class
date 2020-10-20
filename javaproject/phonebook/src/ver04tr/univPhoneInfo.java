package ver04tr;

public class univPhoneInfo extends PhoneInfo {
	// ����ģ��:����, �г�
	private String major;	//����
	private int grade;		//�г�
	
	
	//������: ���� Ŭ������ ������ ȣ��, �߰��� ������ �ʱ�ȭ
	public univPhoneInfo(String name, String phoneNum, String addr, String email, String major, int grade) {
		//���� Ŭ������ ������ ȣ�� : ����Ŭ������ ������� �ʱ�ȭ
		super(name, phoneNum, addr, email);
		//���� �߰��� ��� ���� �ʱ�ȭ
		this.major = major;
		this.grade = grade;
	}


	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("����: "+ major);
		System.out.println("�г�: "+ grade);
	}

	
	
	
	
}