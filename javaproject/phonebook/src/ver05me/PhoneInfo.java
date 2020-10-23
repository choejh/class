package ver05me;

public abstract class PhoneInfo implements Info {
//변수 정의 - 다른데서 수정하지 못하게 private
	private String name="";
	private String birth="";
	private String pNum="";
	private String addr="";
	
//생성자 만들기 	
	public PhoneInfo (String name, String birth, String pNum, String addr) {
		this.name=name;
		this.birth=birth;
		this.pNum=pNum;
		this.addr=addr;
	}

//getter/setter만들기
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public void showPBook() {
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+pNum);
		System.out.println("주소:"+addr);
		System.out.println("생일:"+birth);
	}

	@Override
	public void showPBookBasic() {
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+pNum);
	}
	
	
	
	
	
	
}
