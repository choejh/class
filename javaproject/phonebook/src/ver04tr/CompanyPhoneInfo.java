package ver04tr;

public class CompanyPhoneInfo extends PhoneInfo {

	//ȸ���̸�
	private String company;
	
	//������
	public CompanyPhoneInfo(String name, String phoneNum, String addr, String email, String company) {
		//���� Ŭ������ ������ ȣ��
		super(name, phoneNum, addr, email);
		//ȸ���̸� �ʱ�ȭ
		this.company = company;
	
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("ȸ��:"+company);
	}

	
	
	
	
}
