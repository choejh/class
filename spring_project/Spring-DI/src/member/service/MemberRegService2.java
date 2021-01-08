package member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import member.dao.Dao;
import member.dao.MemberDao;

public class MemberRegService2 implements MemberService {


	@Autowired(required = false)
	@Qualifier("member")
	//@Qualifier("guest")
	private Dao dao;
	
	@Override
	public Object process() {
		System.out.println("MemberRegService 실행");
		
		dao.insert();
		
		return null;
	}

}
