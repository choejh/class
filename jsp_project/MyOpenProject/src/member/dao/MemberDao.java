package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import member.Member;

public class MemberDao {

	//싱글톤 패턴: 외부 인스턴스 생성 금지
	//인스턴스가 필요하면 메소드를 이용
	
	//인스턴스 생성 막음
	private MemberDao() {}
	//객체하나 생성 사용
	private static MemberDao dao = new MemberDao();
	//Dao 객체의 참조변수를 반환 : 외부 클래스 누구나 사용 가능
	public static MemberDao getInstance() {
		return dao;
	}
	//Member 테이블의 Data를 CRUD
	
	//INSERT
	public int insertMember(Connection conn, Member member) throws SQLException{
		int resultCnt = 0;
		PreparedStatement pstmt = null;
		String sqlInsert = "INSERT INTO mymember (memberid,password,membername,memberphoto) VALUES(?,?,?,?)";
		
		pstmt = conn.prepareStatement(sqlInsert);
		pstmt.setString(1, member.getUserId());
		pstmt.setString(2, member.getPassword());
		pstmt.setString(3, member.getUserName());
		pstmt.setString(4, member.getUserPhoto());
		
		resultCnt = pstmt.executeUpdate();
		
		return resultCnt;
	}
	
	//로그인을 위한 Select
	public Member selectMemberLogin(Connection conn,String uid, String pw) {
		Member member = null;
		String sqlSelect = "SELECT * FROM mymember where memberid=? and password=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sqlSelect);
			pstmt.setString(1, uid);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member=makeMember(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}
	
	//전체 리스트를 반환하는 select
	public List<Member> selectMember(Connection conn){
		List<Member> list = new ArrayList<Member>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from mymember";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(makeMember(rs));
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private Member makeMember(ResultSet rs) throws SQLException{
		return new Member(
				rs.getString("memberid"),
				rs.getString("password"),
				rs.getString("membername"),
				rs.getString("memberphoto"),
				rs.getTimestamp("regdate")
				);
	}
	
}
