package com.aia.myopenproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aia.myopenproject.domain.LoginRequest;

@Controller
@RequestMapping("/login/login")
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getLoginForm() {
		return new ModelAndView("login/loginForm");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView login( //데이터를 전송시킬 수 있는 리턴 타입
		@RequestParam("uid") String uid,
		@RequestParam("pw") String pw,
		HttpServletRequest request,
		LoginRequest loginRequest	//로그인 getter setter 들어있음
			) {
		
		System.out.println(loginRequest);
		
		String userId = request.getParameter("uid");
		String userPw = request.getParameter("pw");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/login/login"); //어떤 페이지를 보여줄거니
		mav.addObject("uid",uid);
		mav.addObject("userId",userId);
		mav.addObject("userPw", userPw);
		
		
		return mav;
		
	}
	
	
	
	
}
