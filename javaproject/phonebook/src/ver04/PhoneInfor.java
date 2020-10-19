package ver04;

public class PhoneInfor {

	// 변수 설정
	private String name;		// 친구의 이름
	private String phoneNumber;	// 전화번호
	private String address;	// 생일
	private String email;
	
	// 생성자 : 세개의 데이터를 받아 초기화
	PhoneInfor(String name, String phoneNumber, String address, String email){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	public String getaddr() {
		return address;
	}
		
	public String getemail() {
		return email;
	}
	
	
	
	// 저장된 데이터의 적절한 출력 메서드
	void showInfor() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("주소 : "+ address);
		System.out.println("이메일 : " + email);
	}
	
	
	
	
	
	
}