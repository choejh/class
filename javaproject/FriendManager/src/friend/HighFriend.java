package friend;

public class HighFriend extends Friend {
	
	private String work; //����â�� ����
	
//�����ڸ� ���� �ν��Ͻ� ���� �ʱ�ȭ	
	HighFriend(String name, String pNum, String addr, String work){
		super(name, pNum, addr);
		this.work = work;
	}

	@Override
	public void showData() {	//Friend f = new HighFriend() -> f.showData()
		super.showData();
		System.out.println("���� : "+ work);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("�̸� : " +  getName() );
		System.out.println("��ȭ : "+ getphoneNumber());
	
	}
	
	
	

}
