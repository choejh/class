package ver04;

public class PhoneCompany extends PhoneInfor {
//변수추가
	String Company; 
//생성자를 통해 인스턴스 변수 초기화	
	PhoneCompany(String name, String phoneNumber, String address, String email, String Company){
		super(name, phoneNumber, address, email);
		this.Company = Company;
	}
	
	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("회사 : "+ Company);
	}
}
	
	
	
