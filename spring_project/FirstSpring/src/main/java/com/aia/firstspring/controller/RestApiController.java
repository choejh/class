package com.aia.firstspring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aia.firstspring.domain.MemberRegRequest;
import com.aia.firstspring.member.domain.Member;
import com.aia.firstspring.member.service.MemberListService;
import com.aia.firstspring.member.service.MemberRegService;
import com.aia.firstspring.member.service.MemberRestService;

@RestController
@RequestMapping("/rest/ver1/members")
public class RestApiController {
	
	@Autowired
	private MemberRestService restService; 
	
	@Autowired
	private MemberListService listService;
	@Autowired
	private MemberRegService regService;
	
//	@GetMapping("/{idx}") //GET /rest/ver1/members/39 
	//@GetMapping 
//	public String getRest(
//		@PathVariable("idx") int idx
//		){
//		return "@RestController 사용한 응답 처리"+idx;
//	}
	
	@GetMapping	// /get/ber1/members/members
	public List<Member> getMemberList(){
		return listService.getMemberList();
	}
	
	@GetMapping("/map")	// /get/ber1/members/map
	public Map<Integer,Member> getMemberListMap(){
		Map<Integer, Member> memberMap = new HashMap<Integer, Member>();
		for (Member member : listService.getMemberList()) {
			memberMap.put(member.getIdx(), member);
		} 
		return memberMap;
	}
	
	
	@GetMapping("/{idx}") 
	public Member getMemberInfo(
			@PathVariable("idx") int idx //경로에서 가져와서 처리해준다?
			) {
		return restService.getMember(idx); //select by idx로 반환??
		
	}
	//@RequestMapping(method=RequestMethod.POST)
	@PostMapping //위와 같다.
	public String insertMember(
			@RequestBody MemberRegRequest regRequest 
			) {
		
		//String result = "N";
		
		System.out.println(regRequest);
		System.out.println(regRequest.getToMember());
		
		//regservice.insertMember(regRequest.getTomember());
		
		return regService.insertMember(regRequest.getToMember())>0 ? "Y" : "N";
		
	}
	
	
}
