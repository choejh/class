package ver04;

public class PhoneUniv extends PhoneInfor {
	//�����߰�
		String major; 
		String year;
		//�����ڸ� ���� �ν��Ͻ� ���� �ʱ�ȭ	
		PhoneUniv(String name, String phoneNumber, String address, String email, String major, String year){
			super(name, phoneNumber, address, email);
			this.major = major;
			this.year = year;
		}
		
		@Override
		public void showInfor() {
			super.showInfor();
			System.out.println("���� : "+ major);
			System.out.println("�г� : "+ year);
		}
	}
		
		