package ver05;

public class cafePhoneInfo extends PhoneInfo {
	//��ȣȸ �̸�, �г���
	private String cafeName;
	private String nickName;
	
	//������
	public cafePhoneInfo(String name, String phoneNum, String addr, String email, String cafeName, String nuckName) {
		super(name, phoneNum, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	public String getCafeName() {
		return cafeName;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("��ȣȸ �̸� : " +cafeName);
		System.out.println(" �г���: " + nickName);
	}
	@Override
	public void showBasicInfor() {
		super.showInfor();
	}
	
	

}
