package ver04;

public class PhoneFamilyInfor extends PhoneInfor {

	//�����߰�
	String age; 

	//�����ڸ� ���� �ν��Ͻ� ���� �ʱ�ȭ	
	PhoneFamilyInfor(String name, String phoneNumber, String address, String email, String age){
		super(name, phoneNumber, address, email);
		this.age = age;
	}
	
	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("����  : "+ age);
	}
}
	