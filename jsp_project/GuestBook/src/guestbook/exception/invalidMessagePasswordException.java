package guestbook.exception;

public class invalidMessagePasswordException extends Exception{

	public invalidMessagePasswordException() {
		super("비밀번호가 일치하지 않습니다.");
	}
	
	
}
