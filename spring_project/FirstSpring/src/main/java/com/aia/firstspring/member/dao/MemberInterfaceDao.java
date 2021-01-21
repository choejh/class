package com.aia.firstspring.member.dao;

import java.util.List;

import com.aia.firstspring.member.domain.Member;

public interface MemberInterfaceDao {
//memberinterface_mapper.xml을 위한 인터페이스인줄 알았는데 여기저기서 쓰네(나)
	
	
	//abstract public 생략
	List<Member> selectMemberList();
	int insertMember(Member member);
	int totalCnt();
	Member selectByIdPw();
	Member selectByIdx(int idx);
}
