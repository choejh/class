package ver05me;

public class CompanyPhoneInfo extends PhoneInfo {

//��������
	
	private String company="";

//������	
	public CompanyPhoneInfo(String name, String birth, String pNum, String addr, String company) {
		super(name, birth, pNum, addr);
		this.company=company;
	}


//get/set - private���� ����
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}


//�������̵�

	@Override
	public void showPBook() {
		// TODO Auto-generated method stub
		super.showPBook();
		System.out.println("ȸ���:"+company);
	}


	@Override
	public void showPBookBasic() {
		// TODO Auto-generated method stub
		super.showPBookBasic();
		System.out.println("ȸ���:"+company);
	}

	
	
	
	
	
	
	
}
