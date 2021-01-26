package com.aia.op;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok~

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapps/WEB-INF/spring/root-context.xml")
//@Log4j
public class DataSourceTest {

	//@Autowired
	//@Setter(onMethod_= {@Autowired})
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testmybatis() {
		
		try(SqlSession session = sqlSessionFactory.openSession(); 
			Connection con = session.getConnection();){
			
			System.out.println(session);
			System.out.println(con);
			
		} catch (Exception e) {
			fail(e.getMessage());
		}
		
		
	}
	
	@Test
	public void testConnection() {
		
		try(Connection con = dataSource.getConnection();){
			log.info(con);
			System.out.println("!!!! Connection:" + con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
