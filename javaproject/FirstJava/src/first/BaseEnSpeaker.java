package first;

public class BaseEnSpeaker extends Speaker{

	private int baseRate;
	
	public void setBaseRate(int base) {
		baseRate = base;
	}
	
	// �������̵� : 
	// ��Ӱ��迡�� ��ӹ��� �޼��带
	// ����δ� �����ϰ� �ϰ� ó���θ� �� �����ϴ°�
	@Override	// ������̼� : �ڹ��� Ű����� �ƴϴ�. �ּ��� �ƴϴ�. �߰����� �ǹ̸� �ο��Ѵ�.
	public void showCurrentState() {
		super.showCurrentState();
		System.out.println("���̽� ũ�� : " + baseRate);
	}
	

	
	
	
	
	
	
	
	
}