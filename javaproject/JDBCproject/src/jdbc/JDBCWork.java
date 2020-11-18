package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;		
		PreparedStatement pstmt = null;
//1.����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver load!");
//2. DB ����
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "tiger";

			conn = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("�����ͺ��̽��� �����޽��ϴ�.");
		

		
//3. Statement �ν��Ͻ� ����
		Statement stmt = conn.createStatement();
		
		System.out.println("�����ȣ�� �Է��ϼ���.");
		String userEmpno =  sc.nextLine();
		System.out.println("����̸��� �Է��ϼ���");
		String userEname = sc.nextLine();		
		System.out.println("������ �Է��ϼ���");
		String userJob = sc.nextLine();			
		System.out.println("�Ŵ�����ȣ�� �Է��ϼ���");
		String userMgr =  sc.nextLine();
		System.out.println("�Ի糯¥�� �Է��ϼ���");
		String userHiredate = sc.nextLine();		
		System.out.println("������ �Է��ϼ���");
		String userSal =  sc.nextLine();
		System.out.println("�󿩱��� �Է��ϼ���");
		String userComm =  sc.nextLine();
		System.out.println("�μ���ȣ�� �Է��ϼ���");
		String userDeptno =  sc.nextLine();
	
		
//		1.EMP ���̺� ���ο� ��� ������ �Է��ϴ� ���α׷��� �ۼ��غ���.
		String sqlInsert = "insert into emp values ('"+userEmpno+"','"
				+userEname+"','"+userJob+"','"+userMgr+"','"+userHiredate+
				"','"+userSal+"','"+userComm+
				"','"+userDeptno+"')";
		
		int resultCnt = stmt.executeUpdate(sqlInsert);
		if(resultCnt>0) {
			System.out.println("�����Ͱ� ���������� �ԷµǾ����ϴ�.");
		}
		
	
		
		
		
//		2.EMP ���̺��� ��� �����͸� ����ϴ� ���α׷��� �ۼ��غ���.
		
		String sql = "select * from emp order by empno";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			String empno = rs.getString("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String mgr = rs.getString("mgr");
			String hiredate = rs.getString("hiredate");
			String sal = rs.getString("sal");
			String comm = rs.getString("comm");
			String deptno = rs.getString("deptno");
			System.out.println(empno+"\t"+ename+"\t"+job
					+"\t"+mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno);
			
		}
		rs.close();
		stmt.close();
		conn.close();	
//
//		3.EMP ���̺� �� ��SCOTT�� ����� �޿�(sal) ������ 1000���� �ٲٴ� ���α׷��� �ۼ��غ���.
		String sqlUpdate = "update emp set sal=1000 where ename='SCOTT'";
		int resultCnt2 = stmt.executeUpdate(sqlUpdate);
		if(resultCnt2>0) {
			System.out.println("�����Ͱ� ���������� �����Ǿ����ϴ�.");
		}
		
		
//		4.EMP ���̺� �� ��SCOTT�� �̸����� �˻��� ����� ����ϴ� ���α׷��� �ۼ��غ���.

		System.out.println("�˻��ϰ��� �ϴ� �μ��� �̸��� �Է����ּ���.");
		String searchDname = sc.nextLine();
		String sqlSelect ="select * from EMP where ename=? ";
		pstmt = conn.prepareStatement(sqlSelect);
		pstmt.setString(1, searchDname);
		ResultSet rs1 = pstmt.executeQuery();
		
		if(!rs1.next()) {
			System.out.println("�˻��� ����� �����ϴ�.");
		} else {
			do {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6)+"\t");
				System.out.print(rs.getString(7)+"\t");
				System.out.print(rs.getString(8)+"\n");
				
			} 	while(rs.next());
							
		}
		
		rs1.close();
		pstmt.close();
		conn.close();		
//		5.��� ��������� ����ϵ� �μ������� �Բ� ����ϴ� ���α׷��� �ۼ��غ���.

		
		
		
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			e.printStackTrace();
	}	
	}

}
