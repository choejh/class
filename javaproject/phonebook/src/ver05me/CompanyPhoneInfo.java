package ver05me;

public class CompanyPhoneInfo extends PhoneInfo {

//변수선언
	
	private String company="";

//생성자	
	public CompanyPhoneInfo(String name, String birth, String pNum, String addr, String company) {
		super(name, birth, pNum, addr);
		this.company=company;
	}


//get/set - private선언 때문
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}


//오버라이딩

	@Override
	public void showPBook() {
		// TODO Auto-generated method stub
		super.showPBook();
		System.out.println("회사명:"+company);
	}


	@Override
	public void showPBookBasic() {
		// TODO Auto-generated method stub
		super.showPBookBasic();
		System.out.println("회사명:"+company);
	}

	
	
	
	
	
	
	
}
