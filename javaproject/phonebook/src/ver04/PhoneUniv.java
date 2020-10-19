package ver04;

public class PhoneUniv extends PhoneInfor {
	//변수추가
		String major; 
		String year;
		//생성자를 통해 인스턴스 변수 초기화	
		PhoneUniv(String name, String phoneNumber, String address, String email, String major, String year){
			super(name, phoneNumber, address, email);
			this.major = major;
			this.year = year;
		}
		
		@Override
		public void showInfor() {
			super.showInfor();
			System.out.println("전공 : "+ major);
			System.out.println("학년 : "+ year);
		}
	}
		
		