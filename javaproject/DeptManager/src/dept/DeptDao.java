package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO : Data Access Object -> �����ͺ��̽� ó���ϴ� ��ɸ� ������ Ŭ����
public class DeptDao {

	private static DeptDao dao = new DeptDao();
	
	private DeptDao() {
	}
	
	public static DeptDao getInstance() {
		return dao;
	}
	
	

	// �μ� �Է�
	int insertDept(Dept dept, Connection conn) {

		int resultCnt = 0;

		// DB ���� : Connection
		try {
			// Statement
			// SQL : Insert into
			String sql = "insert into dept values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			// sql ����
			resultCnt = pstmt.executeUpdate();

			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// ���
		return resultCnt;

	}

	// �μ� ������ ���� : Dept
	int updateDept(Dept dept, Connection conn) {

		int resultCnt = 0;

		// DB ���� : Connection
		try {
			// Statement
			// SQL : Update
			String sql = "update dept set dname=?, loc=? where deptno=? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(3, dept.getDeptno());
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());

			// sql ����
			resultCnt = pstmt.executeUpdate();

			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// ���
		return resultCnt;

	}

	// �μ����� ����
	int deleteDept(int deptno, Connection conn) {

		int resultCnt = 0;

		// DB ���� : Connection
		try {
			// Statement
			// SQL : delete
			String sql = "delete from dept where deptno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

			// sql ����
			resultCnt = pstmt.executeUpdate();

			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// ���
		return resultCnt;
	}

	// �μ��� ��ü ����Ʈ
	List<Dept> listDept(Connection conn) {

		List<Dept> list = new ArrayList<Dept>();

		Statement stmt = null;

		try {
			stmt = conn.createStatement();

			String sql = "select * from dept order by deptno";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// Dept d = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));
				// list.add(d);
				list.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	// �μ� �ϳ� �˻�
	Dept searchDept(int deptno, Connection conn) {
		
		Dept dept = null;

		Statement stmt = null;

		try {
			stmt = conn.createStatement();

			String sql = "select * from dept where deptno="+deptno;

			ResultSet rs = stmt.executeQuery(sql);

			if(rs.next()) {
				dept = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dept;

	}

}