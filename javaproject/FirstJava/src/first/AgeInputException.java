//1021 ��Ʈ A
package first;

public class AgeInputException extends Exception {

	private int age ;
	
	public AgeInputException(int age) {
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�."); 
		//Exception Ŭ������ �����ڷ� ���޵Ǵ� ���ڿ��� getMessage �޼ҵ� ȣ�� �� ��ȯ�Ǵ� ���ڿ��̴�! 
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeInputException [age=" + age + ", getMessage()=" + getMessage() + "]";
	}
	
	
	

}

