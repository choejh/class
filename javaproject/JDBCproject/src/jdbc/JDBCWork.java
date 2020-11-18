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
//1.드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver load!");
//2. DB 연결
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "tiger";

			conn = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("데이터베이스에 접속햇습니다.");
		

		
//3. Statement 인스턴스 생성
		Statement stmt = conn.createStatement();
		
		System.out.println("사원번호를 입력하세요.");
		String userEmpno =  sc.nextLine();
		System.out.println("사원이름을 입력하세요");
		String userEname = sc.nextLine();		
		System.out.println("직무를 입력하세요");
		String userJob = sc.nextLine();			
		System.out.println("매니저번호을 입력하세요");
		String userMgr =  sc.nextLine();
		System.out.println("입사날짜를 입력하세요");
		String userHiredate = sc.nextLine();		
		System.out.println("월급을 입력하세요");
		String userSal =  sc.nextLine();
		System.out.println("상여금을 입력하세요");
		String userComm =  sc.nextLine();
		System.out.println("부서번호를 입력하세요");
		String userDeptno =  sc.nextLine();
	
		
//		1.EMP 테이블에 새로운 사원 정보를 입력하는 프로그램을 작성해보자.
		String sqlInsert = "insert into emp values ('"+userEmpno+"','"
				+userEname+"','"+userJob+"','"+userMgr+"','"+userHiredate+
				"','"+userSal+"','"+userComm+
				"','"+userDeptno+"')";
		
		int resultCnt = stmt.executeUpdate(sqlInsert);
		if(resultCnt>0) {
			System.out.println("데이터가 정상적으로 입력되었습니다.");
		}
		
	
		
		
		
//		2.EMP 테이블의 모든 데이터를 출력하는 프로그램을 작성해보자.
		
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
//		3.EMP 테이블에 서 “SCOTT” 사원의 급여(sal) 정보를 1000으로 바꾸는 프로그램을 작성해보자.
		String sqlUpdate = "update emp set sal=1000 where ename='SCOTT'";
		int resultCnt2 = stmt.executeUpdate(sqlUpdate);
		if(resultCnt2>0) {
			System.out.println("데이터가 정상적으로 수정되었습니다.");
		}
		
		
//		4.EMP 테이블에 서 “SCOTT” 이름으로 검색한 결과를 출력하는 프로그램을 작성해보자.

		System.out.println("검색하고자 하는 부서의 이름을 입력해주세요.");
		String searchDname = sc.nextLine();
		String sqlSelect ="select * from EMP where ename=? ";
		pstmt = conn.prepareStatement(sqlSelect);
		pstmt.setString(1, searchDname);
		ResultSet rs1 = pstmt.executeQuery();
		
		if(!rs1.next()) {
			System.out.println("검색의 결과가 없습니다.");
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
//		5.모든 사원정보를 출력하되 부서정보를 함께 출력하는 프로그램을 작성해보자.

		
		
		
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
	}	
	}

}
