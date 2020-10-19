package ver04;

public class PhoneFamilyInfor extends PhoneInfor {

	//변수추가
	String age; 

	//생성자를 통해 인스턴스 변수 초기화	
	PhoneFamilyInfor(String name, String phoneNumber, String address, String email, String age){
		super(name, phoneNumber, address, email);
		this.age = age;
	}
	
	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("나이  : "+ age);
	}
}
	