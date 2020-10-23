package ver05me;

public class UnivPhoneInfo extends PhoneInfo {

//��������
	private String major ="";
//������
	public UnivPhoneInfo(String name, String birth, String pNum, String addr, String major) {
		super(name, birth, pNum, addr);
		this.major=major;
	}
	
//get set
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	
	
//�������̵�	
	@Override
	public void showPBook() {
		super.showPBook();
		System.out.println("����:"+major);
	}

	@Override
	public void showPBookBasic() {
		super.showPBookBasic();
		System.out.println("����:"+major);
	}		

	
	
	
}
