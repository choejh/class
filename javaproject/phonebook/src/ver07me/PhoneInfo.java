package ver07me;

public abstract class PhoneInfo implements Infor {	//extends Object
	// 친구의 이름,전화번호, 주소, 이메일
	// 캡슐화 : 정보은닉 (변수에 직접 접근을 제한 - 변수 보호)
	private String name;		//이름
	private String phoneNum;	//전화번호
	private String addr;		//주소
	private String email;		//이메일
	public PhoneInfo(String name, String phoneNum, String addr, String email) { //컨+쉬+s
		super();	//Object 클래스의 생성자를 호출 //생략가능
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
		this.email = email;
	}
	
	//getter/setter 메서드 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
 @Override
	//정보 출력 기능 : 하위 클래스에서 오버라이딩 하는 목적
	public void showInfor() {
		System.out.println("이름:"+name);
		System.out.println("전화:"+phoneNum);
		System.out.println("주소:"+addr);
		System.out.println("이메일:"+email);
	}

 	//추상메서드 void showBasicInfor()	멤버로 가진다. 
 
}
