//1021 세트 A
package first;

public class AgeInputException extends Exception {

	private int age ;
	
	public AgeInputException(int age) {
		super("유효하지 않은 나이가 입력되었습니다."); 
		//Exception 클래스의 생성자로 전달되는 문자열이 getMessage 메소드 호출 시 반환되는 문자열이다! 
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeInputException [age=" + age + ", getMessage()=" + getMessage() + "]";
	}
	
	
	

}

