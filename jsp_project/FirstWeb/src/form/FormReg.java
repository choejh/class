package form;
//Form에서 전송되는 데이터를 저장하는 beans 정의

public class FormReg {
	//속성: 변수는 private
	private String id;
	private String pw;
	private String name;
		
	//beans는 컨테이너가 객체를 생성하기 때문에 기본 생성자는 필수
	public FormReg() {
	}

	public FormReg(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	//getter/setter
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FormReg [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	
	
		
}
