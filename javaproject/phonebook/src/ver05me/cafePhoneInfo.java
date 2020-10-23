package ver05me;

public class cafePhoneInfo extends PhoneInfo {
//변수 정의
	private String cafeName ="";
	
//생성자
	public cafePhoneInfo(String name, String birth, String pNum, String addr, String cafeName) {
		super(name, birth, pNum, addr);
		this.cafeName=cafeName;			
	}
	
	
//get/set	
	public String getCafeName() {
			return cafeName;
		}
	public void setCafeName(String cafeName) {
			this.cafeName = cafeName;
		}





//오버라이딩
	@Override
	public void showPBook() {
		super.showPBook();
		System.out.println("동호회명:"+cafeName);
	}

	@Override
	public void showPBookBasic() {
		super.showPBookBasic();
		System.out.println("동호회명:"+cafeName);
	}	
}

