package first;

public class overridingMain {

	public static void main(String[] args) {
		
		//BaseEnSpeaker bs = new BaseEnSpeaker();
		
		//bs.showCurrentState();
		
		// ������
		// ����Ŭ���� Ÿ���� ���������� �ڼ�Ŭ����Ÿ���� �ν��Ͻ��� �����Ҽ� �ִ°�
		// ���������� �ش� Ÿ���� ����� ����ϰڴ� ��� ����
		Speaker s = new BaseEnSpeaker();
		// �������� s�� volumeRate ������ showCurrentState(), setVolume()�� ����ϰڴ�
		
		// Speaker Ŭ������ ������ ���
		s.setVolume(10);
		
		// BaseEnSpeaker�� ������ ���
		//s.setBaseRate(20);
		
		// BaseEnSpeaker �������̵��� �޼��尡 ȣ��ȴ�.
		s.showCurrentState();
	
		
		
		
		

	}

}