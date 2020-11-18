package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCOracleConnectionTest {
	public static void main(String[] args) {
			
			Connection conn = null;
			
			try {
				// 1. ����̹� �ε�
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Oracle Driver Load !!!");
				
				// 2. DB ����     localhost == 127.0.0.1
				String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
				String user = "scott";
				String password = "tiger";
				
				conn = DriverManager.getConnection(jdbcUrl, user, password);
				System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
				
				// ..........
				
				
				
				conn.close();		
				
			} catch (ClassNotFoundException e) {
				System.out.println("Driver �ε� ����");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			 
			
			
			
		}

	}