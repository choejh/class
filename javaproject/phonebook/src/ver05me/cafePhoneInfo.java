package ver05me;

public class cafePhoneInfo extends PhoneInfo {
//���� ����
	private String cafeName ="";
	
//������
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





//�������̵�
	@Override
	public void showPBook() {
		super.showPBook();
		System.out.println("��ȣȸ��:"+cafeName);
	}

	@Override
	public void showPBookBasic() {
		super.showPBookBasic();
		System.out.println("��ȣȸ��:"+cafeName);
	}	
}

