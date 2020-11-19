package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMysqlPreparedStatementTest {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			Connection conn = null;
			
			try {
				// 1. ����̹� �ε�
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Load !!!");
				
				// 2. DB ����     localhost == 127.0.0.1
				String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
				String user = "bit";
				String password = "bit";
				
				conn = DriverManager.getConnection(jdbcUrl, user, password);
				System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
				
				// 3.Statement �ν��Ͻ� ����
			//	Statement stmt = conn.createStatement();
				
				System.out.println("�μ��̸��� �Է����ּ���.");
				String userDname = sc.nextLine();
				System.out.println("�μ��� ��ġ�� �Է����ּ���.");
				String userLoc = sc.nextLine();
			// PreparedStatement �ν��Ͻ� ����: sql���� ����ϰ� ����Ѵ�
			String sqlInsert ="insert into dept values (60,?,?)";

				PreparedStatement pstmt = null;
				pstmt = conn.prepareStatement(sqlInsert);
				pstmt.setString(1,userDname);
				pstmt.setString(2, userLoc);
//				
				int resultCnt = pstmt.executeUpdate();
				if(resultCnt>0) { 
					System.out.println("�����Ͱ� ���������� �ԷµǾ����ϴ�.");
				} else {
					System.out.println("������ �Է��� �����ʾҽ��ϴ�.");
				}
				System.out.println("�˻��ϰ��� �ϴ� �μ��� �̸��� �Է����ּ���.");
				String searchDname = sc.nextLine();
				
				
				//�μ� ���� ����Ʈ	
			//String sqlSelect ="select * from dept order by loc";
			String sqlSelect ="select * from dept where dname=? order by loc";
			pstmt = conn.prepareStatement(sqlSelect);
			pstmt.setString(1, searchDname);
			ResultSet rs = pstmt.executeQuery();
				
			if(!rs.next()) {
				System.out.println("�˻��� ����� �����ϴ�.");
			} else {
				do {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\n");
				} 	while(rs.next());
								
			}
			
			rs.close();
			pstmt.close();
			conn.close();		
				
			} catch (ClassNotFoundException e) {
				System.out.println("Driver �ε� ����");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}

	}