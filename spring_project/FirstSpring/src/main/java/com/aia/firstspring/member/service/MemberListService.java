package com.aia.firstspring.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.firstspring.member.dao.MemberDao;
import com.aia.firstspring.member.domain.Member;

@Service
public class MemberListService {
	@Autowired
	MemberDao dao;
	
//	public MemberListService(MemberDao dao) {
//		this.dao = dao;
//	}
	
	public List<Member> getMemberList(){
		return dao.selectMemberList();	//MemberDao에서 가져옴. 전부출력을 위해
	}
	
	public int getmemberTotalCount() {
		return dao.selectTotalCount();
	}
	
	
}
