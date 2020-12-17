package form;

//Form에서 전송되는 데이터를 저장하는 beans 정의

public class FormLogin {

	//속성: 변수는 private
	private String id;
	private String pw;
	
	//beans는 컨테이너가 객체를 생성하기 때문에 기본 생성자는 필수
	public FormLogin() {
	}

	public FormLogin(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	//getter/setter메소드 정의
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "FormLogin [id=" + id + ", pw=" + pw + "]";
	}
	
	

	
	
	
	
	
	
	
	
}
