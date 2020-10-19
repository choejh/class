package friend;

public class Friend {
	
//변수 선언 (변수의 직접참조를 막기 위해 private)
	private String name;		//친구의 이름 
	private String phoneNumber;	//전화번호
	private String addr;		//주소


//생성자를 통해서 인스턴스 변수들을 초기화	
	Friend(String name, String pNum, String addr) {
		this.name = name;
		this.phoneNumber = pNum;
		this.addr = addr;
	}
	
//private때문에 하위클래스에서 변수를 불러올 수가 없어서 만듦	
	public String getName() {
		return name;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	public String getaddr() {
		return addr;
	}
	
	
//메서드 오버라이딩 처리: 상속하는 클래스의 추가 속성을 출력	
	public void showData() {
		System.out.println("이름: "+ name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("주소: " + addr);
	}
	
//오버라이딩: 비어있는 처리부를 기능을 추가
	public void showBasicInfo() {}
	
	
}
