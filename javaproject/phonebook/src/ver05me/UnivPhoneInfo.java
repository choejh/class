package ver05me;

public class UnivPhoneInfo extends PhoneInfo {

//변수선언
	private String major ="";
//생성자
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

	
	
//오버라이딩	
	@Override
	public void showPBook() {
		super.showPBook();
		System.out.println("전공:"+major);
	}

	@Override
	public void showPBookBasic() {
		super.showPBookBasic();
		System.out.println("전공:"+major);
	}		

	
	
	
}
