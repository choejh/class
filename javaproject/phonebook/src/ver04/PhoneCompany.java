package ver04;

public class PhoneCompany extends PhoneInfor {
//�����߰�
	String Company; 
//�����ڸ� ���� �ν��Ͻ� ���� �ʱ�ȭ	
	PhoneCompany(String name, String phoneNumber, String address, String email, String Company){
		super(name, phoneNumber, address, email);
		this.Company = Company;
	}
	
	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("ȸ�� : "+ Company);
	}
}
	
	
	
