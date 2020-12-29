package member.model;

public class LoginInfo {
	private String memberId;
	private String memberName;
	private String memberPhoto;
	
	public LoginInfo(String memberId, String memberName, String memberPhoto) {
		this.memberId=memberId;
		this.memberName=memberName;
		this.memberPhoto=memberPhoto;
	
	}
	//게터만
	public String getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberPhoto() {
		return memberPhoto;
	}
	
	
	//디버깅용?
	@Override
	public String toString() {
		return "Logininfo [memberId=" + memberId + ", memberName=" + memberName + ", memberPhoto=" + memberPhoto + "]";
	}
	
	
	
	
	
}
