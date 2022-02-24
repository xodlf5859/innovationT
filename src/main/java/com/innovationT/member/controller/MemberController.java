package com.innovationT.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.innovationT.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping("/selectMember")
	public ModelAndView member(ModelAndView mnv) throws Exception{
		
		mnv.setViewName("jsp");
		
		return mnv;
	}
}
